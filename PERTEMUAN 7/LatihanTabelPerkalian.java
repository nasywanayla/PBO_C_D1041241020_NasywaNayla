/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Tabel Perkalian
*/
public class LatihanTabelPerkalian {
    public static void main(String[] args) {
        //Menampilkan TABEL PERKALIAN 7
        System.out.println("=== TABEL PERKALIAN 7 ===");
        //Deklarasi angka
        int angka = 7;
        //Melakukan perulangan menggunakan for dari 1-12
        for(int i = 1; i <= 12; i++) {
            int hasil = angka * i;
            System.out.println(angka + " x " + i + " = " + hasil);
        }
    } 
}
