/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siswa;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import master.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class data_siswa extends javax.swing.JFrame {
private DefaultTableModel data;
    Connection conn;
    Statement stm;
    ResultSet rs;
    /**
     * Creates new form data_siswa
     */
    public data_siswa() {
        initComponents();
        block();
        kosong();
        tabel();
        id_kelas.setVisible(false);
        tahun.setVisible(false);
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
    
    protected void kosong(){
        nisn.setText("");
        nis.setText("");
        nama.setText("");
        KLS.setText("");
        thn.setText("");
        tlpn.setText("");
        alamat.setText("");
    }
    
    protected void block(){
    nisn.setEnabled(false);
    nis.setEnabled(false);
    nama.setEnabled(false);
    KLS.setEnabled(false);
    thn.setEnabled(false);
    lk.setEnabled(false);
    pr.setEnabled(false);
    tlpn.setEnabled(false);
    alamat.setEnabled(false);
     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jk = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        nis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tlpn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        cari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nisn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lk = new javax.swing.JRadioButton();
        pr = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        tahun = new javax.swing.JTextField();
        id_kelas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        KLS = new javax.swing.JTextField();
        thn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DATA SISWA");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel2.setText("NIS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));
        getContentPane().add(nis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 130, 30));

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel3.setText("ALAMAT LENGKAP");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));
        getContentPane().add(tlpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 270, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel4.setText("KELAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        cancel.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        cancel.setText("Batal");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 497, 270, 60));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 440, 360));

        cari.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        cari.setText("CARI. . . .");
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cariKeyPressed(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 290, 30));

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel5.setText("ANGKATAN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));
        getContentPane().add(nisn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel6.setText("NISN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel7.setText("NAMA SISWA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jk.add(lk);
        lk.setText("LAKI - LAKI");
        getContentPane().add(lk, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jk.add(pr);
        pr.setText("PEREMPUAN");
        getContentPane().add(pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel8.setText("JENIS KELAMIN");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 270, 30));

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane2.setViewportView(alamat);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 270, 50));

        jLabel9.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel9.setText("NO. TELEPON SISWA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));
        getContentPane().add(tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 10, -1));
        getContentPane().add(id_kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 10, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikon/close.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));
        getContentPane().add(KLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, 30));
        getContentPane().add(thn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/4.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        kosong();
        tabel();
    }//GEN-LAST:event_cancelActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int baris = tabel.getSelectedRow();
        nisn.setText(tabel.getModel().getValueAt(baris, 0).toString());
        nis.setText(tabel.getModel().getValueAt(baris, 1).toString());
        nama.setText(tabel.getModel().getValueAt(baris, 2).toString());
        KLS.setText(tabel.getModel().getValueAt(baris, 3).toString());
        thn.setText(tabel.getModel().getValueAt(baris, 4).toString());
        tlpn.setText(tabel.getModel().getValueAt(baris, 6).toString());
        alamat.setText(tabel.getModel().getValueAt(baris, 7).toString());
    }//GEN-LAST:event_tabelMouseClicked

    private void cariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyPressed
        // TODO add your handling code here:Object header[]={"ID","NAMA","JENIS KELAMIN","WA","EMAIL","ALAMAT"};
        Object header[]={"NISN","NIS","NAMA SISWA","KELAS","TAHUN","JENIS KELAMIN","TELEPON","ALAMAT"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabel.setModel(data);

        setKoneksi();
        String sql="Select * from siswa where nisn like '%" + cari.getText() + "%'" +"or nis like '%" + cari.getText()+"%'";

        try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString("nisn");
                String kolom2=rs.getString("nis");
                String kolom3=rs.getString("nama_siswa");
                String kolom4=rs.getString("kelas");
                String kolom5=rs.getString("tahun");
                String kolom6=rs.getString("kelamin");
                String kolom7=rs.getString("telepon");
                String kolom8=rs.getString("alamat");

                String kolom[]={kolom1,kolom2,kolom3,kolom4,kolom5,kolom6,kolom7,kolom8};
                data.addRow(kolom);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_cariKeyPressed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new siswa. menuSiswa().setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked
public Connection setKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/db_spp","root","");
            stm=conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Koneksi Gagal :" +e);
        }
       return conn; 
    }

public void tabel(){
        Object header[]={"NISN","NIS","NAMA SISWA","KELAS","TAHUN","JENIS KELAMIN","TELEPON","ALAMAT"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabel.setModel(data);
        setKoneksi();
        String sql="SELECT * FROM siswa";
        try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString("nisn");
                String kolom2=rs.getString("nis");
                String kolom3=rs.getString("nama_siswa");
                String kolom4=rs.getString("kelas");
                String kolom5=rs.getString("tahun");
                String kolom6=rs.getString("kelamin");
                String kolom7=rs.getString("telepon");
                String kolom8=rs.getString("alamat");

                String kolom[]={kolom1,kolom2,kolom3,kolom4,kolom5,kolom6,kolom7,kolom8};
                data.addRow(kolom);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal dipanggil"+e);
        }
    }

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
            java.util.logging.Logger.getLogger(data_siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_siswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField KLS;
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cari;
    private javax.swing.JTextField id_kelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup jk;
    private javax.swing.JRadioButton lk;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nis;
    private javax.swing.JTextField nisn;
    private javax.swing.JRadioButton pr;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tahun;
    private javax.swing.JTextField thn;
    private javax.swing.JTextField tlpn;
    // End of variables declaration//GEN-END:variables
}