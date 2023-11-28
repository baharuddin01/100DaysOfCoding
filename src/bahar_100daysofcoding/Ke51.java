package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan jumlah angka yang akan diuji
        System.out.print("jumlah: ");
        int jumlah = sc.nextInt();

        // Loop untuk memproses sejumlah angka sesuai dengan input pengguna
        for (int i = 1; i <= jumlah; i++) {
            // Meminta pengguna untuk memasukkan nilai angka
            System.out.print("nilai: ");
            int nilai = sc.nextInt();

            // Memeriksa apakah nilai angka adalah genap atau ganjil
            if (nilai % 2 == 0) {
                System.out.println("genap");
            } else {
                System.out.println("ganjil");
            }
        }
    }
}
