package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah iterasi
        System.out.print("Masukkan jumlah iterasi: ");
        int jumlahIterasi = scanner.nextInt();

        // Loop menggunakan for
        for (int i = 1; i <= jumlahIterasi; i++) {
            System.out.println("Iterasi ke-" + i);

            // Pengecekan kondisi dengan if-else
            if (i % 2 == 0) {
                System.out.println("Bilangan genap");
            } else {
                System.out.println("Bilangan ganjil");
            }
        }
    }
}
