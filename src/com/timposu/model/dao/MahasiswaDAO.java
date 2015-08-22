/*
* dibuat oleh Ucup Timposu
* Blog: www.timposu.com
* Email : ucup.timposu@gmail.com
* Silahkan kode ini dipelajari dan dikembangkan..
*
**/


package com.timposu.model.dao;

import com.timposu.model.Mahasiswa;
import com.timposu.model.database.ConnectionDatabase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ucup
 */
public class MahasiswaDAO implements ImplementMahasiswa{
    
    private List<Mahasiswa> list;
            
    @Override
    public void input(Mahasiswa mahasiswa) {
        
        try {
            PreparedStatement statement = ConnectionDatabase.getConnection().prepareStatement(""
                    + "INSERT INTO mahasiswa (id, nama, alamat) VALUES (null, ?, ?)");
            
            statement.setString(1, mahasiswa.getNama());
            statement.setString(2, mahasiswa.getAlamat());
            
            statement.executeUpdate();
          
          
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void update(Mahasiswa mahasiswa) {
          try {
            PreparedStatement statement = ConnectionDatabase.getConnection().prepareStatement(""
                    + "UPDATE mahasiswa SET nama=?, alamat=? WHERE id=?");
            
            statement.setString(1, mahasiswa.getNama());
            statement.setString(2, mahasiswa.getAlamat());
            statement.setInt(3, mahasiswa.getId());
            
          
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
          
    }

    @Override
    public void delete(int id) {
   
          try {
            PreparedStatement statement = ConnectionDatabase.getConnection().prepareStatement(""
                    + "DELETE FROM mahasiswa WHERE id=?");
            
            statement.setInt(1, id);
            
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }

    @Override
    public List<Mahasiswa> getMahasiswa(String nama) {
        list = new ArrayList<Mahasiswa>();
        
        try {
            
            Statement statement = ConnectionDatabase.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM mahasiswa WHERE nama LIKE '%" + nama + "%'");
            
            while (result.next()) { 
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setId(result.getInt(1));
                mahasiswa.setNama(result.getString("nama"));
                mahasiswa.setAlamat(result.getString("alamat"));
                list.add(mahasiswa);
            }
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    @Override
    public List<Mahasiswa> getAllMahasiswa() {
    list = new ArrayList<Mahasiswa>();
        
        try {
            
            Statement statement = ConnectionDatabase.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM mahasiswa");
            
            while (result.next()) { 
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setId(result.getInt(1));
                mahasiswa.setNama(result.getString("nama"));
                mahasiswa.setAlamat(result.getString("alamat"));
                list.add(mahasiswa);
            }
            
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
