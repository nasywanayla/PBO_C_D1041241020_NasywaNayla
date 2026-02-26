/*
NIM : D1041241020
Nama : Nasywa Nayla
Program Latihan Login
*/
public class LatihanLogin {

    public static void main(String[] args) {
        //Menampilkan VALIDASI LOGIN
        System.out.println("=== VALIDASI LOGIN ===");
        //Deklarasi username dan password
        String inputUsername = "admin";
        String inputPassword = "admin123";
        //Menampilkan username, password dan ---
        System.out.println("Username: " + inputUsername);
        System.out.println("Password: ****");
        System.out.println("---");
        //Melakukan pengecekan username menggunakan equals 
        if (inputUsername.equals("admin")) {
            //Menampilkan username valid
            System.out.println("Username valid");
            //Jika username benar maka cek password dan menampilkan login berhasil
            if (inputPassword.equals("admin123")) {
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, " + inputUsername);
            } else {
                //Menampilkan jika password salah dan login gagal
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }
        //Jika username salah dan menampilkan login gagal   
        } else {
            System.out.println("Username tidak ditemukan");
            System.out.println("LOGIN GAGAL!");
        }
        System.out.println();
        //Program berikut menampilkan ketika password salah dan login gagal
        System.out.println("=== VALIDASI LOGIN ===");
        inputUsername = "admin";
        inputPassword = "admin456";
        System.out.println("Username: " + inputUsername);
        System.out.println("Password: ****");
        System.out.println("---");

        if (inputUsername.equals("admin")) {
            System.out.println("Username valid");
            if (inputPassword.equals("admin123")) {
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, " + inputUsername);
            } else {
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }
           
        } else {
            System.out.println("Username tidak ditemukan");
            System.out.println("LOGIN GAGAL!");
        }  
    }
}

