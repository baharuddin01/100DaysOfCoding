package bahar_100daysofcoding;

import java.util.Scanner;
public class Ke90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int panjangArray = scanner.nextInt();

        int[] array = new int[panjangArray];

        System.out.println("Masukkan elemen-elemen array (urutkan secara ascending):");
        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Masukkan elemen yang ingin dicari: ");
        int target = scanner.nextInt();

        int hasilPencarian = binarySearch(array, target);

        if (hasilPencarian != -1) {
            System.out.println("Elemen " + target + " ditemukan di indeks " + hasilPencarian + ".");
        } else {
            System.out.println("Elemen " + target + " tidak ditemukan dalam array.");
        }

        scanner.close();
    }

    private static int binarySearch(int[] array, int target) {
        int kiri = 0;
        int kanan = array.length - 1;

        while (kiri <= kanan) {
            int tengah = kiri + (kanan - kiri) / 2;

            if (array[tengah] == target) {
                return tengah;
            }

            if (array[tengah] < target) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }

        return -1; // Elemen tidak ditemukan
    }
}
