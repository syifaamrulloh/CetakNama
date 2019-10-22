/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan45.cetaknama;
import java.util.*;
/**
 *
 * @author
 * Nama     : MUHAMAD SYIFA AMRULOH
 * Kelas    : IF 11-K
 * Nim      : 10118910
 * Deslripsi program : Menampilkan Nama dengan konsep orientasi objek
 */
public class PBO11K10118910Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Printer p = new Printer();
        Scanner input = new Scanner(System.in);
        System.out.println("======Aplikasi Pencetak Nama=======");
        System.out.print("Masukan nama anda : ");
        String nama = input.nextLine();
        System.out.print("Mau cetak nama berapa kali : ");
        int jml = input.nextInt();
        p.setNama(nama);
        p.setJmlCetak(jml);
        p.cetak(p.getNama());
        p.cetak(p.getJmlCetak(), p.getNama());
      
    }
    
}
