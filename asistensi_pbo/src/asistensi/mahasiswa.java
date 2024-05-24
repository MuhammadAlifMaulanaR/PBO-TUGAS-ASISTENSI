/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asistensi;

import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author muham
 */
public class mahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form mahasiswa
     */
    public mahasiswa() {
        initComponents();
        tabel();
    }
    
    public void tabel(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("Nim");
        tabel.addColumn("Nama");
        tabel.addColumn("Kelas");
        try {
            Statement st = (Statement) koneksi.koneksiDB().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM mahasiswa");

            while (rs.next()) {
                tabel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3)
                });
                tabelmhs.setModel(tabel);
            }
        } catch (Exception e) {
            e.printStackTrace();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        namamhs = new javax.swing.JTextField();
        kelas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelmhs = new javax.swing.JTable();
        tb_add = new javax.swing.JButton();
        tb_update = new javax.swing.JButton();
        tb_batal = new javax.swing.JButton();
        tb_hapus = new javax.swing.JButton();
        cari = new javax.swing.JTextField();
        tb_cari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DATA TABEL MAHASISWA");

        jLabel2.setText("Nim :");

        jLabel3.setText("Nama :");

        jLabel4.setText("Kelas :");

        tabelmhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nim", "Nama", "Kelas"
            }
        ));
        tabelmhs.setGridColor(new java.awt.Color(0, 0, 0));
        tabelmhs.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tabelmhs.setShowGrid(true);
        jScrollPane1.setViewportView(tabelmhs);

        tb_add.setText("Add");
        tb_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_addActionPerformed(evt);
            }
        });

        tb_update.setText("Update");
        tb_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_updateActionPerformed(evt);
            }
        });

        tb_batal.setText("Batal");
        tb_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_batalActionPerformed(evt);
            }
        });

        tb_hapus.setText("Hapus");
        tb_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_hapusActionPerformed(evt);
            }
        });

        tb_cari.setText("cari");
        tb_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tb_update))
                            .addComponent(namamhs, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tb_batal)
                .addGap(132, 132, 132))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(tb_cari)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tb_add)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tb_hapus)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namamhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tb_add)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_update)
                    .addComponent(tb_batal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(tb_hapus)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_cari))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_addActionPerformed
        try {
            String sql = "insert into mahasiswa values('"
            + nim.getText() + "','"
            + namamhs.getText() + "','"
            + kelas.getText() + "')";
            System.out.println(sql);
            java.sql.Connection conn = (java.sql.Connection) asistensi.koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tabel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal disimpan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tb_addActionPerformed

    private void tb_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_updateActionPerformed
      try {         
            String query = "UPDATE mahasiswa SET namamhs = ?, kelas = ? WHERE nim = ?";
            java.sql.Connection conn = (java.sql.Connection) asistensi.koneksi.koneksiDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, namamhs.getText());
            statement.setString(2, kelas.getText());
            statement.setString(3, nim.getText());  
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            System.out.println("Successfully: " + nim.getText());
            System.out.println("\n");
            tabel();
            statement.close();
        } catch (NumberFormatException e) {
            System.out.println("Failed: Invalid NIM format - " + e.getMessage());
            JOptionPane.showMessageDialog(null, "NIM harus berupa angka");
        } catch (SQLDataException exc) {
            System.out.println("Failed: " + exc.getMessage());
            JOptionPane.showMessageDialog(null, "Data gagal disimpan: " + exc.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada database: " + e.getMessage());
        }
    }//GEN-LAST:event_tb_updateActionPerformed

    private void tb_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_cariActionPerformed
        try {
            java.sql.Connection conn = (java.sql.Connection) asistensi.koneksi.
                    koneksiDB();
            String sql = "Select * from mahasiswa where nim='" + cari.getText() 
                    + "' or namamhs='" + cari.getText() + "'";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                nim.setText(rs.getString(1));
                namamhs.setText(rs.getString(2));
                kelas.setText(rs.getString(3));
                JOptionPane.showMessageDialog(null, "Data tabel1 : "
                    + cari.getText() + " ditemukan, Apakah Anda Ingin Mengedit "
                            + "atau Menghapus?");
            }
        } catch (Exception e) {
        }
        cari.requestFocus();
    }//GEN-LAST:event_tb_cariActionPerformed

    private void tb_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_batalActionPerformed
        nim.setText("");
        namamhs.setText("");
        kelas.setText("");
        nim.requestFocus();
    }//GEN-LAST:event_tb_batalActionPerformed

    private void tb_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_hapusActionPerformed
        try {
            java.sql.Connection conn = (java.sql.Connection) asistensi.koneksi.koneksiDB();
            String sql = "delete from mahasiswa where nim='" + nim.getText() + "' ";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
            tabel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Proses Penghapusan Gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tb_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField namamhs;
    private javax.swing.JTextField nim;
    private javax.swing.JTable tabelmhs;
    private javax.swing.JButton tb_add;
    private javax.swing.JButton tb_batal;
    private javax.swing.JButton tb_cari;
    private javax.swing.JButton tb_hapus;
    private javax.swing.JButton tb_update;
    // End of variables declaration//GEN-END:variables
}
