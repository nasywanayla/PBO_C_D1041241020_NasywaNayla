/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Menu Harian
*/
public class LatihanMenuHarian {
    public static void main(String[] args) {
        //Menampilkan MENU MAKAN 3 HARI
        System.out.println("=== MENU MAKAN 3 HARI ===");
        //Lakukan perulangan for untuk hari 1-3 (outer)
        for(int hari = 1; hari <= 3; hari++) {
            //Menampilkan Hari
            System.out.println("Hari " + hari + ":");
            //Lakukan perulangan for untuk waktu makan pagi dan siang (inner)
            for(int waktu = 1; waktu <= 2; waktu++) {
                //Melakukan pengecekan menggunakan if-else untuk hari, waktu, dan menu
                if (hari == 1) {
                    if (waktu == 1) {
                    System.out.println("Pagi: Nasi Goreng");
                    } else {
                    System.out.println("Siang: Soto Ayam");
                    }
                } else if (hari == 2) {
                    if (waktu == 1) {
                    System.out.println("Pagi: Bubur Ayam");
                    } else {
                    System.out.println("Siang: Mie Goreng");
                    }
                } else if (hari == 3) {
                    if (waktu == 1) {
                    System.out.println("Pagi: Roti Bakar");
                    } else {
                    System.out.println("Siang: Nasi Uduk");
                    }
                }
            }
         }
    }
}  

