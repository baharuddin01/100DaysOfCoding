package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke57 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];

        // Input elemen-elemen matriks dari pengguna
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai elemen-elemen matriks 2x2:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Tentukan batas baris dan kolom subarray
        int startRow = 0;
        int endRow = 1;
        int startCol = 0;
        int endCol = 1;

        // Hitung jumlah elemen pada subarray
        int sum = 0;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                sum += matrix[i][j];
            }
        }

        // Tampilkan hasil
        System.out.println("Jumlah elemen pada subarray yang dimaksud: " + sum);

        // Tutup scanner
        sc.close();
    }
}
