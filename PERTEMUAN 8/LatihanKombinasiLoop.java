/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Kombinasi Loop
*/
public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        //Menampilkan PENCARIAN KOORDINAT [2,3]
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        //Melakukan perulangan for untuk baris 1-3 (outer)
        for(int baris = 1; baris <= 3; baris++) {
            //Melakukan perulangan for untuk kolom 1-5 (inner)
            for(int kolom = 1; kolom <= 5; kolom++) {
                //Menampilkan koordinat yang sedang di cek
                System.out.println("Cek: [" + baris + ", " + kolom + "]");
                //Melakukan pengecekan apakah koordinat [2,3]
                if(baris == 2 && kolom == 3) {
                    //Menampilkan Koordinat
                    System.out.println("Koordinat ditemukan!");
                    //Memberhentikan perulangan inner
                    break;
                }
            }
            //Memberhentikan perulangan outer
            if(baris == 2) {
                break;
            }
        }
        System.out.println("Pencarian selesai.");
    }
    
}
