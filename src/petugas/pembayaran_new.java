/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petugas;

import siswa.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import petugas.tabel_biaya;

public class pembayaran_new extends javax.swing.JFrame {
private DefaultTableModel data;
    Connection conn;
    Statement stm;
    ResultSet rs;
    /**
     * Creates new form pembayaran_new
     */
    public pembayaran_new() {
        initComponents();
        tabel_status();
        block();
        kosong();
        kode();
         setJam();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        tgl.setText(dateFormat.format(cal.getTime()));
        tgl.setEnabled(false);
        ImageIcon img = new ImageIcon("src/ikon/logo.png");
        this.setIconImage(img.getImage());
        initUI();
    }
    
    public void setJam(){
ActionListener taskPerformer = new ActionListener() {

public void actionPerformed(ActionEvent evt) {
String nol_jam = "", nol_menit = "",nol_detik = "";

java.util.Date dateTime = new java.util.Date();
int nilai_jam = dateTime.getHours();
int nilai_menit = dateTime.getMinutes();
int nilai_detik = dateTime.getSeconds();

if(nilai_jam <= 9) nol_jam= "0";
if(nilai_menit <= 9) nol_menit= "0";
if(nilai_detik <= 9) nol_detik= "0";

String waktu = nol_jam + Integer.toString(nilai_jam);
String menit = nol_menit + Integer.toString(nilai_menit);
String detik = nol_detik + Integer.toString(nilai_detik);

jam.setText(waktu+":"+menit+":"+detik+"");
}
};
new Timer(1000, taskPerformer).start();
}
 
