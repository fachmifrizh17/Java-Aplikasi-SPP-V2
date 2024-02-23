/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import javax.swing.JOptionPane;
import koneksi.UserSession;

public class Login extends javax.swing.JFrame {
    String user="",pass="";
    private final Connection conn = new koneksi().connect();
    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
        ImageIcon img = new ImageIcon("src/ikon/logo.png");
        this.setIconImage(img.getImage());
        initUI();
    }
    
    private void initUI(){ 
        getContentPane().setBackground(new Color(245, 245, 245));
        
        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;    
        setLocation(dx, dy);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Petugas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tuser = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        tpass = new javax.swing.JPasswordField();
        Siswa = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        submit_siswa = new javax.swing.JButton();
        nisn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N

        Petugas.setBackground(new java.awt.Color(245, 255, 249));

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel3.setText("Password");

        submit.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 11)); // NOI18N
        submit.setText("MASUK");
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        jCheckBox1.setText("LIHAT");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        tpass.setText("PASSWORD");

        javax.swing.GroupLayout PetugasLayout = new javax.swing.GroupLayout(Petugas);
        Petugas.setLayout(PetugasLayout);
        PetugasLayout.setHorizontalGroup(
            PetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PetugasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PetugasLayout.createSequentialGroup()
                        .addGroup(PetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PetugasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(PetugasLayout.createSequentialGroup()
                                .addComponent(tpass, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jCheckBox1))
                    .addComponent(tuser)
                    .addGroup(PetugasLayout.createSequentialGroup()
                        .addGroup(PetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PetugasLayout.setVerticalGroup(
            PetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PetugasLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(tuser, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tpass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Petugas", Petugas);

        Siswa.setBackground(new java.awt.Color(245, 255, 249));

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel6.setText("NISN SISWA");

        submit_siswa.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 11)); // NOI18N
        submit_siswa.setText("MASUK");
        submit_siswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_siswaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SiswaLayout = new javax.swing.GroupLayout(Siswa);
        Siswa.setLayout(SiswaLayout);
        SiswaLayout.setHorizontalGroup(
            SiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SiswaLayout.createSequentialGroup()
                .addGroup(SiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SiswaLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(submit_siswa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SiswaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(nisn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SiswaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(103, 103, 103))
        );
        SiswaLayout.setVerticalGroup(
            SiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SiswaLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(nisn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(submit_siswa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Siswa", Siswa);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 360, 360));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikon/del.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 30, 50, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        user = tuser.getText();
        pass = tpass.getText();

        String sql = "select * from petugas where username='"+user+"'and password='"+pass+"';";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            if(hasil.next()){
                JOptionPane.showMessageDialog(null, "SELAMAT DATANG");
                new petugas. menuOP().setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "LOGIN GAGAL");
                tuser.setText("");
                tpass.setText("");
                tuser.requestFocus(true);
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "LOGIN GAGAL"+e);

        }        
    }//GEN-LAST:event_submitActionPerformed

    private void submit_siswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_siswaActionPerformed
        String Get_nisn = nisn.getText();
        String sql = "select * from siswa where nisn='"+Get_nisn+"';";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);

            if (rs.next()) {
                String nisn = rs.getString("nisn");
                String nama_siswa = rs.getString("nama_siswa");
                
                //set user data session
                UserSession.set_nisn(nisn);
                UserSession.set_nama_siswa(nama_siswa);
                
                JOptionPane.showMessageDialog(null, "Selamat datang "+ nama_siswa +" !");
                new siswa. menuSiswa().setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "NISN tidak ditemukan");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }    
    }//GEN-LAST:event_submit_siswaActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        String ObjButton[] = {"YES","NO"};
        int pilihan = JOptionPane.showOptionDialog(null,"Apakah Anda yakin ingi keluar?","Message", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,ObjButton,ObjButton[1]);
        if(pilihan == 0){
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            tpass.setEchoChar((char)0);
        }else{
            tpass.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Petugas;
    private javax.swing.JPanel Siswa;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nisn;
    private javax.swing.JButton submit;
    private javax.swing.JButton submit_siswa;
    private javax.swing.JPasswordField tpass;
    private javax.swing.JTextField tuser;
    // End of variables declaration//GEN-END:variables
}
