/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Data Produk
*/
public class LatihanProduk {
    //Deklarasi Konstanta
    public static double PAJAK = 0.11; 
    public static void main (String[] args) {
        //Menampilkan INFORMASI PRODUK
        System.out.println("=== INFORMASI PRODUK ===");
        //Deklarasi dan inisialisasi variabel bertipe string
        String namaProduk = "Laptop Asus";
        //Deklarasi harga satuan bertipe int
        int hargaSatuan = 7000000;
        //Deklarasi jumlah stok bertipe int
        int jumlahStok = 15;
        //Deklarasi status tersedia bertipe logika
        boolean isStokTersedia = true;
        //Melakukan perhitungan total nilai stok
        int totalNilaiStok = hargaSatuan * jumlahStok;
        //Melakukan perhitungan pajak
        double hitungPajak = totalNilaiStok * PAJAK;
        //Mengubah tipe data menggunakan type casting
        int pajak = (int) hitungPajak;
        //Menampilkan nilai variabel
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Satuan: Rp " + hargaSatuan);
        System.out.println("Jumlah Stok: " + jumlahStok);
        System.out.println("Status Tersedia: " + isStokTersedia);
        System.out.println("---");
        System.out.println("Total Nilai Stok: Rp " + totalNilaiStok);
        System.out.println("Pajak (11%): Rp " + pajak);
    }
}
