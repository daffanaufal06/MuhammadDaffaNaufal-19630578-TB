package Form_Update;

import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.text.SimpleDateFormat;
import one.DBConnection_login;
import one.DBKoneksi;

public class Form_Update_Barang extends javax.swing.JDialog {
    public Form_Update_Barang(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Tanggal_sekarang();
        Jam_digital();
        
    }

    //format tanggal
    public void format_tanggal(){
        String tampilan = "yy-MM-dd";
        SimpleDateFormat format_tanggal = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(format_tanggal.format(date_chooser_tanggal.getDate()));
    }
    
    //bersih komponen
    public void bersih_komponen(){
        txt_kode_barang.setText("");
        txt_banyak_barang.setText("");
        txt_harga_beli.setText("");
        txt_harga_jual.setText("");
        date_chooser_tanggal.setSelectableDateRange(null, null);
    }
    
    //perintah menampilkan tanggal
    public void Tanggal_sekarang(){
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat ("yyyy-MM-dd") ;
        label_tanggal.setText(kal.format(sekarang));
    }
    
    //penrintah menampilkan jam
    public void Jam_digital(){
        new Thread(){
            @Override
            public void run(){
                int waktu_mulai = 0;
                while (waktu_mulai == 0){
                Calendar kalender = new GregorianCalendar();
                int jam = kalender.get(Calendar.HOUR);
                int menit = kalender.get(Calendar.MINUTE);
                int detik = kalender.get(Calendar.SECOND);
                int AM_PM = kalender.get(Calendar.AM_PM);
                String siang_malam = "";
                if (AM_PM == 1){
                    siang_malam = "PM";
                }
                else {
                    siang_malam = "PM";
                }
                String time = jam+" : "+menit+" : "+detik+" "+siang_malam;
                label_jam.setText(time);
                }
            }
        }.start();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_tanggal = new javax.swing.JLabel();
        label_jam = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_kode_barang = new javax.swing.JTextField();
        txt_banyak_barang = new javax.swing.JTextField();
        txt_harga_beli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_selesai = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_harga_jual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nama_barang = new javax.swing.JTextField();
        date_chooser_tanggal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Barang");
        setResizable(false);

        label_tanggal.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        label_tanggal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_tanggal.setText("TANGGAL");

        label_jam.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        label_jam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_jam.setText("JAM");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entry Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setText("Kode Barang");

        jLabel4.setText("Banyak Barang");

        jLabel6.setText("Harga Beli");

        txt_harga_beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_harga_beliActionPerformed(evt);
            }
        });

        jLabel7.setText("Harga Jual");

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");

        btn_selesai.setText("Selesai");
        btn_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selesaiActionPerformed(evt);
            }
        });

        jLabel8.setText("Expired");

        jLabel5.setText("Nama Barang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_selesai, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_kode_barang, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_nama_barang)
                                .addComponent(txt_banyak_barang))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(date_chooser_tanggal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addComponent(txt_harga_jual, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_harga_beli, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_kode_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_banyak_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_harga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_harga_jual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(date_chooser_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan)
                    .addComponent(btn_hapus)
                    .addComponent(btn_selesai))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_tanggal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                        .addComponent(label_jam))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tanggal)
                    .addComponent(label_jam))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        if(txt_kode_barang.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Kode Barang tidak boleh kosong!");
            txt_kode_barang.requestFocus();
        }
        else if(txt_nama_barang.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Kode Barang tidak boleh kosong!");
            txt_nama_barang.requestFocus();
        }
        else if(txt_banyak_barang.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Nama Barang tidak boleh kosong!");
            txt_banyak_barang.requestFocus();
        }
        else if(txt_harga_beli.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Harga Beli tidak boleh kosong!");
            txt_harga_beli.requestFocus();
        }
        else if(txt_harga_jual.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Harga Jual tidak boleh kosong!");
            txt_harga_jual.requestFocus();
        }
        else{
            //java.sql.Connection koneksi = new DBConnection2().;
            java.sql.Connection koneksi = new DBConnection_login().konek();
            try{
                String sql="insert into tabel_barang(kode_barang, nama_barang, harga_beli, harga_jual) values(?,?,?,?)";
                java.sql.PreparedStatement stmt = koneksi.prepareStatement(sql);
                try{
                    stmt.setString(1, txt_kode_barang.getText());
                    stmt.setString(2, txt_nama_barang.getText());
                    stmt.setString(3, txt_harga_beli.getText());
                    stmt.setString(4, txt_harga_jual.getText());
                    //stmt.setString(6, date_chooser_tanggal.getDateFormatString());
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Menyimpan Data BERHASIL");
                    bersih_komponen();
                }
                catch(SQLException se){
                    JOptionPane.showMessageDialog(null,"Menyimpan data GAGAL \n" +se);
                }stmt.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Koneksi GAGAL" +e);
            }
        }  
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selesaiActionPerformed
        dispose();
    }//GEN-LAST:event_btn_selesaiActionPerformed

    private void txt_harga_beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_harga_beliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_harga_beliActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Update_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Update_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Update_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Update_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Form_Update_Barang dialog = new Form_Update_Barang(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_selesai;
    private javax.swing.JButton btn_simpan;
    private com.toedter.calendar.JDateChooser date_chooser_tanggal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_jam;
    private javax.swing.JLabel label_tanggal;
    private javax.swing.JTextField txt_banyak_barang;
    private javax.swing.JTextField txt_harga_beli;
    private javax.swing.JTextField txt_harga_jual;
    private javax.swing.JTextField txt_kode_barang;
    private javax.swing.JTextField txt_nama_barang;
    // End of variables declaration//GEN-END:variables
}
