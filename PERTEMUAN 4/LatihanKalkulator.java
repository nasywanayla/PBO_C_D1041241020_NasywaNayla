/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Kalkulator Sederhana
*/
public class LatihanKalkulator {
    public static void main(String[] args) {
        //Menampilkan KALKULATOR
        System.out.println("=== KALKULATOR ===");
        //Deklarasi dan inisialisasi variabel angka1 dan angka2 bertipe int 
        int angka1 = 25;
        int angka2 = 4;
        //Melakukan perhitungan penjumlahan, pengurangan, perkalian, pembagian dan sisa bagi
        int penjumlahan = angka1 + angka2;
        int pengurangan = angka1 - angka2;
        int perkalian = angka1 * angka2;
        int pembagian = angka1 / angka2;
        int sisaBagi = angka1 % angka2;
        //Melakukan pembagian desimal menggunakan type casting untuk mengubah int ke double->https://www.w3schools.com/java/java_type_casting.asp
        double pembagianDesimal = (double) angka1 / angka2;
        //Menampilkan nilai variabel angka1 dan angka2
        System.out.println("Angka 1: " + angka1);
        System.out.println("Angka 2: " + angka2);
        System.out.println("---");
        //Menampilkan hasil perhitungan
        System.out.println("Penjumlahan: " + penjumlahan);
        System.out.println("Pengurangan: " + pengurangan);
        System.out.println("Perkalian: " + perkalian);
        System.out.println("Pembagian: " + pembagian);
        System.out.println("Sisa Bagi: " + sisaBagi);
        System.out.println("Pembagian Desimal: " + pembagianDesimal);
    }
}
