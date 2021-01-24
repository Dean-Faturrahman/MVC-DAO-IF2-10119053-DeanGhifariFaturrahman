/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcjdbc.error;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * NIM   : 10119053
 * Kelas : IF - 2
 */
public class pelangganException extends Exception {

    /**
     * Creates a new instance of <code>pelangganExeption</code> without detail
     * message.
     */
    public pelangganException() {
    }

    /**
     * Constructs an instance of <code>pelangganExeption</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public pelangganException(String msg) {
        super(msg);
    }
    
}
