/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Persegi Constructor
*/

//Membuat Atribut
class Persegi {
    int sisi = 0;
    int luas = 0;
    int keliling = 0;
//Membuat Constructor dengan 1 Parameter
public Persegi(int sisi) {
    if (sisi <= 0) {
        System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
        this.sisi = 1;  
    } else {
        this.sisi = sisi;
    }
    this.luas = this.sisi * this.sisi;
    this.keliling = 4 * this.sisi;
}

//Membuat method dan Menampilkan Persegi
public void tampilkanHasil(){
    System.out.println("=== PERSEGI ===");
    System.out.println("Sisi     : " + sisi + " cm");
    System.out.println("Luas     : " + luas + " cm^2");
    System.out.println("Keliling : " + keliling + " cm");
    System.out.println();
    }
}
public class LatihanPersegiConstructor {
    public static void main(String[] args) {
        //Membuat Object 1 dengan sisi valid misalnya 5
        Persegi persegi1 = new Persegi(5);
        persegi1.tampilkanHasil();
        //Membuar Object 2 dengan sisi invalid misalnya -3
        Persegi persegi2 = new Persegi(-3);
        persegi2.tampilkanHasil();
    }
}
