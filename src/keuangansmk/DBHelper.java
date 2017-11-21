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
    public static String getNamaKelasId(int id){
        String sql = "select * from kelas where id_kelas = " + id + "";
        String kelas = null;
        try{
            java.sql.Connection conn=(Connection)connect.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                kelas = res.getString(2);
            }
        }
        catch(Exception ex){
            kelas = ex.getMessage();
        }
        return kelas;
        
        //code in C# using labda return db.kelas.where(x => x.id_kelas.equals(id)).firsOorDefault();
    }
}
