/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Operator Aritmatika
*/
public class p042OperatorAritmatika {
    public static void main(String[] args) {
        //Deklarasi a dan b bertipe int
        int a = 10;
        int b = 3;
        //Melakukan perhitungan dan menampilkan nilai variabel
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        //Pembagian dengan desimal
        double hasil = (double) a / b;
        System.out.println("a / b (desimal) = " + hasil);
    }
}
