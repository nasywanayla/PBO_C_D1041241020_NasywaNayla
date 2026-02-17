/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Perhitungan Sederhana
*/
public class LatihPerhitungan {
    public static void main(String[] args) {
        //Menampilkan SIMULASI TRANSAKSI BANK
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        //Deklarasi dan inisialisasi variabel saldo bertipe int dengan nilai awal 1000000
        int saldo = 1000000;
        //Menampilkan nilai variabel saldo awal
        System.out.println("Saldo Awal          : " + saldo);
        //Deklarasi dan inisialisasi variabel setoran bertipe int 
        int setoran = 500000;
        //Menampilkan nilai variabel setoran
        System.out.println("Setoran             : " + setoran);
        //Melakukan penjumlahan antara saldo dan setoran
        saldo += setoran;
        //Menampilkan saldo setelah disetor
        System.out.println("Saldo Setelah Setor : " + saldo);
        //Deklarasi dan inisialisasi variabel tipe data int 
        int penarikan = 250000;
        //Menampilkan nilai variabel penarikan
        System.out.println("Penarikan           : " + penarikan);
        //Melakukan pengurangan antara saldo dan penarikan
        saldo -= penarikan;
        //Menampilkan nilai variabel saldo akhir
        System.out.println("Saldo Akhir         : " + saldo);
    }

}
