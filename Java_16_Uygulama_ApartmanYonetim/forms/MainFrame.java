/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ays.forms;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author metin
 */
@SuppressWarnings("all")
public class MainFrame extends javax.swing.JFrame {

	/**
	 * Creates new form MainFrame
	 */
	public MainFrame() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT
	 * modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("all")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		desktopPane = new javax.swing.JDesktopPane();
		lblDurum = new javax.swing.JLabel();
		menuBar = new javax.swing.JMenuBar();
		menuProgram = new javax.swing.JMenu();
		jmHakkinda = new javax.swing.JMenuItem();
		jmCikis = new javax.swing.JMenuItem();
		menuTanimla = new javax.swing.JMenu();
		jmKisi = new javax.swing.JMenuItem();
		jmGider = new javax.swing.JMenuItem();
		jmDaire = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Apartman Yonetim 1.0");
		setResizable(false);

		lblDurum.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
		lblDurum.setText("Heyo!");
		desktopPane.add(lblDurum);
		lblDurum.setBounds(10, 430, 600, 16);
		desktopPane.setLayer(lblDurum, javax.swing.JLayeredPane.DRAG_LAYER);

		menuProgram.setMnemonic('f');
		menuProgram.setText("Program");

		jmHakkinda.setMnemonic('a');
		jmHakkinda.setText("Hakkinda");
		jmHakkinda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmHakkindaActionPerformed(evt);
			}
		});
		menuProgram.add(jmHakkinda);

		jmCikis.setMnemonic('x');
		jmCikis.setText("Cikis");
		jmCikis.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmCikisActionPerformed(evt);
			}
		});
		menuProgram.add(jmCikis);

		menuBar.add(menuProgram);

		menuTanimla.setText("Tanimla");

		jmKisi.setText("Kisi");
		jmKisi.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmKisiActionPerformed(evt);
			}
		});
		menuTanimla.add(jmKisi);

		jmGider.setText("Gider");
		jmGider.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmGiderActionPerformed(evt);
			}
		});
		menuTanimla.add(jmGider);

		jmDaire.setText("Daire");
		jmDaire.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmDaireActionPerformed(evt);
			}
		});
		menuTanimla.add(jmDaire);

		menuBar.add(menuTanimla);

		setJMenuBar(menuBar);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 616,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 455,
				Short.MAX_VALUE));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void jmCikisActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jmCikisActionPerformed
		System.exit(0);
	}// GEN-LAST:event_jmCikisActionPerformed

	private void jmDaireActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jmDaireActionPerformed
		// TODO add your handling code here:
		this.desktopPane.add(new JIFrame(260, 360, new PanelDaire(), "Daire Tanimla"));
	}// GEN-LAST:event_jmDaireActionPerformed

	private void jmHakkindaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jmHakkindaActionPerformed
		// TODO add your handling code here:
		JOptionPane.showMessageDialog(null, this.getTitle());
	}// GEN-LAST:event_jmHakkindaActionPerformed

	private void jmGiderActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jmGiderActionPerformed
		// TODO add your handling code here:
		desktopPane.add(new JIFrame(230, 170, new PanelGider(), "Gider Tanimlama"));
	}// GEN-LAST:event_jmGiderActionPerformed

	private void jmKisiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jmKisiActionPerformed
		// TODO add your handling code here:
		desktopPane.add(new JIFrame(320, 355, new PanelKisi(), "Kisi Tanimlama"));
	}// GEN-LAST:event_jmKisiActionPerformed

	public static void durumMesaji(String mesaj) {
		lblDurum.setText(mesaj);
	}

	/**
	 * @param args
	 *           the command line arguments
	 */
	public static void main(String args[]) {
		try {
			/* Set the Nimbus look and feel */
			// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
			/*
			 * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and
			 * feel. For details see
			 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
			 */

			javax.swing.UIManager.setLookAndFeel(ch.randelshofer.quaqua.QuaquaManager.getLookAndFeel());
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
		}

		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JDesktopPane desktopPane;
	private javax.swing.JMenuItem jmCikis;
	private javax.swing.JMenuItem jmDaire;
	private javax.swing.JMenuItem jmGider;
	private javax.swing.JMenuItem jmHakkinda;
	private javax.swing.JMenuItem jmKisi;
	public static javax.swing.JLabel lblDurum;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JMenu menuProgram;
	private javax.swing.JMenu menuTanimla;
	// End of variables declaration//GEN-END:variables

}
