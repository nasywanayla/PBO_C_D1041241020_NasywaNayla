/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Restoran
*/
public class LatihanRestoran {
    public static void main(String[] args) {
        //Menampilkan MENU RESTORAN
        System.out.println("=== MENU RESTORAN ===");
        //Deklarasi dan inisialisasi variabel
        int menuCode = 1;
        int quantity = 2;
        String namaMenu;
        int hargaSatuan;
        int totalBayar;
        //Menampilkan kode menu dan jumlah
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println();
        //Membuat switch untuk menu
        switch(menuCode) {
            case 1:
                namaMenu = "Nasi Goreng";
                hargaSatuan = 15000;
                totalBayar = hargaSatuan * quantity;
                System.out.println("Pesanan Anda:");
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp" + totalBayar);
                break;
            case 2:
                namaMenu = "Mie Ayam";
                hargaSatuan = 12000;
                totalBayar = hargaSatuan * quantity;
                System.out.println("Pesanan Anda:");
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp" + totalBayar);
                break;
            case 3:
                namaMenu = "Bakso";
                hargaSatuan = 10000;
                totalBayar = hargaSatuan * quantity;
                System.out.println("Pesanan Anda:");
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp" + totalBayar);
                break;
            case 4:
                namaMenu = "Soto Ayam";
                hargaSatuan = 13000;
                totalBayar = hargaSatuan * quantity;
                System.out.println("Pesanan Anda:");
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp" + totalBayar);
                break;
            case 5:
                namaMenu = "Es Teh";
                hargaSatuan =3000;
                totalBayar = hargaSatuan * quantity;
                System.out.println("Pesanan Anda:");
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp" + totalBayar);
                break;
        }
    }
}
