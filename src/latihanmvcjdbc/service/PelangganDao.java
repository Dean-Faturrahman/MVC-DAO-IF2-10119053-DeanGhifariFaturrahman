/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcjdbc.service;

import java.util.List;
import latihanmvcjdbc.entity.Pelanggan;
import latihanmvcjdbc.error.pelangganException;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * NIM   : 10119053
 * Kelas : IF - 2
 */
public interface PelangganDao {
    
    // untuk melakukan akticitas CRUD
    // get by ID dan get by Email
    public void  insertPelanggan(Pelanggan pelanggan) throws pelangganException;
    
    public void  updatePelanggan(Pelanggan pelanggan) throws pelangganException;
    
    public void  deletePelanggan(Integer id) throws pelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws pelangganException;
    
    //unique
    public Pelanggan getPelanggan(String email) throws pelangganException;
    
    // jika ingin meload semua data pelanggan
    public List<Pelanggan> selectAllPelanggan() throws pelangganException;
}
