package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke66 {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi sebuah array
        int[] angka = {3, 7, 10, 5, 8, 12, 4};
        Scanner cs = new Scanner(System.in);

        // Menampilkan elemen-elemen array
        System.out.print("Isi array: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        // Nilai yang dicari dalam array
        System.out.print("masukkan nilai : ");
        int nilaiCari = cs.nextInt();

        // Mencari nilai dalam array dan menampilkan indeksnya
        boolean nilaiDitemukan = false;
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == nilaiCari) {
                System.out.println("Nilai " + nilaiCari + " ditemukan di indeks " + i);
                nilaiDitemukan = true;
                break; // Keluar dari loop setelah nilai ditemukan
            }
        }

        // Menampilkan pesan jika nilai tidak ditemukan
        if (!nilaiDitemukan) {
            System.out.println("Nilai " + nilaiCari + " tidak ditemukan dalam array");
        }
    }
}
