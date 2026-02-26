/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Refleksi
*/
public class LatihanRefleksi {
    public static void main(String[] args) {
        //Menampilkan MENGGUNAKAN WHILE
        System.out.println("=== MENGGUNAKAN WHILE ===");
        //Deklarasi angka
        int angka = 1;
        //Melakukan looping while
        while (angka <= 5) {
            //Menampilkan angka
            System.out.print(angka + " ");
            //Menambah angka
            angka++;
        }
        System.out.println();
        //Menampilkan MENGGUNAKAN DO-WHILE
        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        //Deklarasi angka
        angka = 1;
        //Melakukan looping Do-While
        do {
            //Menampilkan angka
            System.out.print(angka + " ");
            //Menambah angka
            angka++;
        } while (angka <= 5);
        System.out.println();
        //Menampilkan MENGGUNAKAN FOR
        System.out.println("=== MENGGUNAKAN FOR ===");
        //Melakukan looping for
        for(int i = 1; i <= 5; i++) {
            //Menampilkan i
            System.out.print(i + " ");
        }
    }
}
//Jenis loop yang mudah dipahami menurut saya itu adalah loop for karena lebih mudah digunakan dan lebih ringkas