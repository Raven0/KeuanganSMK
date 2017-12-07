/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keuangansmk;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author azhzh
 */
public class DBHelper {
    public static Integer getIdSiswaNis(int nis){
        String sql = "select * from siswa where nis = " + nis + "";
        int siswa = 0;
        try{
            java.sql.Connection conn=(Connection)connect.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                siswa = res.getInt(1);
            }
        }
        catch(Exception ex){
            
        }
        return siswa;
        
        //code in C# using labda return db.kelas.where(x => x.id_kelas.equals(id)).firsOorDefault();
    }
    
    public static int getTotalSpp(int nis){
        
        String sql = "select SUM(jumlah) from pembayaran where id_siswa = " + DBHelper.getIdSiswaNis(nis) + " and jenis_pembayaran = 'SPP'";
        int spp = 0;
        try{
            java.sql.Connection conn=(Connection)connect.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                spp = res.getInt(1);
            }
        }
        catch(Exception ex){
            
        }
        return spp;
        
        //code in C# using labda return db.kelas.where(x => x.id_kelas.equals(id)).firsOorDefault();
    }
    
    public static int getTotalDsp(int nis){
        
        String sql = "select SUM(jumlah) from pembayaran where id_siswa = " + DBHelper.getIdSiswaNis(nis) + " and jenis_pembayaran = 'DSP'";
        int spp = 0;
        try{
            java.sql.Connection conn=(Connection)connect.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                spp = res.getInt(1);
            }
        }
        catch(Exception ex){
            
        }
        return spp;
        
        //code in C# using labda return db.kelas.where(x => x.id_kelas.equals(id)).firsOorDefault();
    }
    
    public static int getTunggakanSpp(String nis){
        
        String sql = "select tunggakanSpp from siswa where nis = " + nis + "";
        int spp = 0;
        try{
            java.sql.Connection conn=(Connection)connect.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                spp = res.getInt(1);
            }
        }
        catch(Exception ex){
            
        }
        return spp;
        
        //code in C# using labda return db.kelas.where(x => x.id_kelas.equals(id)).firsOorDefault();
    }
    
    public static int getTunggakanDsp(String nis){
        
        String sql = "select tunggakanDsp from siswa where nis = " + nis + "";
        int spp = 0;
        try{
            java.sql.Connection conn=(Connection)connect.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                spp = res.getInt(1);
            }
        }
        catch(Exception ex){
            
        }
        return spp;
        
        //code in C# using labda return db.kelas.where(x => x.id_kelas.equals(id)).firsOorDefault();
    }
}
