/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan44.hukumohm;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha 
 * Nim : 10117048 
 * Kelas : PBO2 
 * Deskripsi Program : Program ini tentang menghitung hasil tegangan menggunakan
 *                     hukum ohm.
 */
public class PBO210117048Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=======Hukum OHM======");
        
        Baterai bti = new Baterai(3,12);
        System.out.println("Kuat Arus : " +bti.getKuatArus()+ " ampere ");
        System.out.println("Hambatan : " +bti.getHambatan()+ " ohm ");
        System.out.println("Hasil Tegangan : " +bti.hitungTegangan()+ " volt ");
    }
    
}
