/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Mobil Constructor
*/

//Membuat Atribut
class Mobil{
    String merk;
    String warna;
    int tahun = 0;

    //Membuat Constructor 1: Tanpa Parameter
    public Mobil(){
        merk = "Belum diisi";
        warna = "Belum diisi";
        tahun = 0;
    }
    //Membuat Constructor 2: 1 parameter (merk saja)
    public Mobil(String merk){
        this.merk = merk;
        warna = "Belum diisi";
        tahun = 0;
    }
    //Membuat Constructor 3: 3 parameter (semua atribut)
    public Mobil(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }
    //Membuat method dan Menampilkan Spesifikasi Mobil
    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println();
    }
}
public class LatihanMobilConstructor {
    public static void main(String[] args) {
        //Membuat Object 1: Menggunakan constructor tanpa parameter
        Mobil mobil1 = new Mobil();
        mobil1.tampilkanSpesifikasi();
        //Membuat Object 2: Menggunakan constructor 1 parameter
        Mobil mobil2 = new Mobil("Toyota");
        mobil2.tampilkanSpesifikasi();
        //Membuat Object 3: Menggunakan constructor 3 parameter
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);
        mobil3.tampilkanSpesifikasi();
    }
}
