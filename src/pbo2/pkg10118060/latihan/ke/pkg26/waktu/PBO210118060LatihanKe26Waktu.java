/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg26.waktu;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 
 * Nama :Permai Ramdhan
 * NIM  :10118060
 * Deskripsi Program    : program menampilkan waktu sekarang
 */
public class PBO210118060LatihanKe26Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date( );
      SimpleDateFormat tgl = new SimpleDateFormat ("EEEE',' dd MMM yyyy hh:mm:ss ");

      System.out.println("Hari ini adalah hari : " + tgl.format(date));
    }
    
}
