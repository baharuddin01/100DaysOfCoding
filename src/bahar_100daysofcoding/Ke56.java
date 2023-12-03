package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke56 {
    // Variabel flag untuk menandakan apakah nilai lebar dan tinggi sudah sesuai
    static boolean flag;
    // Variabel lebar
    static int B;
    // Variabel tinggi
    static int H;

    // Blok inisialisasi statis
    static {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner io = new Scanner(System.in);
        // Membaca nilai lebar dari pengguna
        System.out.print("masukkan lebar : ");
        B = io.nextInt();
        // Membaca nilai tinggi dari pengguna
        System.out.print("masukkan tinggi : ");
        H = io.nextInt();
        // Memeriksa apakah nilai lebar dan tinggi positif
        if (B > 0 && H > 0) {
            // Jika positif, set flag menjadi true
            flag = true;
        } else {
            // Jika tidak, cetak pesan kesalahan
            System.out.println("priksa ulang nilai yang di masukkan apakah lebih dari nol(0)");
        }
    }

    // Metode utama
    public static void main(String[] args) {
        // Memeriksa nilai flag
        if (flag) {
            // Jika flag true, hitung dan cetak luas
            int area = B * H;
            System.out.println("Luas : 1"+area);
        }
    }
}
