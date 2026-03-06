//Membuat Class Persegi
class Persegi {
    //Membuat Atribut
    int sisi = 0;
    int luas = 0;
    int keliling = 0;
    //Membuat Method Tampilkan Hasil
    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println();
        System.out.println("Sisi : " + sisi + " cm");
        System.out.println();
        System.out.println("Luas : " + luas + " cm^2");
        System.out.println();
        System.out.println("Keliling : " + keliling + " cm");
        System.out.println();
    }
    //Membuat Method hitung luas
    public void hitungLuas() {
        luas = sisi * sisi;
        System.out.println();
    }
    //Membuat hitung keliling
    public void hitungKeliling() {
        keliling = 4 * sisi;
        System.out.println();
    }
}
public class LatihanClassPersegi {
    public static void main(String[] args) {
        //Membuat object persegi
        Persegi persegi1 = new Persegi();
        persegi1.sisi = 5;
        
        //Menampilkan Method
        persegi1.hitungKeliling();
        persegi1.hitungLuas();
        persegi1.tampilkanHasil();
    } 
}
