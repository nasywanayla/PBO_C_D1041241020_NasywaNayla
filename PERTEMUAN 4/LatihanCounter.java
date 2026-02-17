/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Operator Increment
*/
public class LatihanCounter {
    public static void main(String[] args) {
        //Menampilkan COUNTER
        System.out.println ("=== COUNTER ===");
        //Deklarasi dan inisialisasi variabel counter bertipe int
        int variabelCounter = 10;
        //Menampilkan Nilai Awal 
        System.out.println ("Nilai awal: " + variabelCounter);
        //Melakukan Increment 2 kali
        variabelCounter++;
        variabelCounter++;
        //Menampilkan hasil setelah di increment
        System.out.println ("Setelah ++ (2x): " + variabelCounter);
        //Melakukan Decrement 1 kali
        variabelCounter--;
        //Menampilkan hasil setelah di decrement
        System.out.println ("Setelah --: " + variabelCounter);
        //Melakukan penambahan angka 5 menggunakan +=
        variabelCounter += 5;
        //Menampilkan hasil setelah += 5
        System.out.println ("Setelah += 5: " + variabelCounter);
        //Melakukan pengurangan angka 3 menggunakan -=
        variabelCounter -= 3;
        //Menampilkan hasil setelah -= 3
        System.out.println ("Setelah -= 3: " + variabelCounter);
        //Melalukan perkalian angka 2 menggunakan *=
        variabelCounter *= 2;
        //Menampilkan hasil setelah * =2
        System.out.println ("Setelah *= 2: " + variabelCounter);
    }
}
