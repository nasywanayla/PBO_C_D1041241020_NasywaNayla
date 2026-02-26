/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Kalkulator Diskon
*/
public class LatihanDiskon {
    public static void main(String[] args) {
        //Menampilkan KALKULATOR DISKON
        System.out.println("=== KALKULATOR DISKON ===");
        //Deklarasi dan inisialisasi variabel tipe data double 
        double totalBelanja = 750000;
        double diskon;
        double hargaAkhir;
        double hitungHarga;
        //Melakukan pengecekan tidak mendapatkan diskon
        if(totalBelanja < 100000) {
            diskon = totalBelanja * 0;
        //Melakukan pengecekan mendapatkan diskon 5%
        } else if (totalBelanja >= 100000 && totalBelanja <= 499999) {
            diskon = totalBelanja * 0.05;
        //Melakukan pengecekan mendapatkan diskon 10%
        } else if (totalBelanja >= 500000 && totalBelanja <= 999999) {
            diskon = totalBelanja * 0.10;
        //Melakukan pengecekan mendapatkan diskon 15%
        } else if (totalBelanja >= 1000000) {
            diskon = totalBelanja * 0.15;
        }
        //Menghitung diskon 10% dari total belanja
        hitungHarga = totalBelanja * 0.10;
        //Menghitung harga akhir
        hargaAkhir = totalBelanja - hitungHarga;
        System.out.println("Total Belanja: Rp " + totalBelanja);
        System.out.println("Diskon (10%): Rp " + hitungHarga);
        System.out.println("Harga Akhir: Rp " + hargaAkhir);
        System.out.println("Anda Hemat: Rp " + hitungHarga);    

    }   
}
