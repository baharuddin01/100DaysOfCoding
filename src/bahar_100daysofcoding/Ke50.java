package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan panjang array
        System.out.print("Masukkan panjang array: ");
        int panjangArray = scanner.nextInt();

        // Membuat array integer dengan panjang yang dimasukkan pengguna
        int[] arrayAngka = new int[panjangArray];

        // Mengisi array dengan input dari pengguna
        System.out.println("Masukkan nilai-nilai array:");

        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Nilai index ke-" + i + ": ");
            arrayAngka[i] = scanner.nextInt();
        }

        // Menampilkan nilai array
        System.out.println("Nilai array yang dimasukkan pengguna:");

        for (int i = 0; i < panjangArray; i++) {
            System.out.println("Nilai index ke-" + i + ": " + arrayAngka[i]);
        }

        // Menutup scanner
        scanner.close();
    }
}
