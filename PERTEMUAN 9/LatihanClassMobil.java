/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Class Mobil
*/

//Membuat Class Mobil
class Mobil {
    //Membuat Atribut
    String merk;
    String warna;
    int tahun;
    int kecepatan;
    //Membuat Method Tampilkan Spesifikasi
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println();
        System.out.println("Merk : " + merk);
        System.out.println();
        System.out.println("Warna : " + warna);
        System.out.println();
        System.out.println("Tahun : " + tahun);
        System.out.println();
    }
    //Membuat Method Percepat
    public void percepat() {
        kecepatan = kecepatan + 20;
        System.out.println("Mobil dipercepat...");
        System.out.println();
    }
    //Membuat Method Tampilkan Kecepatan
    public void tampilkanKecepatan() {
        System.out.println("Kecapatan saat ini: " + kecepatan + "km/jam");
        System.out.println();
    }
}
public class LatihanClassMobil {
    public static void main(String[] args) {
        //Membuat object Mobil
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota Avanza";
        mobil1.warna = "Silver";
        mobil1.tahun = 2020;
        //Menampilkan Tampilan Spesifikasi
        mobil1.tampilkanSpesifikasi();
        mobil1.percepat();
        mobil1.percepat();
        mobil1.tampilkanKecepatan();
    } 
}
