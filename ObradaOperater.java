/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ffos.model.Operater;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 *
 * @author tjakopec
 */
public class ObradaOperater {

    private static final String PUTANJA_API = "http://it.ffos.hr/P320182019/mglavacevic/temp/api/";
    //private static final String PUTANJA_API = "http://192.168.192.12/P11617/tjakopec/P3/Programiranje3API/";
    private final Gson gson;

    public ObradaOperater() {
        gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    }

    public List<Operater> getOperateri() {
        return gson.fromJson(getAPI("mjerenja", null, "GET"), new TypeToken<List<Operater>>() {
        }.getType());
    }

    public List<Operater> getOperateri(String uvjet) {
        return gson.fromJson(getAPI("search/" + uvjet, null, "GET"), new TypeToken<List<Operater>>() {
        }.getType());
    }

    //nije potrebno, imam u listi cijeli objekt
    public Operater getOperater(int sifra) {
        return gson.fromJson(getAPI(("mjerenja/" + sifra), null, "GET"),Operater.class);
    }

    public boolean dodajOperatera(Operater o) {
        return getAPI("novoMjerenje", o, "POST").equals("OK");
    }

    public boolean promijeniOperatera(Operater o) {
        return getAPI("promijeniMjerenje", o, "POST").equals("OK");
    }

    public boolean obrisiOperatera(Operater o) {
         return getAPI("obrisiMjerenje", o, "POST").equals("OK");
    }

    private String getAPI(String ruta, Operater o, String metoda) {
        try {
            URL url = new URL(PUTANJA_API + ruta);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(metoda);
            connection.setDoInput(true);
            connection.setDoOutput(true);

            connection.connect();
            
            if (o != null) {
                String json="";
                switch(ruta){
                    case "novoMjerenje":
                        json=new GsonBuilder().setExclusionStrategies(new IzdvojiZaInsert()).create().toJson(o);
                        break;
                    case "promijeniMjerenje":
                        json = gson.toJson(o);
                        break;
                    case "obrisiMjerenje":
                        json=new GsonBuilder().setExclusionStrategies(new IzdvojiZaDelete()).create().toJson(o);
                        break;
                }
                OutputStream os = connection.getOutputStream();
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
                pw.write(json);
                pw.close();
            }

            InputStream is = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            is.close();
            String response = sb.toString();
            return response;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
