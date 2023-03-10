package ViewController;

import Database.Database;
import Model.Admin;
import Model.Kurir;
import Model.Pengirim;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegstrasiLogin extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form RegstrasiLogin
     */
    public RegstrasiLogin() {
        initComponents();
        register.addActionListener(this);
        login.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        radioPengirim = new javax.swing.JRadioButton();
        radioKurir = new javax.swing.JRadioButton();
        radioAdmin = new javax.swing.JRadioButton();
        register = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel14.setFont(new java.awt.Font("NewsGoth Lt BT", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Selamat Datang!");

        buttonGroup1.add(radioPengirim);
        radioPengirim.setSelected(true);
        radioPengirim.setText("Pengiirm");

        buttonGroup1.add(radioKurir);
        radioKurir.setText("Kurir");

        buttonGroup1.add(radioAdmin);
        radioAdmin.setText("Admin");

        register.setText("Register");

        login.setText("Login");

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(register)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(login))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(radioPengirim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioKurir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioAdmin)))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPengirim)
                    .addComponent(radioKurir)
                    .addComponent(radioAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register)
                    .addComponent(login))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegstrasiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegstrasiLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton login;
    private javax.swing.JRadioButton radioAdmin;
    private javax.swing.JRadioButton radioKurir;
    private javax.swing.JRadioButton radioPengirim;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!(jTextField1.getText().equals("")||jPasswordField1.getText().equals(""))){
            Dialog dialog;
            Frame frame;
            if (radioPengirim.isSelected()){
                Pengirim pengirim;
                if (e.getSource()==register){
                    pengirim = new Pengirim(jTextField1.getText(), jPasswordField1.getText());
                    dialog = new RegisterPengirim(this, rootPaneCheckingEnabled, pengirim);
                    dialog.setVisible(true);
                } else if(e.getSource()==login){
                    try {
                        pengirim = Database.getListPengirim().stream().filter((t) -> jTextField1.getText().equals(t.getUsername())&&jPasswordField1.getText().equals(t.getPassword())).findFirst().orElse(null);
                        if (pengirim==null){
                            throw new NullPointerException();
                        }
                        frame = new menuPengirim(pengirim);
                        frame.setVisible(true);
                        this.setVisible(false);
                    } catch (NullPointerException|SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, "gagal login");
                    }
                }
                
            } else if(radioKurir.isSelected()){
                Kurir kurir;
                if (e.getSource()==register){
                    kurir = new Kurir(jTextField1.getText(), jPasswordField1.getText());
                    dialog = new RegisterKurir(this, rootPaneCheckingEnabled, kurir);
                    dialog.setVisible(true);
                } else if(e.getSource()==login){
                    try {
                        kurir = Database.getListKurir().stream().filter((t) -> jTextField1.getText().equals(t.getUsername())&&jPasswordField1.getText().equals(t.getPassword())).findFirst().orElse(null);
                        if (kurir==null){
                            throw new NullPointerException();
                        }
                        frame = new menuKurir(kurir);
                        frame.setVisible(true);
                        this.setVisible(false);
                    } catch (NullPointerException|SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, "gagal login");
                    }
                }
            } else if(radioAdmin.isSelected()){
                if (e.getSource()==register){
                    JOptionPane.showMessageDialog(rootPane, "Tidak bisa register admin");
                } else if(e.getSource()==login){
                    try {
                        Admin admin = null;
                        Admin t = Database.getAdmin();
                        if (jTextField1.getText().equals(t.getUsername())&&jPasswordField1.getText().equals(t.getPassword())){
                            System.out.println("p");
                            admin = t;
                        } else {
                            throw new NullPointerException();
                        }
                        frame = new menuAdmin(admin);
                        frame.setVisible(true);
                        this.setVisible(false);
                    } catch (NullPointerException|SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, "gagal login");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Masih kosong");
        }
    }
}
