package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah elemen dari pengguna
        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();

        // Membuat array untuk menyimpan elemen-elemen
        int[] array = new int[n];

        // Mengambil input elemen dari pengguna dan menyimpannya dalam array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Menghitung hasil penjumlahan dari elemen-elemen
        int hasilJumlah = 0;
        for (int i = 0; i < n; i++) {
            hasilJumlah += array[i];
        }

        // Mencetak hasil penjumlahan
        System.out.println("Hasil penjumlahan elemen-elemen: " + hasilJumlah);
    }
}
