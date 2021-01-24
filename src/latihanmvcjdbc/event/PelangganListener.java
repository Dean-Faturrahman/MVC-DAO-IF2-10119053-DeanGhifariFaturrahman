/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcjdbc.event;

import latihanmvcjdbc.entity.Pelanggan;
import latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * NIM   : 10119053
 * Kelas : IF - 2
 */
public interface PelangganListener {    
    
    //parameter dari model pelanggan
    public void onChange(PelangganModel model);
    
    //parameter dari entity databse pelanggan
    public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    
    //karena tidak perlu menambahkan data ke dalam tabel
    //jadi ondelete tidak perlu memasukkan data
    //alias tidak perlu parameter
    public void onDelete();
}
