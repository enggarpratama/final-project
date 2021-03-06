/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.project.akhir;

/**
 *
 * @author ENGGAR PRATAMA , DWI PRIYANTO , ANDI ROSADI
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CHECKOUT extends javax.swing.JFrame {

   
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    /**
     * membuat constructor jam keluar dari data base
     */
    public CHECKOUT() {
        initComponents();
        conn = ConnectionSql.ConnectDBS();
        updateTable();
    }
    /**
     * membuat method mengambil waktu keluar
     */
    public String waktuOut() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
        String a = sdf.format(cal.getTime());
        return a;
    }
    /**
     * mengupdate tabel dari data base
     */
    public void updateTable() {
        try {
            String sql = "select * from data_pengunjung";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            FTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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

        jLabel2 = new javax.swing.JLabel();
        FTCari = new javax.swing.JTextField();
        FTIn = new javax.swing.JTextField();
        FTId = new javax.swing.JTextField();
        FTKamar = new javax.swing.JTextField();
        FTNIK = new javax.swing.JTextField();
        FTInap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FTNo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        FTTagihan = new javax.swing.JTextField();
        FTDiskon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        FTCash = new javax.swing.JTextField();
        FTKembalian = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtonOut = new javax.swing.JLabel();
        BHitung = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Check in");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 640, 100, 30));

        FTCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FTCariMouseClicked(evt);
            }
        });
        getContentPane().add(FTCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 170, 30));
        getContentPane().add(FTIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 640, 260, 30));

        FTId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTIdActionPerformed(evt);
            }
        });
        getContentPane().add(FTId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 260, 30));
        getContentPane().add(FTKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 260, 30));
        getContentPane().add(FTNIK, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 260, 30));
        getContentPane().add(FTInap, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 260, 30));

        jLabel4.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("CARI KAMAR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, 30));

        jLabel5.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("ID PELANGGAN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 360, 100, 30));

        FTNo.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        FTNo.setForeground(new java.awt.Color(0, 51, 51));
        FTNo.setText("KAMAR");
        getContentPane().add(FTNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 430, 100, 30));

        jLabel7.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("NIK");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 500, 100, 30));

        jLabel8.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("LAMA INAP");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 570, 100, 30));

        jLabel9.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("TAGIHAN");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 100, 30));

        FTTagihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTTagihanActionPerformed(evt);
            }
        });
        getContentPane().add(FTTagihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 240, 30));
        getContentPane().add(FTDiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 240, 30));

        jLabel10.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("DISCOUNT");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 100, 30));

        jLabel11.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("CASH");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 100, 30));
        getContentPane().add(FTCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 240, 30));
        getContentPane().add(FTKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, 240, 30));

        jLabel12.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 51));
        jLabel12.setText("KEMBALIAN");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/project/akhir/in.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, 60, 60));

        ButtonOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/project/akhir/cout.png"))); // NOI18N
        ButtonOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonOutMouseClicked(evt);
            }
        });
        getContentPane().add(ButtonOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, 60, 70));

        BHitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/project/akhir/calc.png"))); // NOI18N
        BHitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BHitungMouseClicked(evt);
            }
        });
        getContentPane().add(BHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, 60, 70));

        FTable.setModel(new javax.swing.table.DefaultTableModel(
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
        FTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 780, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/project/akhir/checkoutifix.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FTIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FTIdActionPerformed

    private void FTTagihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTTagihanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FTTagihanActionPerformed
    /**
     * membuat method click tagihan agar langsung di proses
     */
    private void FTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FTableMouseClicked
       Transaksi tagihan = new Transaksi();

        try {
            int row = FTable.getSelectedRow();
            String table_click = (FTable.getModel().getValueAt(row, 0).toString());
            String sql = "select * from data_pengunjung where Kamar='" + table_click + "'";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                String add = rs.getString("CheckIn");
                FTIn.setText(add);
                String add1 = rs.getString("ID");
                FTId.setText(add1);
                String add2 = rs.getString("Kamar");
                FTKamar.setText(add2);
                String add3 = rs.getString("NIK");
                FTNIK.setText(add3);
                String add4 = rs.getString("LamaInap");
                FTInap.setText(add4);

                int add6 = rs.getInt("Kamar");
                int add7 = rs.getInt("LamaInap");
                double sub = tagihan.hargaTotal(add6, add7);
                String add9 = rs.getString("JamIn");
                int total = tagihan.dendaHotel(add9, waktuOut());
                String subtotal = String.valueOf(sub + total);
                FTTagihan.setText(String.valueOf(subtotal));
                FTDiskon.setText(String.valueOf(tagihan.diskonKamar(add7)));
                // JOptionPane.showMessageDialog(null, add9);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_FTableMouseClicked
    /**
     * mengambil nama dari data pengunjung
     */
    private void FTCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FTCariMouseClicked
        // TODO add your handling code here:
        if (FTCari.getText().equalsIgnoreCase("")) {
            this.updateTable();
        } else {

            try {
                String sql = "select * from data_pengunjung where Nama =?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, FTCari.getText());
                rs = ps.executeQuery();
                FTable.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_FTCariMouseClicked
    /**
     * method untuk mengambil dan memproses tagihan
     */
    private void BHitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BHitungMouseClicked
        // TODO add your handling code here:
        try {
            String tagih = FTTagihan.getText();
            double tagih1 = Double.parseDouble(tagih);

            String bayar = FTCash.getText();
            double bayar1 = Double.parseDouble(bayar);

            double kembalian = bayar1 - tagih1;
            String kembalian1 = String.valueOf(kembalian);
            FTKembalian.setText(kembalian1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Bayar cuy");
        }
    }//GEN-LAST:event_BHitungMouseClicked
    /**
     * method untuk mengambil data base pengunjung yang keluar
     */
    private void ButtonOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonOutMouseClicked
        // TODO add your handling code here:
        try {
            //
            String add1 = FTInap.getText();
            String add2 = FTIn.getText();
            Transaksi dayOut = new Transaksi();
            String out = dayOut.dayOut(Integer.parseInt(add1), add2);
            //
            String sql3 = "insert data_transaksi (ID,JamOut,CheckOut,Status,Tagihan) values (?,?,?,?,?)";
            ps = conn.prepareStatement(sql3);
            ps.setString(1, FTId.getText());
            ps.setString(2, waktuOut());
            ps.setString(3, out);
            ps.setString(4, "Out");
            ps.setString(5, FTTagihan.getText());
            ps.execute();
            //
            String sql2 = "UPDATE data_kamar SET Status = 'Kosong' WHERE data_kamar.NoKamar ='" + FTKamar.getText() + "'";
            ps = conn.prepareStatement(sql2);
            ps.executeUpdate();
            String sql1 = "Delete from data_pengunjung where ID='" + FTId.getText() + "'";
            ps = conn.prepareStatement(sql1);
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        updateTable();
    }//GEN-LAST:event_ButtonOutMouseClicked
    /**
     * membuat method untuk login
     */
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        dispose();
        LOGIN n = new LOGIN();
        n.show();

    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * main method check out
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
            java.util.logging.Logger.getLogger(CHECKOUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CHECKOUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CHECKOUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CHECKOUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CHECKOUT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BHitung;
    private javax.swing.JLabel ButtonOut;
    private javax.swing.JTextField FTCari;
    private javax.swing.JTextField FTCash;
    private javax.swing.JTextField FTDiskon;
    private javax.swing.JTextField FTId;
    private javax.swing.JTextField FTIn;
    private javax.swing.JTextField FTInap;
    private javax.swing.JTextField FTKamar;
    private javax.swing.JTextField FTKembalian;
    private javax.swing.JTextField FTNIK;
    private javax.swing.JLabel FTNo;
    private javax.swing.JTextField FTTagihan;
    private javax.swing.JTable FTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
