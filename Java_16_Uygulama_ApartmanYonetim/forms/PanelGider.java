/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ays.forms;

import com.ays.databaseop.DBConn;
import com.ays.entity.Gider;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**

 @author metin
 */
@SuppressWarnings("all")
public class PanelGider extends javax.swing.JPanel {

    private ArrayList<String> PROKodlar;

    /**
     Creates new form PanelGiderEkle
     */
    public PanelGider () {
        initComponents();
        cmbGiderKod.setModel(getModelGiderler());
    }

    /**
     This method is called from within the constructor to
     initialize the form.
     WARNING: Do NOT modify this code. The content of this method is
     always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSec = new javax.swing.JLabel();
        cmbGiderKod = new javax.swing.JComboBox();
        lblKod = new javax.swing.JLabel();
        txtKod = new javax.swing.JTextField();
        lblAd = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        btnKaydet = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();

        lblSec.setText("Sec");

        cmbGiderKod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGiderKodActionPerformed(evt);
            }
        });

        lblKod.setText("Kod");

        lblAd.setText("Ad");

        btnKaydet.setText("Kaydet");
        btnKaydet.setPreferredSize(new java.awt.Dimension(60, 28));
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        btnSil.setText("Sil");
        btnSil.setPreferredSize(new java.awt.Dimension(60, 28));
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKod, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSec, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbGiderKod, 0, 152, Short.MAX_VALUE)
                    .addComponent(txtAd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKod, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbGiderKod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        // TODO add your handling code here:
        if (cmbGiderKod.getSelectedIndex() != 0) { // Eger combobox ta <yeni> secili degilse mevcut kayitlardan biri secilidir.
            int onay = JOptionPane.showConfirmDialog(btnKaydet, "Sectiginiz \"Gider\" türü silinecektir!\nEminmisiniz ?", "Silme Onayi", 0, 0);
            if (onay == 0) {
                new DBConn().deleteGider(new Gider(txtKod.getText(), txtKod.getText(), txtAd.getText()));
            }
            cmbGiderKod.setModel(getModelGiderler());
            txtAd.setText("");
            txtKod.setText("");
        } else {
            MainFrame.durumMesaji("Silmek icin bir gider secmelisiniz!");
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        // TODO add your handling code here:
        if (!txtKod.getText().equals("") && !txtAd.getText().equals("")) { // ALANLAR BOS OLMAMALI

            if (cmbGiderKod.getSelectedIndex() != 0) {
                new DBConn().updateGider(new Gider(PROKodlar.get(cmbGiderKod.getSelectedIndex()), txtKod.getText(), txtAd.getText()));
            } else {
                new DBConn().insertGider(new Gider(txtKod.getText(), txtAd.getText()));
            }

            // ISLEM BITINCE
            cmbGiderKod.setModel(getModelGiderler());

        } else {
            JOptionPane.showMessageDialog(null, "Yeni kayit icin \"Gider Kodu\" ve \"Gider Adi\" girilmelidir!");
        } // END IF
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void cmbGiderKodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGiderKodActionPerformed
        // TODO add your handling code here:
        Gider gider = new DBConn().getGider(cmbGiderKod.getSelectedItem().toString().substring(0, 2));
        if (gider.getAd() != null) {
            txtKod.setText(gider.getKod());
            txtAd.setText(gider.getAd());
        }
    }//GEN-LAST:event_cmbGiderKodActionPerformed

    private DefaultComboBoxModel getModelGiderler () {
        // Bu metod PanelDaireGuncelle.java ekranindaki cmbDaireNo'nun icini doldurmak icindir.
        ArrayList<Gider> giderler = new DBConn().getAllGider();
        PROKodlar = new ArrayList<String>();
        PROKodlar.add(" ");
        for (Gider d : giderler) {
            PROKodlar.add(d.getPROkod().toString());
        }
        DefaultComboBoxModel cmbxModel = new DefaultComboBoxModel(giderler.toArray());
        return cmbxModel;
        // alternatif : return new DBConn().getAllGider().toArray();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnSil;
    private javax.swing.JComboBox cmbGiderKod;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblKod;
    private javax.swing.JLabel lblSec;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtKod;
    // End of variables declaration//GEN-END:variables
}
