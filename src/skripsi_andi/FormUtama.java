/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsi_andi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
/**
 *
 * @author USER
 */
public class FormUtama extends javax.swing.JFrame {
    Connection koneksi;
    ResultSet hasil;
    PreparedStatement proses;
    Statement stmn;
    /**
     * Creates new form FormUtama
     */
    public FormUtama() {
        initComponents();
        try{
            String sqlproduct = "SELECT SUM(qty_product) FROM product";
            koneksi = KoneksiDB.ConnectDb();
            proses = koneksi.prepareStatement(sqlproduct);
            hasil = proses.executeQuery(sqlproduct);
            while(hasil.next()){
                String id = hasil.getString("SUM(qty_product)");
            txtJmlProduct.setText(id);    
            System.out.println("test"+id);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "GAGAL Menampilkan ke table!");
        }
        try{
            String sqlproduct = "SELECT SUM(qty_product) FROM pemasukan";
            koneksi = KoneksiDB.ConnectDb();
            proses = koneksi.prepareStatement(sqlproduct);
            hasil = proses.executeQuery(sqlproduct);
            while(hasil.next()){
                String id = hasil.getString("SUM(qty_product)");
            txtJmlProductMasuk.setText(id);    
            System.out.println("test"+id);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "GAGAL Menampilkan ke table!");
        }
        try{
            String sqlproduct = "SELECT SUM(qty_product) FROM pengeluaran";
            koneksi = KoneksiDB.ConnectDb();
            proses = koneksi.prepareStatement(sqlproduct);
            hasil = proses.executeQuery(sqlproduct);
            while(hasil.next()){
                String id = hasil.getString("SUM(qty_product)");
            txtJmlProductKeluar.setText(id);    
            System.out.println("test"+id);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "GAGAL Menampilkan ke table!");
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtJmlProductMasuk = new javax.swing.JTextField();
        txtJmlProductKeluar = new javax.swing.JTextField();
        txtJmlProduct = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        MenuLaporan = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuProductParent = new javax.swing.JMenu();
        MenuProduct = new javax.swing.JMenuItem();
        MenuProductMasuk = new javax.swing.JMenuItem();
        MenuProductKeluar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rak Inventory");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Product ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Product Masuk");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Product Keluar");

        txtJmlProductMasuk.setEditable(false);
        txtJmlProductMasuk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtJmlProductMasuk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJmlProductMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJmlProductMasukActionPerformed(evt);
            }
        });

        txtJmlProductKeluar.setEditable(false);
        txtJmlProductKeluar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtJmlProductKeluar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJmlProductKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJmlProductKeluarActionPerformed(evt);
            }
        });

        txtJmlProduct.setEditable(false);
        txtJmlProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJmlProductActionPerformed(evt);
            }
        });

        MenuLaporan.setText("File");
        MenuLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLaporanActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Laporan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuLaporan.add(jMenuItem1);

        jMenuBar2.add(MenuLaporan);

        MenuProductParent.setText("Product");
        MenuProductParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProductParentActionPerformed(evt);
            }
        });

        MenuProduct.setText("Product");
        MenuProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProductActionPerformed(evt);
            }
        });
        MenuProductParent.add(MenuProduct);

        MenuProductMasuk.setText("Product Masuk");
        MenuProductMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProductMasukActionPerformed(evt);
            }
        });
        MenuProductParent.add(MenuProductMasuk);

        MenuProductKeluar.setText("Product Keluar");
        MenuProductKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProductKeluarActionPerformed(evt);
            }
        });
        MenuProductParent.add(MenuProductKeluar);

        jMenuBar2.add(MenuProductParent);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(txtJmlProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(txtJmlProductMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtJmlProductKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJmlProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtJmlProductMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtJmlProductKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLaporanActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FormLaporan().setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_MenuLaporanActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MenuProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProductActionPerformed
             java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FormProduct().setVisible(true);
                dispose();
            }
        });  
    }//GEN-LAST:event_MenuProductActionPerformed

    private void MenuProductKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProductKeluarActionPerformed
            java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FormProductKeluar().setVisible(true);
                dispose();
            }
        });  
    }//GEN-LAST:event_MenuProductKeluarActionPerformed

    private void txtJmlProductMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJmlProductMasukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJmlProductMasukActionPerformed

    private void txtJmlProductKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJmlProductKeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJmlProductKeluarActionPerformed

    private void MenuProductParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProductParentActionPerformed
          java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FormProductKeluar().setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_MenuProductParentActionPerformed

    private void MenuProductMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProductMasukActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FormProductMasuk().setVisible(true);
                dispose();
            }
        });        
    }//GEN-LAST:event_MenuProductMasukActionPerformed

    private void txtJmlProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJmlProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJmlProductActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuLaporan;
    private javax.swing.JMenuItem MenuProduct;
    private javax.swing.JMenuItem MenuProductKeluar;
    private javax.swing.JMenuItem MenuProductMasuk;
    private javax.swing.JMenu MenuProductParent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField txtJmlProduct;
    private javax.swing.JTextField txtJmlProductKeluar;
    private javax.swing.JTextField txtJmlProductMasuk;
    // End of variables declaration//GEN-END:variables
}