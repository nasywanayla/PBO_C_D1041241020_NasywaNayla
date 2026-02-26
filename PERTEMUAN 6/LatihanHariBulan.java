/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Hari Bulan
*/
public class LatihanHariBulan {
    public static void main(String[] args) {
        //Menampilkan JUMLAH HARI DALAM BULAN
        System.out.println("=== JUMLAH HARI DALAM BULAN ===");
        //Deklarasi dan inisialisasi variabel
        int month = 4;
        String namaBulan;
        //Membuat switch case untuk bulan
        switch(month) {
            case 1:
                namaBulan = "Januari";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-1)");
                break;
            case 2:
                namaBulan = "Februari";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-2)");
                break;
            case 3:
                namaBulan = "Maret";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-3)");
                break;
            case 4:
                namaBulan = "April";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-4)");
                break;
            case 5:
                namaBulan = "Mei";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-5)");
                break;
            case 6:
                namaBulan = "Juni";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-6)");
                break;
            case 7:
                namaBulan = "Juli";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-7)");
                break;
            case 8:
                namaBulan = "Agustus";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-8)");
                break;
            case 9:
                namaBulan = "September";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-9)");
                break;
            case 10:
                namaBulan = "Oktober"; 
                System.out.println("Bulan: " + namaBulan + " (bulan ke-10)");
                break;
            case 11:
                namaBulan = "November";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-11)");
                break;
            case 12:
                namaBulan = "Desember";
                System.out.println("Bulan: " + namaBulan + " (bulan ke-12)");
                break;
        }
        //Membuat fall through untuk hari dalam bulan
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                //Menampilkan bulan dengan 31 hari 
                System.out.println("Jumlah hari: 31 hari");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                //Menampilkan bulan dengan 30 hari 
                System.out.println("Jumlah hari: 30 hari");
                break;
            case 2:
                //Menampilkan bulan dengan 28 hari 
                System.out.println("Jumlah hari: 28 hari");
                break;
        }   
    }
}
