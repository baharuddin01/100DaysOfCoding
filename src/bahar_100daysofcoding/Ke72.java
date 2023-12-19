package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke72 {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan nama
        String[] namaArray = new String[5];

        // Mengisi array dengan input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Nama ke-" + (i + 1) + ": ");
            namaArray[i] = scanner.nextLine();
        }

        // Menampilkan nama dari array
        System.out.println("\nNama yang dimasukkan:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Nama ke-" + (i + 1) + ": " + namaArray[i]);
        }

        // Menutup scanner
        scanner.close();
    }
}
