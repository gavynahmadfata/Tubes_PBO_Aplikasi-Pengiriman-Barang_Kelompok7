package ViewController;

import Database.Database;
import Model.Admin;
import Model.Barang;
import Model.Kurir;
import Model.OngkirDalamKota;
import Model.OngkirLuarKota;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

public class menuAdmin extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form menuAdmin2
     * @param admin
     */
    public menuAdmin(Admin admin) {
        initComponents();
        keluar.addActionListener(this);
        try {
            comboKurir.setModel(Database.showKurirBoxModel());
            listBarang.setModel(Database.showListBarang());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "gagal memuat");
        }
        simpan.addActionListener(this);
        kirim.addActionListener(this);
        edit.addActionListener(this);
        
        ongkirluar.setText(String.valueOf(OngkirLuarKota.ongkir));
        ongkirdalam.setText(String.valueOf(OngkirDalamKota.ongkir));
        beratluar.setText(String.valueOf(OngkirLuarKota.hargaBerat));
        beratdalam.setText(String.valueOf(OngkirDalamKota.hargaBerat));
        listBarang.addListSelectionListener((ListSelectionEvent ex) -> {
            
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        keluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ongkirdalam = new javax.swing.JTextField();
        ongkirluar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listBarang = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        status_barang = new javax.swing.JTextField();
        status_pembayaran = new javax.swing.JTextField();
        kirim = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        hapus = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        comboKurir = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        beratdalam = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        beratluar = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        berat = new javax.swing.JLabel();
        tgl_pemesanan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        keluar.setText("Keluar");

        jLabel2.setText("Ongkir Dalam");

        jLabel3.setText("Ongkir Luar");

        jLabel14.setFont(new java.awt.Font("NewsGoth Lt BT", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Set Ongkir");

        jLabel15.setFont(new java.awt.Font("NewsGoth Lt BT", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Daftar Barang");

        listBarang.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listBarang);

        jLabel1.setText("Id Barang");

        jLabel4.setText("Berat");

        jLabel5.setText("Status Barang");

        jLabel6.setText("Status Pembayaran");

        jLabel7.setText("Tanggal Pemesanan");

        id.setText(" ");

        kirim.setText("Kirim ke kurir");

        jLabel8.setText("Pilih Kurir");

        hapus.setText("Hapus Barang");

        edit.setText("Edit Barang");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        comboKurir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Harga Berat");

        jLabel10.setText("Harga Berat");

        simpan.setText("Simpan Harga");

        berat.setText(" ");

        tgl_pemesanan.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(kirim))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(keluar))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(status_barang)
                            .addComponent(status_pembayaran)
                            .addComponent(comboKurir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(berat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tgl_pemesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ongkirdalam, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(16, 16, 16)
                                .addComponent(ongkirluar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beratdalam)
                            .addComponent(beratluar)))
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ongkirdalam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(beratdalam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ongkirluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(beratluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(simpan)
                .addGap(25, 25, 25)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(berat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(status_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(status_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tgl_pemesanan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboKurir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kirim)
                    .addComponent(hapus)
                    .addComponent(edit))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(keluar))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBarangMouseClicked
        // TODO add your handling code here:
        Barang barang = null;
        try {
            barang = Database.getListBarang().get(listBarang.getSelectedIndex());
        } catch (SQLException ex1) {
            JOptionPane.showMessageDialog(rootPane, "gagal memuat");
        }
        id.setText(String.valueOf(barang.getId_barang()));
        berat.setText(String.valueOf(barang.getBerat()));
        status_barang.setText(barang.getStatus());
        status_pembayaran.setText(barang.getStatus_pembayaran());
        tgl_pemesanan.setText(String.valueOf(barang.getTgl_pemesanan()));
        hapus.addActionListener(this);
    }//GEN-LAST:event_listBarangMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

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
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new menuAdmin(null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel berat;
    private javax.swing.JTextField beratdalam;
    private javax.swing.JTextField beratluar;
    private javax.swing.JComboBox<String> comboKurir;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton kirim;
    private javax.swing.JList<String> listBarang;
    private javax.swing.JTextField ongkirdalam;
    private javax.swing.JTextField ongkirluar;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField status_barang;
    private javax.swing.JTextField status_pembayaran;
    private javax.swing.JLabel tgl_pemesanan;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==keluar){
            RegstrasiLogin frame = new RegstrasiLogin();
            frame.setVisible(true);
            this.setVisible(false);
        } else if(e.getSource()==simpan){
            try {
                Database.updateOngkir();
                Database.getOngkir();
                ongkirluar.setText(String.valueOf(OngkirLuarKota.ongkir));
                ongkirdalam.setText(String.valueOf(OngkirDalamKota.ongkir));
                beratluar.setText(String.valueOf(OngkirLuarKota.hargaBerat));
                beratdalam.setText(String.valueOf(OngkirDalamKota.hargaBerat));
                JOptionPane.showMessageDialog(rootPane, "Harga Ongkir berhasil berubah");
            } catch (NumberFormatException|SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Harga Ongkir gagal berubah");
            }
        } else if(e.getSource()==hapus){
            int i = listBarang.getSelectedIndex();
            try {
                Database.deleteBarang(i);
                JOptionPane.showMessageDialog(rootPane, "Berhasil menghapus");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Gagal menghapus");
            }
            
        } else if(e.getSource()==edit){
            try {
                Barang barang = Database.getListBarang().get(listBarang.getSelectedIndex());
                barang.setStatus(status_barang.getText());
                barang.setStatus_pembayaran(status_pembayaran.getText());
                Database.editBarang(barang);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "gagal edit");
            }
        } else if(e.getSource()==kirim){
            try {
                Barang barang = Database.getListBarang().get(listBarang.getSelectedIndex());
                Kurir kurir = Database.getListKurir().get(comboKurir.getSelectedIndex());
                barang.setKurir(kurir);
                barang.setStatus("Dibawa kurir");
                Database.editBarang(barang);
                JOptionPane.showMessageDialog(rootPane, "berhasil dikirim ke kurir");
            } catch (ArrayIndexOutOfBoundsException | SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "gagal kirim ke kurir");
            }
        }
        try {
            comboKurir.setModel(Database.showKurirBoxModel());
            listBarang.setModel(Database.showListBarang());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "gagal memuat");
        }
        try {
            listBarang.setModel(Database.showListBarang());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "gagal memuat");
        }
    }
}
