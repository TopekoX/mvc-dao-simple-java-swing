/*
* dibuat oleh Ucup Timposu
* Blog: www.timposu.com
* Email : ucup.timposu@gmail.com
* Silahkan kode ini dipelajari dan dikembangkan..
*
**/


package com.timposu.model.tabel;

import com.timposu.model.Mahasiswa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ucup
 */
public class TabelModelMahasiswa extends AbstractTableModel{
    private static final long serialVersionUID = 1L;

    List<Mahasiswa> list ;

    public TabelModelMahasiswa(List<Mahasiswa> list) {
        this.list = list;
    }
       
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getId();
            case 1 : return list.get(rowIndex).getNama();
            case 2 : return list.get(rowIndex).getAlamat();
                default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 : return "ID";
            case 1 : return "NAMA";
            case 2 : return "ALAMAT";
                default:return null;
        }
    }
    
    

}
