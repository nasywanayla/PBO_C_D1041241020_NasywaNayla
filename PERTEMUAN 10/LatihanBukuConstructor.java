/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Buku Constructor
*/

//Membuat Atribut
class Buku{
    String judul;
    String pengarang;
    int harga = 0;

    //Constructor 1: Tanpa parameter
    public Buku(){
        judul = "Belum diisi";
        pengarang = "Belum diisi";
        harga = 0;
    }

    //Contructor 2: 3 parameter (gunakan this)
    public Buku(String judul, String pengarang, int harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
    //Membuat method dan Menampilkan Informasi Buku
    public void tampilkanInfo(){
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul    : " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga    : Rp " + harga);
        System.out.println();
    }
}
public class LatihanBukuConstructor {
    public static void main(String[] args) {
     //Mmembuat Object 1: Menggunakan constructor default (tanpa parameter) 
     Buku buku1 = new Buku();
     buku1.tampilkanInfo();
     //Membuat Object 2: Menggunakan constructor dengan berparameter
     Buku buku2 = new Buku("Pemrograman Java", "Budi Raharjo", 125000 );
     buku2.tampilkanInfo();
     //Membuat Object 3: Menggunakan constructor dengan berparameter
     Buku buku3 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);
     buku3.tampilkanInfo();
    }
}