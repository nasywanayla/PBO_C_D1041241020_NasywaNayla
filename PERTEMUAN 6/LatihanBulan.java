/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Bulan
*/
public class LatihanBulan {
    public static void main(String[] args) {
        //Menampilkan KONVERSI BULAN
        System.out.println("=== KONVERSI BULAN ===");
        //Deklarasi dan inisialisasi variabel tipe data int
        int month = 5;
        //Menampilkan nilai month
        System.out.println("Angka Bulan: " + month);
        //Deklarasi nama bulan tipe data string
        String namaBulan;
        //Membuat switch untuk 12 bulan dan menampilkan bulan 
        switch (month) {
            case 1:
                namaBulan = "Januari";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 2:
                namaBulan = "Februari";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 3:
                namaBulan = "Maret";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 4:
                namaBulan = "April";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 5:
                namaBulan = "Mei";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 6:
                namaBulan = "Juni";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 7:
                namaBulan = "Juli";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 8:
                namaBulan = "Agustus";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 9:
                namaBulan = "September";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 10:
                namaBulan = "Oktober";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 11:
                namaBulan = "November";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 12:
                namaBulan = "Desember";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            //Default untuk menghindarkan terjadinya error
            default:
                System.out.println("Error: Angka bulan tidak valid (1-12)");
                break;
        }
        System.out.println();
        //Membuat program untuk bulan 13
        System.out.println("=== KONVERSI BULAN ===");
        month = 13;
        System.out.println("Angka Bulan: " + month);
        switch (month) {
            case 1:
                namaBulan = "Januari";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 2:
                namaBulan = "Februari";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 3:
                namaBulan = "Maret";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 4:
                namaBulan = "April";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 5:
                namaBulan = "Mei";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 6:
                namaBulan = "Juni";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 7:
                namaBulan = "Juli";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 8:
                namaBulan = "Agustus";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 9:
                namaBulan = "September";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 10:
                namaBulan = "Oktober";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 11:
                namaBulan = "November";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 12:
                namaBulan = "Desember";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            default:
                System.out.println("Error: Angka bulan tidak valid (1-12)");
                break;
        }
    } 
}
