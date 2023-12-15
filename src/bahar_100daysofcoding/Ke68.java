package bahar_100daysofcoding;

import java.util.Random;

public class Ke68 {
    public static void main(String[] args) {
        // Tentukan ukuran matriks
        int baris = 2;
        int kolom = 2;

        // Hasilkan matriks acak
        int[][] matriks = generateRandomMatrix(baris, kolom);

        // Tampilkan matriks asli
        System.out.println("Matriks Asli:");
        displayMatrix(matriks);

        // Hitung dan tampilkan jumlah setiap baris
        int[] jumlahBaris = calculateRowSums(matriks);
        System.out.println("\nJumlah Setiap Baris:");
        displayArray(jumlahBaris);
    }

    // Fungsi untuk menghasilkan matriks acak
    private static int[][] generateRandomMatrix(int baris, int kolom) {
        Random random = new Random();
        int[][] matriks = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j] = random.nextInt(10); // Menghasilkan angka acak antara 0 dan 9
            }
        }

        return matriks;
    }

    // Fungsi untuk menghitung jumlah setiap baris
    private static int[] calculateRowSums(int[][] matriks) {
        int baris = matriks.length;
        int kolom = matriks[0].length;
        int[] jumlahBaris = new int[baris];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                jumlahBaris[i] += matriks[i][j];
            }
        }

        return jumlahBaris;
    }

    // Fungsi untuk menampilkan matriks
    private static void displayMatrix(int[][] matriks) {
        for (int[] baris : matriks) {
            for (int num : baris) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan sebuah array
    private static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
