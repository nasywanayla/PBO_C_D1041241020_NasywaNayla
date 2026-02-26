/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Validasi
*/
public class LatihanValidasi {
    public static void main(String[] args) {
        //Menampilkan VALIDASI NILAI UJIAN
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        //Deklarasi variabel nilai dan i
        int nilai;
        int i = 1;
        System.out.println();
        //Melakukan perulangan do-while untuk simulasi 3 percobaan input
        do {
            if(i == 1) {
                nilai = -10;
            } else if (i == 2) {
                nilai = 150;
            } else {
                nilai = 85;
            }
            //Menampilkan nilai 
            System.out.println("Percobaan Input: " + nilai);
            //Memvalidasi apakah nilai di luar rentang 0-100
            if(nilai < 0 || nilai > 100) {
            System.out.println("Error: Nilai harus antara 0-100!");
            System.out.println();
            }
            //menambah percobaan
            i++;
            //Perulangan akan berhenti jika nilai sudah valid
        }
        while (nilai < 0 || nilai > 100);
        System.out.println("Nilai valid: " + nilai);
    }
}
