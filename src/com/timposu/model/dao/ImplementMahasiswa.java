/*
* dibuat oleh Ucup Timposu
* Blog: www.timposu.com
* Email : ucup.timposu@gmail.com
* Silahkan kode ini dipelajari dan dikembangkan..
*
**/

package com.timposu.model.dao;

import com.timposu.model.Mahasiswa;
import java.util.List;

/**
 *
 * @author ucup
 */
public interface ImplementMahasiswa {
    
    public void input(Mahasiswa mahasiswa);
    
    public void update(Mahasiswa mahasiswa);
    
    public void delete(int id);
    
    public List<Mahasiswa> getMahasiswa(String nama);
    
    public List<Mahasiswa> getAllMahasiswa();

}
