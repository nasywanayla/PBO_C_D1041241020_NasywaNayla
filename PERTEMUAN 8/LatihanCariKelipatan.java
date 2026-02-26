/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Cari Kelipatan
*/
public class LatihanCariKelipatan {
    public static void main(String[] args) {
        //Menampilkan CARI KELIPATAN 7
        System.out.println("=== CARI KELIPATAN 7 ===");
        //Melakukan perulangan for dari 1-50
        for(int i = 1; i <= 50; i++) {
            //Menampilkan nilai
            System.out.println("Cek: " + i);
            //Melakukan pengecekan apakah kelipatan 7
            if(i % 7 == 0) {
                //Menampilkan kelipatan
                System.out.println("Kelipatan 7 pertama: " + i);
                //Break untuk memberhentikan perulangan
                break; 
            }
        }
        System.out.println("Pencarian Selesai.");
    }
}
