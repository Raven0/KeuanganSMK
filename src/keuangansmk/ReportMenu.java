/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keuangansmk;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author azhzh
 */
public class ReportMenu extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReportMenu
     */
    
    private Connection conn;

    public ReportMenu() throws SQLException {
        initComponents();
        conn = connect.configDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dt_awal = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        dt_akhir = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        cb_kelas = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Tanggal Awal");

        jLabel2.setText("Tanggal Akhir");

        jLabel3.setText("Kelas");

        cb_kelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=====", "XAK1", "XAK2", "XAK3", "XAK4", "XAK5", "XAK6", "XTKJ1", "XTKJ2", "XTKJ3", "XRPL1", "XRPL2", "=====", "XIAK1", "XIAK2", "XIAK3", "XIAK4", "XIAK5", "XIAK6", "XITKJ1", "XITKJ2", "XITKJ3", "XIRPL1", "XIRPL2", "=====", "XIIAK1", "XIIAK2", "XIIAK3", "XIIAK4", "XIIAK5", "XIIAK6", "XIITKJ1", "XIITKJ2", "XIITKJ3", "XIIRPL1", "XIIRPL2", "=====", "XIIIAK1", "XIIIAK2", "XIIIAK3", "XIIIAK4", "XIIIAK5", "XIIIAK6" }));

        jButton2.setText("Tanggal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Bulan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Tahun");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Menu Rekap Data");

        jLabel5.setText("*pilih kelas untuk merekap data berdasarkan kelas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dt_akhir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dt_awal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dt_awal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dt_akhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try{
            //ClassLoader cl = getClass().getClassLoader();
            //InputStream in = cl.getResourceAsStream("reportSurat.jasper");
            JasperDesign jd = JRXmlLoader.load("X:\\PROJECT\\Desktop\\Java\\keuanganSMK\\Report\\rekapKeuangan.jrxml");
            Date awal = dt_awal.getDate();
            Date akhir = dt_akhir.getDate();
            SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timeAwal = sdf.format(awal);
            String timeAkhir = sdf.format(akhir);
            
            String kelas = (String) cb_kelas.getSelectedItem();
            if(kelas.equals("=====")){
                String sql = "SELECT siswa.nis, siswa.nama, siswa.kelas, pembayaran.jenis_pembayaran, pembayaran.tanggal_bayar, pembayaran.jumlah FROM pembayaran,siswa WHERE siswa.id_siswa = pembayaran.id_siswa AND (tanggal_bayar BETWEEN '"+ timeAwal +"' AND '" + timeAkhir + "') ORDER BY `pembayaran`.`tanggal_bayar` ASC";
                JRDesignQuery newQuery = new JRDesignQuery();
                newQuery.setText(sql);
                jd.setQuery(newQuery);
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint p = JasperFillManager.fillReport(jr , new HashMap(), conn);
                JasperViewer.viewReport(p, false);  
            }else{
                String sql = "SELECT siswa.nis, siswa.nama, siswa.kelas, pembayaran.jenis_pembayaran, pembayaran.tanggal_bayar, pembayaran.jumlah FROM pembayaran,siswa WHERE siswa.id_siswa = pembayaran.id_siswa AND siswa.kelas = '"+ cb_kelas.getSelectedItem() +"' AND (tanggal_bayar BETWEEN '"+ timeAwal +"' AND '" + timeAkhir + "') ORDER BY `pembayaran`.`tanggal_bayar` ASC";
                JRDesignQuery newQuery = new JRDesignQuery();
                newQuery.setText(sql);
                jd.setQuery(newQuery);
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint p = JasperFillManager.fillReport(jr , new HashMap(), conn);
                JasperViewer.viewReport(p, false);  
            }  
        }catch(JRException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        try{
            //ClassLoader cl = getClass().getClassLoader();
            //InputStream in = cl.getResourceAsStream("reportSurat.jasper");
            JasperDesign jd = JRXmlLoader.load("X:\\PROJECT\\Desktop\\Java\\keuanganSMK\\Report\\rekapKeuangan.jrxml");
            Date awal = dt_awal.getDate();
            SimpleDateFormat sdfm = new java.text.SimpleDateFormat("MM");
            SimpleDateFormat sdfy = new java.text.SimpleDateFormat("YYYY");
            String bulan = sdfm.format(awal);
            String tahun = sdfy.format(awal);
            
            String kelas = (String) cb_kelas.getSelectedItem();
            if(kelas.equals("=====")){
                String sql = "SELECT siswa.nis, siswa.nama, siswa.kelas, pembayaran.jenis_pembayaran, pembayaran.tanggal_bayar, pembayaran.jumlah FROM pembayaran,siswa WHERE siswa.id_siswa = pembayaran.id_siswa AND MONTH(tanggal_bayar) = '"+ bulan +"' AND YEAR(tanggal_bayar) = '"+ tahun +"' ORDER BY `pembayaran`.`tanggal_bayar` ASC ";
                JRDesignQuery newQuery = new JRDesignQuery();
                newQuery.setText(sql);
                jd.setQuery(newQuery);
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint p = JasperFillManager.fillReport(jr , new HashMap(), conn);
                JasperViewer.viewReport(p, false); 
            }else{
                String sql = "SELECT siswa.nis, siswa.nama, siswa.kelas, pembayaran.jenis_pembayaran, pembayaran.tanggal_bayar, pembayaran.jumlah FROM pembayaran,siswa WHERE siswa.id_siswa = pembayaran.id_siswa AND siswa.kelas = '"+ cb_kelas.getSelectedItem() +"' AND MONTH(tanggal_bayar) = '"+ bulan +"' AND YEAR(tanggal_bayar) = '"+ tahun +"' ORDER BY `pembayaran`.`tanggal_bayar` ASC ";
                JRDesignQuery newQuery = new JRDesignQuery();
                newQuery.setText(sql);
                jd.setQuery(newQuery);
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint p = JasperFillManager.fillReport(jr , new HashMap(), conn);
                JasperViewer.viewReport(p, false); 
            }        
        }catch(JRException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        try{
            //ClassLoader cl = getClass().getClassLoader();
            //InputStream in = cl.getResourceAsStream("reportSurat.jasper");
            JasperDesign jd = JRXmlLoader.load("X:\\PROJECT\\Desktop\\Java\\keuanganSMK\\Report\\rekapKeuangan.jrxml");
            Date awal = dt_awal.getDate();
            SimpleDateFormat sdfy = new java.text.SimpleDateFormat("YYYY");
            String tahun = sdfy.format(awal);
            
            String kelas = (String) cb_kelas.getSelectedItem();
            if(kelas.equals("=====")){
                String sql = "SELECT siswa.nis, siswa.nama, siswa.kelas, pembayaran.jenis_pembayaran, pembayaran.tanggal_bayar, pembayaran.jumlah FROM pembayaran,siswa WHERE siswa.id_siswa = pembayaran.id_siswa AND YEAR(tanggal_bayar) = '"+ tahun +"' ORDER BY `pembayaran`.`tanggal_bayar` ASC ";
                JRDesignQuery newQuery = new JRDesignQuery();
                newQuery.setText(sql);
                jd.setQuery(newQuery);
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint p = JasperFillManager.fillReport(jr , new HashMap(), conn);
                JasperViewer.viewReport(p, false); 
            }else{
                String sql = "SELECT siswa.nis, siswa.nama, siswa.kelas, pembayaran.jenis_pembayaran, pembayaran.tanggal_bayar, pembayaran.jumlah FROM pembayaran,siswa WHERE siswa.id_siswa = pembayaran.id_siswa AND siswa.kelas = '"+ cb_kelas.getSelectedItem() +"' AND YEAR(tanggal_bayar) = '"+ tahun +"' ORDER BY `pembayaran`.`tanggal_bayar` ASC ";
                JRDesignQuery newQuery = new JRDesignQuery();
                newQuery.setText(sql);
                jd.setQuery(newQuery);
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint p = JasperFillManager.fillReport(jr , new HashMap(), conn);
                JasperViewer.viewReport(p, false); 
            }          
        }catch(JRException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_kelas;
    private org.jdesktop.swingx.JXDatePicker dt_akhir;
    private org.jdesktop.swingx.JXDatePicker dt_awal;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
