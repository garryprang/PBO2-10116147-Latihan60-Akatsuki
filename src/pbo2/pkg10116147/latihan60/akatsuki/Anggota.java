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

public class Anggota extends Akatsuki {

     private String cincin;
    
    public Anggota(String nama, String desa, String cincin) {
        super(nama, desa);
        this.cincin = cincin;
    }

    public String getCincin() {
        return cincin;
    }
    
    @Override
    public void siapaSaya() {
        super.siapaSaya();
        System.out.println("Cincin: ".concat(cincin).concat("\n"));
    }
}
