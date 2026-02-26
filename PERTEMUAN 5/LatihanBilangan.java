/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Bilangan
*/
public class LatihanBilangan {
    public static void main(String[] args) {
        //Menampilkan Pemeriksaan Bilangan
        System.out.println ("=== PEMERIKSAAN BILANGAN ===");
        //Deklarasi dan inisialisasi tipe data int
        int number = 12;
        //Menampilkan nilai number
        System.out.println ("Bilangan: " + number);
        //Melakukan pengecekan apakah number lebih dari 0 untuk melihat positif atau negatif
        if (number > 0) {
            //Menampilkan jenis bilangan
            System.out.println("Jenis: Bilangan positif"); 
            //Melakukan pengecekan apakah bilangan genap
            if (number % 2 == 0) {
                //Menampilkan tipe genap dan ganjil
                System.out.println("Tipe: Genap");
            } else {
                System.out.println("Tipe: Ganjil");
            }
        //Melakukan pengecekan number kurang dari 0 untuk melihat positif atau negatif    
        } else if (number < 0) {
            //Menampilkan jenis bilangan
            System.out.println("Jenis: Bilangan negatif");
            //Melakukan pengecekan apakah bilangan genap
            if (number % 2 == 0) {
                //Menampilkan tipe genap dan ganjil
                System.out.println("Tipe: Genap");
            } else {
                System.out.println("Tipe: Ganjil");
            }
        //Jika bukan negatif atau positif tampilkan Nol
        } else {
            System.out.println("Jenis: Nol");
        }
        //Menampilkan jarak kosong
        System.out.println();
        //Menampilkan Pemeriksaan Bilangan
        System.out.println ("=== PEMERIKSAAN BILANGAN ===");
        //Deklarasi dan inisialisasi tipe data int
        number = -7;
        //Menampilkan nilai number
        System.out.println ("Bilangan: " + number);
        //Melakukan pengecekan apakah number lebih dari 0 untuk melihat positif atau negatif
        if (number > 0) {
            //Menampilkan jenis bilangan
            System.out.println("Jenis: Bilangan positif");
            //Melakukan pengecekan apakah bilangan ganjil
            if (number % 2 != 0) {
                //Menampilkan tipe genap dan ganjil
                System.out.println("Tipe: Ganjil");
            } else {
                System.out.println("Tipe: Genap");
            }
        //Melakukan pengecekan number kurang dari 0 untuk melihat positif atau negatif
        } else if (number < 0) {
            //Menampilkan jenis bilangan
            System.out.println("Jenis: Bilangan negatif");
            //Melakukan pengecekan apakah bilangan ganjil
            if (number % 2 != 0) {
                //Menampilkan tipe genap dan ganjil
                System.out.println("Tipe: Ganjil");
            } else {
                System.out.println("Tipe: Genap");
            }
        //Jika bukan negatif atau positif tampilkan Nol
        } else {
            System.out.println("Jenis: Nol");
        }
    }
}      