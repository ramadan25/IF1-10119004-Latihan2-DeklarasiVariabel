/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan2.deklarasi.pengaksesanvariabel;

/**
 *
 * @author ENDOG
 * NAMA     : Muhamad Ramadan
 * KELAS    : IF 1
 * NIM      : 10119004
 * Deskripsi Program : Program ini berisi untuk menampilkan
 * value ke layar
 */
public class IF110119004Latihan2DeklarasiPengaksesanVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarater;
        
        // Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarater = 'D';
        
        // Menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel logika = " + nilaiLogika);
        System.out.println("Isi variabel karakter = " + nilaiKarater);
    }    
}
