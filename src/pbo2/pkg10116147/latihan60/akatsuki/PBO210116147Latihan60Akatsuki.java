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

public class PBO210116147Latihan60Akatsuki {

    public static void main(String[] args) {
        
        System.out.println("========== A K A T S U K I ==========\n");
        
        Anggota pain = new Anggota("Pein", "Amegakure", "零 - れい, Rei - Nol/Tidak ada");
        pain.siapaSaya();
        
        Anggota konan = new Anggota("Konan", "Amegakure", "白虎 - びゃっこ, Byakko - Harimau Putih - Dewa Barat dan Musim Gugur");
        konan.siapaSaya();
        
        Anggota obito = new Anggota("Tobi", "Konohagakure", "玉女 - ぎょくにょ, Gyokunyo - Virgo");
        obito.siapaSaya();
        
        Anggota zetsu = new Anggota("Zetsu", "-", "玄武 - げんぶ, Genbu - Kura-Kura - Dewa Utara dan Musim Dingin");
        zetsu.siapaSaya();

        Anggota deidara = new Anggota("Deidara", "Iwagakure", "青龍 - せいりゅう, Seiryū - Naga Biru/Hijau - Dewa Timur dan Musim Semi");
        deidara.siapaSaya();
    
        Anggota itachi = new Anggota("Itachi", "Konohagakure", "朱雀 - すざく, Suzaku - Merah darah - Dewa Selatan dan Musim Panas");
        itachi.siapaSaya();
        
        Anggota orochimaru = new Anggota("Orochimaru", "Konohagakure", "空陳 - くうちん, Sora - Langit");
        orochimaru.siapaSaya();

        Anggota kisame = new Anggota("Kisame", "Kirigakure", "南斗 - なんじゅ, Nanju - Bintang Selatan");
        kisame.siapaSaya();

        Anggota kakuzu = new Anggota("Kakuzu", "Takigakure", "北斗 - ほくと, Hokuto - Bintang Utara");
        kakuzu.siapaSaya();

        Anggota hidan = new Anggota("Hidan", "Yugakure", "三台 - さんたい, Santai - Tiga Tingkatan");
        hidan.siapaSaya();

        Anggota sasori = new Anggota("Sasori", "Sunagakure", "玉女 - ぎょくにょ, Gyokunyo - Virgo");
        sasori.siapaSaya();

        System.out.println("Developed by Garry Prang");
    }
}
