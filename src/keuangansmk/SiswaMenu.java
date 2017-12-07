/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keuangansmk;

import java.awt.Component;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author azhzh
 */
public class SiswaMenu extends javax.swing.JInternalFrame {

    /**
     * Creates new form SiswaMenu
     */
    
    private Connection conn;
    
    public SiswaMenu() throws SQLException {
        initComponents();
        loadData();
        conn = connect.configDB();
    }
    
    private void loadData(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KELAS");
        model.addColumn("JENIS KELAMIN");
        model.addColumn("");
        model.addColumn("");
        //menampilkan data database kedalam tabel
        try {
            String sql = "select * from siswa";
            java.sql.Connection conn=(Connection)connect.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getInt(2),res.getString(3),res.getString(4),res.getString(5), "Detail Siswa" , "Pembayaran Siswa"});
            }
            dgvSiswa.setModel(model);
        } catch (Exception e) {
        
        }
    }
    
    private void searchData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("NAMA");
        model.addColumn("KELAS");
        model.addColumn("JENIS KELAMIN");
        model.addColumn("");
        model.addColumn("");
        //menampilkan data database kedalam tabel
        try {
            String sql = "select * from siswa where nis like '%" + tbNama.getText() + "%' or nama like '%" + tbNama.getText() + "%' or kelas like '%" + tbNama.getText() + "%'";
            java.sql.Connection conn=(Connection)connect.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getInt(2),res.getString(3),res.getString(4),res.getString(5), "Detail Siswa" , "Pembayaran Siswa"});
            }
            dgvSiswa.setModel(model);
        } catch (Exception e) {
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        dgvSiswa = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        label1 = new java.awt.Label();
        tbNama = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        dgvSiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        dgvSiswa.setCellSelectionEnabled(true);
        dgvSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgvSiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgvSiswa);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        label1.setText("Search Siswa");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Data Siswa");

        jButton1.setText("Laporan Pembayaran");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 706, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbNama, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch)
                        .addComponent(btnRefresh)
                        .addComponent(jButton1))
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        loadData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        searchData();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void dgvSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgvSiswaMouseClicked
        // TODO add your handling code here:
        int row = dgvSiswa.rowAtPoint(evt.getPoint());
        String nis =dgvSiswa.getValueAt(row, 0).toString();
        
//        try {
//            String sql = "select * from siswa where nis like '%" + nis + "%'";
//            java.sql.Connection conn=(Connection)connect.configDB();
//            java.sql.Statement stm=conn.createStatement();
//            java.sql.ResultSet res=stm.executeQuery(sql);
//        } catch (Exception e) {
//        
//        }
        int index = dgvSiswa.getSelectedColumn();         
        if(index == 4){
            //Detail
            DetailDialog d = new DetailDialog(new javax.swing.JFrame(), true,nis);
            d.show();
        }else if(index == 5){
            //pembayaran
            FormDialog d = new FormDialog(new javax.swing.JFrame(), true,nis);
            d.show();
        }
    }//GEN-LAST:event_dgvSiswaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            ClassLoader cl = getClass().getClassLoader();
            InputStream in = cl.getResourceAsStream("report1.jasper");
            JasperPrint p = JasperFillManager.fillReport(in , new HashMap(), conn);
            
            JasperViewer.viewReport(p, false);
            
        }catch(JRException ex){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTable dgvSiswa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTextField tbNama;
    // End of variables declaration//GEN-END:variables
}
