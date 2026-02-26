/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Total Genap
*/
public class LatihanTotalGenap {
    public static void main(String[] args) {
        //Menampilkan TOTAL BILANGAN GENAP 1-20
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
        //Deklarasi total
        int total = 0;
        //Lakukan perulangan for dari 1 sampai 20
        for(int i = 1; i <= 20; i++) {
            //Melakukan pengecekan bilangan ganjil, dan jika iya maka lewati
            if(i % 2 != 0) {
                continue;
            }
            //Jika bilangan genap, tambahkan ke total
            total += i;
            //Menampilkan total
            System.out.println("Tambah: " + i + " -> Total: " + total);
        }
        System.out.println("---");
        System.out.println("Total akhir: " + total);
    }
}
