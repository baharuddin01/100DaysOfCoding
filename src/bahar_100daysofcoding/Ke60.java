package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke60 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan dua angka
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        // operator logika 
        if (angka1 > 0 && angka2 > 0) {
            System.out.println("Kedua angka positif.");
        } else if (angka1 > 0 || angka2 > 0) {
            System.out.println("Salah satu angka positif.");
        } else {
            System.out.println("Kedua angka tidak positif.");
        }

        scanner.close();
    }
}