    public void kode() {
        try {
        
            String sql = "SELECT * FROM transaksi ORDER by kode_transaksi desc";
            java.sql.Statement stat = conn.createStatement();
            ResultSet r = stat.executeQuery(sql);

            if (r.next()) {
                String nofak = r.getString("kode_transaksi").substring(1);
                String AN = "" + (Integer.parseInt(nofak) + 1);
                String Nol = "";

                if (AN.length() == 1) {
                    Nol = "000";
                } else if (AN.length() == 2) {
                    Nol = "00";
                } else if (AN.length() == 3) {
                    Nol = "0";
                } else if (AN.length() == 4) {
                    Nol = "";
                }

               kode_transaksi.setText("T" + Nol + AN);
            } else {
               kode_transaksi.setText("T0001");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    } 
    
     public void initUI(){ 
        getContentPane().setBackground(new Color(245, 245, 245));
        
        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;    
        setLocation(dx, dy);
    }
     
     public void block(){
        kode_transaksi.setEnabled(false);
        nisn.setEnabled(false);
        nama.setEnabled(false);
        kls.setEnabled(false);
        biaya.setEnabled(false);
        angkatan.setEnabled(false);
        tgl.setEnabled(false);
        kembali.setEnabled(false);
        jenis.setEnabled(false);
     }
     
     public void  kosong(){
        nisn.setText("");
        nama.setText("");
        kls.setText("");
        angkatan.setText("");
        jenis.setText("");
        bulan.setSelectedItem(0);
        biaya.setText("");
        tgl.setText("");
        bayar.setText("");
        kembali.setText("");
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
         
    
    
    public void tabel_status(){
        Object header[]={"NISN","NAMA","KELAS","ANGKATAN"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabel_siswa.setModel(data);
        setKoneksi();
        String sql="SELECT * FROM siswa";
        try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString("nisn");
                String kolom2=rs.getString("nama_siswa");
                String kolom3=rs.getString("kelas");
                String kolom4=rs.getString("tahun");
                
                String kolom[]={kolom1,kolom2,kolom3,kolom4};
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tgl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kode_transaksi = new javax.swing.JTextField();
        biaya = new javax.swing.JTextField();
        jenis = new javax.swing.JTextField();
        car = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nisn = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        kls = new javax.swing.JTextField();
        angkatan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bulan = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_siswa = new javax.swing.JTable();
        bayar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        kembali = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jam = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PEMBAYARAN");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(30, 108, 176));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(245, 255, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel1.setText("KODE TRANSAKSI");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel2.setText("NAMA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel3.setText("KELAS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel5.setText("ANGKATAN");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel6.setText("BIAYA");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));
        jPanel2.add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 270, 36));

        jLabel7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel7.setText("TANGGAL");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel8.setText("NISN");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        jPanel2.add(kode_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 270, 40));

        biaya.setEditable(false);
        biaya.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        biaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biayaActionPerformed(evt);
            }
        });
        jPanel2.add(biaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 270, 40));

        jenis.setEditable(false);
        jenis.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jenis.setPreferredSize(new java.awt.Dimension(138, 25));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });
        jPanel2.add(jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 40));

        car.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        car.setPreferredSize(new java.awt.Dimension(57, 25));
        car.setRequestFocusEnabled(false);
        car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carActionPerformed(evt);
            }
        });
        car.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                carKeyPressed(evt);
            }
        });
        jPanel2.add(car, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 20, 40));

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel4.setText("JENIS BAYARAN");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        nisn.setEditable(false);
        nisn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nisn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nisnActionPerformed(evt);
            }
        });
        jPanel2.add(nisn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 270, 40));

        nama.setEditable(false);
        nama.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel2.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 270, 40));

        kls.setEditable(false);
        kls.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        kls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klsActionPerformed(evt);
            }
        });
        jPanel2.add(kls, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 270, 40));

        angkatan.setEditable(false);
        angkatan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        angkatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkatanActionPerformed(evt);
            }
        });
        jPanel2.add(angkatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 270, 40));

        jLabel10.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel10.setText("BULAN");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 80, -1));

        bulan.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BULAN", "JANUARI", "FEBRUARI", "MARET", "APRIL", "MEI", "JUNI", "JULI", "AGUSTUS", "SEPTEMBER", "OKTOBER", "NOVEMBER", "DESEMBER" }));
        jPanel2.add(bulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 100, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 290, 550));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikon/close.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(245, 255, 249));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_siswa.setBackground(new java.awt.Color(245, 255, 249));
        tabel_siswa.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 11)); // NOI18N
        tabel_siswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_siswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_siswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_siswa);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 150));

        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });
        bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bayarKeyReleased(evt);
            }
        });
        jPanel3.add(bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 410, 32));

        jLabel11.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel11.setText("BAYAR");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 80, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel12.setText("KEMBALI");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 70, -1));
        jPanel3.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 410, 32));

        tambah.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        tambah.setText("TAMBAH");
        tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel3.add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 110, 40));

        jButton2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jButton2.setText("BATAL");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(65, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 110, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 650, 350));

        jPanel4.setBackground(new java.awt.Color(245, 255, 249));

        jam.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jam.setText("jLabel9");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jam)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jam)
                .addGap(25, 25, 25))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 290, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/12.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 720, 160));

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

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
   String sql = "insert into transaksi values (?,?,?,?,?,?,?,?,?,?,?)";
            try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, kode_transaksi.getText());
            stat.setString(2, nisn.getText());
            stat.setString(3, nama.getText());
            stat.setString(4, kls.getText());
            stat.setString(5, angkatan.getText());
            stat.setString(6, jenis.getText());
            stat.setString(7, bulan.getSelectedItem().toString());
            stat.setString(8, biaya.getText());
            stat.setString(9, tgl.getText());
            stat.setString(10, bayar.getText());
            stat.setString(11, kembali.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Terima Kasih Pembayaran Akan Diproses Selanjutnya");
            kosong();
            kode_transaksi.requestFocus();
            kode();
            }
            catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Pembayaran Gagal Cek Kembali Apakah Ada Data Yang Salah"+e);
            }
    }//GEN-LAST:event_tambahActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bayarActionPerformed

    private void bayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bayarKeyReleased

        String a = biaya.getText();
        int aa = Integer.parseInt(a);

        String b = bayar.getText();
        int bb = Integer.parseInt(b);

        int hargaa,jumlahh,totall,diskon;
        hargaa = Integer.parseInt(biaya.getText().toString());
        jumlahh = Integer.parseInt(bayar.getText().toString());

        totall = jumlahh-hargaa;

        kembali.setText(Integer.toString(totall));
    }//GEN-LAST:event_bayarKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    kosong();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carActionPerformed
      new petugas.tabel_biaya().setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_carActionPerformed

    private void carKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carKeyPressed

    }//GEN-LAST:event_carKeyPressed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisActionPerformed

    private void biayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biayaActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new spp().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void nisnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nisnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nisnActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void klsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_klsActionPerformed

    private void angkatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angkatanActionPerformed

    private void tabel_siswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_siswaMouseClicked
        int baris = tabel_siswa.getSelectedRow();
        nisn.setText(tabel_siswa.getModel().getValueAt(baris, 0).toString());
        nama.setText(tabel_siswa.getModel().getValueAt(baris, 1).toString());
        kls.setText(tabel_siswa.getModel().getValueAt(baris, 2).toString());
        angkatan.setText(tabel_siswa.getModel().getValueAt(baris, 3).toString());
    }//GEN-LAST:event_tabel_siswaMouseClicked

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
            java.util.logging.Logger.getLogger(pembayaran_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pembayaran_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pembayaran_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pembayaran_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pembayaran_new().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField angkatan;
    private javax.swing.JTextField bayar;
    public javax.swing.JTextField biaya;
    private javax.swing.JComboBox<String> bulan;
    private javax.swing.JButton car;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jam;
    public javax.swing.JTextField jenis;
    private javax.swing.JTextField kembali;
    public javax.swing.JTextField kls;
    private javax.swing.JTextField kode_transaksi;
    public javax.swing.JTextField nama;
    public javax.swing.JTextField nisn;
    private javax.swing.JTable tabel_siswa;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField tgl;
    // End of variables declaration//GEN-END:variables
}
