/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Deret Ganjil
*/
public class LatihanDeretGanjil {
    public static void main(String[] args) {
        //Menampilkan BILANGAN GANJIL 1-15
        System.out.println("=== BILANGAN GANJIL 1-15 ===");
        //Deklarasi Angka
        int angka = 1;
        //Melakukan perulangan angka kurang dari sama dengan 15
        while (angka <= 15) {
            System.out.print(angka + " ");
            //Menambahkan angka 2 untuk menampilkan angka ganjil
            angka += 2;
        }
    }
}
