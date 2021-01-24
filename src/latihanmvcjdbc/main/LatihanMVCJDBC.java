/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcjdbc.main;

import java.sql.SQLException;
import javax.swing.SwingUtilities;
import latihanmvcjdbc.error.pelangganException;
import latihanmvcjdbc.view.MainViewPelanggan;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * NIM   : 10119053
 * Kelas : IF - 2
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, pelangganException {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {                    
                } catch (pelangganException e){                    
                }                
            }
        });        
    }    
    
}
