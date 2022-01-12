/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kampusapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kampusapp.model.DatabaseConfig;
import kampusapp.model.Mahasiswa;

/**
 *
 * @author emanu
 */
public class KampusDAOProses implements KampusDAO{
    Connection connection=null;
    ResultSet resultSet=null;
    Statement statement=null;
    PreparedStatement preparedStatement=null;
    
    @Override
    public List<Mahasiswa> get() {
        List<Mahasiswa> list=new ArrayList<Mahasiswa>();
        try{
            
            String sql="Select * from tbl_warga";
            connection=DatabaseConfig.openConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery(sql);
            while(resultSet.next()){
                Mahasiswa mhs=new Mahasiswa();
                mhs.setId(resultSet.getInt("id"));
                mhs.setNomorktp(resultSet.getString("nomorktp"));
                mhs.setNomorkk(resultSet.getString("nomorkk"));
                mhs.setNama(resultSet.getString("nama"));
                mhs.setAlamat(resultSet.getString("alamat"));
                mhs.setNo_hp(resultSet.getString("no_hp"));
                list.add(mhs);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean save(Mahasiswa mahasiswa) {
        boolean flag=false;
        try{
            String sql="insert into tbl_warga(nomorktp,nomorkk,nama,alamat,no_hp) values(?,?,?,?,?)";
            connection=DatabaseConfig.openConnection();
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, mahasiswa.getNomorktp());
            preparedStatement.setString(2, mahasiswa.getNomorkk());
            preparedStatement.setString(3, mahasiswa.getNama()); 
            preparedStatement.setString(4, mahasiswa.getAlamat());
            preparedStatement.setString(5, mahasiswa.getNo_hp());
            preparedStatement.executeUpdate();
            flag=true;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return flag;
    }

    
}
