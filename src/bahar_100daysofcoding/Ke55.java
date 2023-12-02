package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int rows = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int cols = scanner.nextInt();
        // Inisialisasi array 2D
        int[][] array2D = new int[rows][cols];
        // Input elemen-elemen array 2D
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Array[" + i + "][" + j + "]: ");
                array2D[i][j] = scanner.nextInt();
            }
        }
        // Hitung rata-rata elemen-elemen array
        double total = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                total += array2D[i][j];
            }
        }
        double rataRata = total / (rows * cols);
        System.out.println("Rata-rata elemen array: " + rataRata);

        // Tutup scanner
        scanner.close();
    }
}
