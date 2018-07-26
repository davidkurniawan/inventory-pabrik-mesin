/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsi_andi;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static java.time.LocalTime.now;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class FormProductKeluar extends javax.swing.JFrame {
        Connection koneksi;
        ResultSet hasil;
        PreparedStatement proses;
    /**
     * Creates new form FormProductKeluar
     */
    public FormProductKeluar() {
        initComponents();
        getData();
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
        txtkode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtkurir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpenerima = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtbiaya = new javax.swing.JTextField();
        btnsubmit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tableoutbound = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tableoutbound2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BtnSubmitBond = new javax.swing.JButton();
        txtharga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnewqty = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtKodeSurat = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
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
        jLabel1.setText("OutBound");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Kode Product");

        txtkode.setEditable(false);
        txtkode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nama Product");

        txtnama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("QTY");

        txtqty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtyActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Kurir");

        txtkurir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtkurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkurirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Penerima");

        txtpenerima.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Biaya");

        txtbiaya.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        Tableoutbound.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tableoutbound.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Product", "Nama Product", "Penerima", "Kurir", "Tujuan", "QTY", "Harga "
            }
        ));
        Tableoutbound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableoutboundMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tableoutbound);

        jScrollPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane4MouseClicked(evt);
            }
        });

        Tableoutbound2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tableoutbound2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tableoutbound2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tableoutbound2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Tableoutbound2);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Tujuan");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        BtnSubmitBond.setText("Input Data Dan Print");
        BtnSubmitBond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitBondActionPerformed(evt);
            }
        });

        txtharga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Harga Product");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("QTY");

        jLabel11.setText("(Yang Diambil)");

        txtKodeSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeSuratActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Kode Surat Jalan");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtKodeSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(BtnSubmitBond)
                                .addGap(41, 41, 41)
                                .addComponent(btnsubmit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(28, 28, 28))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(txtpenerima)
                                            .addComponent(txtkode)
                                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtkurir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtnama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel10))
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel11)
                                                .addGap(30, 30, 30)
                                                .addComponent(txtnewqty, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtbiaya, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtqty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtpenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtkurir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(txtnewqty, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))))
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtbiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsubmit)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnSubmitBond, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtKodeSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                       
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    new FormLaporan().setVisible(true);
                    dispose();
                }
            });
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MenuLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLaporanActionPerformed
       
    }//GEN-LAST:event_MenuLaporanActionPerformed

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

    private void txtkurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkurirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkurirActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        DefaultTableModel model = (DefaultTableModel)Tableoutbound.getModel();
        String kode = this.txtkode.getText();
        String nama = this.txtnama.getText(); 
        int j = Integer.parseInt(txtqty.getText());
        String kurir = this.txtkurir.getText();
        String penerima = this.txtpenerima.getText();
        String biaya = this.txtbiaya.getText();
        String tujuan = this.jTextArea1.getText();
        String Harga = this.txtharga.getText();
        int k = Integer.parseInt(txtnewqty.getText());
        
        int qtybaru ;
        qtybaru = j-k;
        model.addRow(new Object[]{kode,nama,penerima,kurir,tujuan,qtybaru,Harga});
        for(int i = 0; i < Tableoutbound.getRowCount();i++){
            int y = Tableoutbound.getRowCount();
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void TableoutboundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableoutboundMouseClicked
        // TODO add your handling code here:
        int selectedRow = Tableoutbound.getSelectedRow();
    }//GEN-LAST:event_TableoutboundMouseClicked

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void Tableoutbound2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tableoutbound2MouseClicked
        int selectedRow = Tableoutbound2.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)Tableoutbound2.getModel();
        txtkode.setText(model.getValueAt(selectedRow, 0).toString());
        txtnama.setText(model.getValueAt(selectedRow, 1).toString());
        txtqty.setText(model.getValueAt(selectedRow, 5).toString());
        txtharga.setText(model.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_Tableoutbound2MouseClicked

    private void jScrollPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane4MouseClicked

    private void BtnSubmitBondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitBondActionPerformed
//        Connection koneksi = null;
//        Statement stmt = null;
        try {
            LocalDateTime now = LocalDateTime.now();
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String tglkeluar = now.format(formatter);
            Connection koneksi = KoneksiDB.ConnectDb();
            Statement stmt = koneksi.createStatement();
            stmt.executeUpdate("INSERT INTO surat_jalan (`kode_surat_jalan`,`biaya`,`kurir`,`tgl_keluar`,`penerima`,`tujuan`) values ('"+txtKodeSurat.getText()+"','"+txtbiaya.getText()+"','"+txtkurir.getText()+"','"+tglkeluar+"','"+txtpenerima.getText()+"','"+jTextArea1.getText()+"')");
            for(int i = 0 ; i <  Tableoutbound.getRowCount(); i++){
            stmt.executeUpdate("UPDATE `product` SET `qty_product`='"+Integer.parseInt(Tableoutbound.getModel().getValueAt(i,5).toString())+"' WHERE `kode_product`='"+(String)Tableoutbound.getModel().getValueAt(i,0)+"'");    
            stmt.executeUpdate("INSERT INTO `pengeluaran`(`kode_product`, `nama_product`,`penerima`,`kurir`, `kode_surat_jalan`,`Tujuan`, `biaya`, `tgl_keluar`, `qty_product`,`harga_product`) VALUES ('"+(String)Tableoutbound.getModel().getValueAt(i,0)+"','"+(String)Tableoutbound.getModel().getValueAt(i,1)+"','"+(String)Tableoutbound.getModel().getValueAt(i,2)+"','"+(String)Tableoutbound.getModel().getValueAt(i,3)+"','"+txtKodeSurat.getText()+"','"+(String)Tableoutbound.getModel().getValueAt(i,4)+"','"+txtbiaya.getText()+"','"+tglkeluar+"','"+Integer.parseInt(Tableoutbound.getModel().getValueAt(i,5).toString())+"','"+Integer.parseInt(Tableoutbound.getModel().getValueAt(i,6).toString())+"')");
            }
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DI TAMBAHKAN KE DATABASE!");
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BtnSubmitBondActionPerformed

    private void txtqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtyActionPerformed

    private void txtKodeSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeSuratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeSuratActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtkode.setText("");
        txtpenerima.setText("");
        jTextArea1.setText("");
        txtharga.setText("");
        txtKodeSurat.setText("");
        txtnama.setText("");
        txtkurir.setText("");
        txtqty.setText("");
        txtnewqty.setText("");
        txtbiaya.setText("");
        for (int i = 0; i < Tableoutbound.getRowCount(); i++){
            for(int j = 0; j < Tableoutbound.getColumnCount(); j++) {
                Tableoutbound.setValueAt("", i, j);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(FormProductKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProductKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProductKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProductKeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProductKeluar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSubmitBond;
    private javax.swing.JMenu MenuLaporan;
    private javax.swing.JMenuItem MenuProduct;
    private javax.swing.JMenuItem MenuProductKeluar;
    private javax.swing.JMenuItem MenuProductMasuk;
    private javax.swing.JMenu MenuProductParent;
    private javax.swing.JTable Tableoutbound;
    private javax.swing.JTable Tableoutbound2;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtKodeSurat;
    private javax.swing.JTextField txtbiaya;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtkurir;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnewqty;
    private javax.swing.JTextField txtpenerima;
    private javax.swing.JTextField txtqty;
    // End of variables declaration//GEN-END:variables

    private void getData(){
      DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Product");
        model.addColumn("Nama Product");
        model.addColumn("Brand Product");
        model.addColumn("Category");
        model.addColumn("Harga");
        model.addColumn("QTY");
    
    try{
            String sql = "SELECT * FROM product";
            koneksi = KoneksiDB.ConnectDb();
            proses = koneksi.prepareStatement(sql);
            hasil = proses.executeQuery(sql);
            while(hasil.next()){
                model.addRow(new Object[]{hasil.getString(2),hasil.getString(3),hasil.getString(4),hasil.getString(5),hasil.getString(6),hasil.getString(7)});
                
                }
            Tableoutbound2.setModel(model);
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "GAGAL Menampilkan ke table!");
        }
    }
}
