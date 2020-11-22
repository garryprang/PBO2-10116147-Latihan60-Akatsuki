/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan60.akatsuki;

/**
 * @author
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM       : 10116147
 * Deskripsi : Program untuk menampilkan deskripsi karakter Akatsuki dari anime Naruto.
 */

public class Akatsuki {

    protected String nama, desa;

   public Akatsuki(String nama, String desa) {
       this.nama = nama;
       this.desa = desa;
   }

   public String getNama() {
       return nama;
   }

   public String getDesa() {
       return desa;
   }
   
   public void siapaSaya() {
       System.out.println("Nama: ".concat(nama));
       System.out.println("Desa: ".concat(desa));
   }
}
