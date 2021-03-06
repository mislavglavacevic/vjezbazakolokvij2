/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.view;

import ffos.controller.ObradaOperater;
import ffos.model.Operater;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author tjakopec
 */
public class FormaOperateri extends javax.swing.JFrame {

    private ObradaOperater obrada;
    private Operater operater;

    /**
     * Creates new form FormaOperateri
     */
    public FormaOperateri() {
        initComponents();
        obrada = new ObradaOperater();
        ucitaj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtOsoba = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUvjet = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstOperateri = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        txtLokacija = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDatum = new javax.swing.JTextField();
        txtTemperatura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Temperatura");

        jLabel5.setText("Osoba");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        jLabel1.setText("Uvjet");

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUvjetKeyReleased(evt);
            }
        });

        lstOperateri.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstOperateriValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstOperateri);

        jLabel2.setText("Lokacija");

        jLabel3.setText("Datum mjerenja");

        txtDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtUvjet, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtLokacija)
                            .addComponent(jLabel3)
                            .addComponent(txtDatum)
                            .addComponent(jLabel4)
                            .addComponent(txtOsoba)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addGap(29, 29, 29)
                                .addComponent(btnPromjeni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtTemperatura))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLokacija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOsoba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi)))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void txtUvjetKeyReleased(java.awt.event.KeyEvent evt) {                                     
        trazi(txtUvjet.getText());
    }                                    

    private void lstOperateriValueChanged(javax.swing.event.ListSelectionEvent evt) {                                          
        if (evt.getValueIsAdjusting()) {
            return;
        }

        operater = (Operater) lstOperateri.getSelectedValue();
        if (operater == null) {
            return;
        }
        txtLokacija.setText(operater.getLokacija());
        txtDatum.setText(operater.getDatum_mjerenja()+ "");
        txtTemperatura.setText(operater.getTemperatura() + "");
        txtOsoba.setText(operater.getOsoba());
        


    }                                         

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {                                         
        operater = new Operater();
         SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
         df.setLenient(false);
         operater.setLokacija(txtLokacija.getText());
        try {
            operater.setDatum_mjerenja(df.parse(txtDatum.getText()));
        } catch (ParseException ex) {
            JOptionPane.showConfirmDialog(getRootPane(), "Niste unijeli dobar datum");
        }
        operater.setTemperatura(Integer.parseInt(txtTemperatura.getText()));
       operater.setOsoba(txtOsoba.getText());
        
        obrada.dodajOperatera(operater);
        ucitaj();
    }                                        

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {                                            
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        df.setLenient(false);
        operater.setLokacija(txtLokacija.getText());
        try {
            operater.setDatum_mjerenja(df.parse(txtDatum.getText()));
        } catch (ParseException ex) {
            JOptionPane.showConfirmDialog(getRootPane(), "Niste unijeli dobar datum");
        }
        operater.setTemperatura(Integer.parseInt(txtTemperatura.getText()));
       operater.setOsoba(txtOsoba.getText());
        

        obrada.promijeniOperatera(operater);
        ucitaj();
    }                                           

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {                                          

        obrada.obrisiOperatera(operater);
        ucitaj();
    }                                         

    private void txtDatumActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstOperateri;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtLokacija;
    private javax.swing.JTextField txtOsoba;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration                   

    private void ucitaj() {
        DefaultListModel<Operater> m = new DefaultListModel<>();
        obrada.getOperateri().stream().forEach((o) -> {
            m.addElement(o);
        });
        lstOperateri.setModel(m);
    }

    private void trazi(String uvjet) {
        DefaultListModel<Operater> m = new DefaultListModel<>();
        obrada.getOperateri(uvjet).stream().forEach((o) -> {
            m.addElement(o);
        });
        lstOperateri.setModel(m);
    }
}
