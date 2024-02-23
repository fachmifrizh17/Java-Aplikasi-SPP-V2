/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petugas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Fachmi Farizh
 */
public class konfir extends javax.swing.JFrame {
private DefaultTableModel data;
    Connection conn;
    Statement stm;
    ResultSet rs;
    /**
     * Creates new form konfir
     */
    public konfir() {
        initComponents();
    Locale locale = new Locale ("id", "ID");
    Locale.setDefault(locale);
    tabel1();
    tabel2();
    block();
    kosong();
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
    
    public void kosong(){
        kodex.setText("");
        nisn.setText("");
        nama.setText("");
        kls.setText("");
        angkatan.setText("");
        tgl.setText("");
        jenis.setText("");
        bulan.setText("");
        harga.setText("");
        tgl.setText("");
        bayar.setText("");
        status.setSelectedItem(0);
    }
    
    public void block(){
        kodex.setEnabled(false);
        nisn.setEnabled(false);
        nama.setEnabled(false);
        kls.setEnabled(false);
        angkatan.setEnabled(false);
        tgl.setEnabled(false);
        jenis.setEnabled(false);
        bulan.setEnabled(false);
        harga.setEnabled(false);
        tgl.setEnabled(false);
        bayar.setEnabled(false);
    }
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
    public void tabel1(){
        Object header[]={"KODE","NISN","NAMA","KELAS","ANGKATAN","JENIS BAYAR","BULAN","BIAYA","TANGGAL","BAYAR","KEMBALI"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabel1.setModel(data);
        setKoneksi();
        String sql="SELECT * FROM transaksi";
        try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString("kode_transaksi");
                String kolom2=rs.getString("nisn");
                String kolom3=rs.getString("nama");
                String kolom4=rs.getString("kelas");
                String kolom5=rs.getString("angkatan"); 
                String kolom6=rs.getString("jenis_bayar");
                String kolom7=rs.getString("bulan");
                String kolom8=rs.getString("biaya");
                String kolom9=rs.getString("tgl");
                String kolom10=rs.getString("bayar");
                String kolom11=rs.getString("kembali");
                
                String kolom[]={kolom1,kolom2,kolom3,kolom4,kolom5,kolom6,kolom7,kolom8,kolom9,kolom10,kolom11};
                data.addRow(kolom);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal dipanggil"+e);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        kodex = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nisn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kls = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        angkatan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tgl = new javax.swing.JTextField();
        jenis = new javax.swing.JTextField();
        bulan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        simpan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bayar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KONFIRMASI");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(30, 108, 176));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel1.setBackground(new java.awt.Color(245, 255, 249));
        tabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 11)); // NOI18N
        tabel1.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 650, 120));

        jPanel2.setBackground(new java.awt.Color(245, 255, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(kodex, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, 40));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel1.setText("KODE TRANSAKSI");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel8.setText("NISN");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel2.add(nisn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 280, 36));

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel2.setText("NAMA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        jPanel2.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 280, 36));

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel3.setText("KELAS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel2.add(kls, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 280, 36));

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel5.setText("ANGKATAN");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        jPanel2.add(angkatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 280, 36));

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel4.setText("JENIS BAYARAN");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel6.setText("BIAYA");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));
        jPanel2.add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 280, 36));

        jLabel7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel7.setText("TANGGAL");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));
        jPanel2.add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 280, 36));
        jPanel2.add(jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 160, 40));
        jPanel2.add(bulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 110, 40));

        jLabel10.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel10.setText("STATUS");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, 20));

        status.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STATUS PEMBAYARAN", "LUNAS", "BELUM LUNAS" }));
        status.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 280, 30));

        simpan.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        simpan.setText("SIMPAN");
        simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel2.add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 280, 30));

        jButton1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jButton1.setText("HAPUS");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 280, 30));
        jPanel2.add(bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 280, 36));

        jLabel9.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel9.setText("BAYAR");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 300, 720));

        cari.setBackground(new java.awt.Color(245, 255, 249));
        cari.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 11)); // NOI18N
        cari.setText("CARI DATA");
        cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cariKeyPressed(evt);
            }
        });
        jPanel1.add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 650, 30));

        tabel2.setBackground(new java.awt.Color(245, 255, 249));
        tabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 11)); // NOI18N
        tabel2.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tabel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 650, 360));

        jButton2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jButton2.setText("PERBARUI");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 110, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikon/close.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/12.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 720, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel1MouseClicked
        // TODO add your handling code here:
        int bar = tabel1.getSelectedRow();
        String a = tabel1.getValueAt(bar, 0).toString ();
        String b = tabel1.getValueAt(bar, 1).toString ();
        String c = tabel1.getValueAt(bar, 2).toString ();
        String d = tabel1.getValueAt(bar, 3).toString ();
        String e = tabel1.getValueAt(bar, 4).toString ();
        String f = tabel1.getValueAt(bar, 5).toString ();
        String g = tabel1.getValueAt(bar, 6).toString ();
        String h = tabel1.getValueAt(bar, 7).toString ();
        String i = tabel1.getValueAt(bar, 8).toString ();
        String j = tabel1.getValueAt(bar, 9).toString ();

        kodex.setText(a);
        nisn.setText(b);
        nama.setText(c);
        kls.setText(d);
        angkatan.setText(e);
        jenis.setText(f);
        bulan.setText(g);
        harga.setText(h);
        tgl.setText(i);
        bayar.setText(j);
    }//GEN-LAST:event_tabel1MouseClicked

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        String sql = "insert into konfir values (?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, kodex.getText());
            stat.setString(2, nisn.getText());
            stat.setString(3, nama.getText());
            stat.setString(4, kls.getText());
            stat.setString(5, angkatan.getText());
            stat.setString(6, jenis.getText());
            stat.setString(7, bulan.getText());
            stat.setString(8, harga.getText());
            stat.setString(9, tgl.getText());
            stat.setString(10, bayar.getText());
            stat.setString(11, status.getSelectedItem().toString());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data akan disimpan");
            kosong();
            tabel2();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal disimpan"+e);
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null,"Hapus data ini?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (ok==0){
            String sql = "delete from transaksi where kode_transaksi ='"+kodex.getText()+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data akan di hapus dari sistem?");
                kosong();
                kodex.requestFocus();

            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(null, "data gagal dihapus"+e);
            }
            tabel1();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        kosong();
        tabel1();
        tabel2();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new menuOP().setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void cariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyPressed
    Object header[]={"KODE TRANSAKSI","NISN","NAMA","KELAS","ANGKATAN","JENIS BAYAR","BULAN","BIAYA","TANGGAL","BAYAR","STATUS"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabel1.setModel(data);

        setKoneksi();
        String sql="Select * from transaksi where kode_transaksi like '%" + cari.getText() + "%'" +"or nama like '%" + cari.getText()+"%'";

        try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString("kode_transaksi");
                String kolom2=rs.getString("nisn");
                String kolom3=rs.getString("nama");
                String kolom4=rs.getString("kelas");
                String kolom5=rs.getString("angkatan");
                String kolom6=rs.getString("jenis_bayar");
                String kolom7=rs.getString("bulan");
                String kolom8=rs.getString("biaya");
                String kolom9=rs.getString("tgl");
                String kolom10=rs.getString("bayar");
                String kolom11=rs.getString("kembali");

                String kolom[]={kolom1,kolom2,kolom3,kolom4,kolom5,kolom6,kolom7,kolom8,kolom9,kolom10,kolom11};
                data.addRow(kolom);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_cariKeyPressed
    public Connection setKoneksi2(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/db_spp","root","");
            stm=conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Koneksi Gagal :" +e);
        }
       return conn; 
    }
    public void tabel2(){
        Object header[]={"KODE","NISN","NAMA","KELAS","ANGKATAN","JENIS BAYAR","BULAN","BIAYA","TANGGAL","BAYAR","STATUS"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabel2.setModel(data);
        setKoneksi2();
        String sql="SELECT * FROM konfir";
        try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString("kode_transaksi");
                String kolom2=rs.getString("nisn");
                String kolom3=rs.getString("nama");
                String kolom4=rs.getString("kelas");
                String kolom5=rs.getString("angkatan"); 
                String kolom6=rs.getString("jenis");
                String kolom7=rs.getString("bulan");
                String kolom8=rs.getString("biaya");
                String kolom9=rs.getString("tgl");
                String kolom10=rs.getString("bayar");
                String kolom11=rs.getString("status");
                
                String kolom[]={kolom1,kolom2,kolom3,kolom4,kolom5,kolom6,kolom7,kolom8,kolom9,kolom10,kolom11};
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
            java.util.logging.Logger.getLogger(konfir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(konfir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(konfir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(konfir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new konfir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angkatan;
    private javax.swing.JTextField bayar;
    private javax.swing.JTextField bulan;
    private javax.swing.JTextField cari;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jenis;
    private javax.swing.JTextField kls;
    private javax.swing.JTextField kodex;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nisn;
    private javax.swing.JButton simpan;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable tabel1;
    private javax.swing.JTable tabel2;
    private javax.swing.JTextField tgl;
    // End of variables declaration//GEN-END:variables
}
