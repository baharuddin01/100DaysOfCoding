package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke44 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mendapatkan input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan angka
        System.out.print("Masukkan sebuah angka: ");
        int number = scanner.nextInt();

        // Percabangan untuk menentukan apakah angka positif, negatif, atau nol
        if (number > 0) {
            System.out.println("Angka positif.");
        } else if (number < 0) {
            System.out.println("Angka negatif.");
        } else {
            System.out.println("Angka nol.");
        }

        // Menutup objek Scanner
        scanner.close();
    }
}
