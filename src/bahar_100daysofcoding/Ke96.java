package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke96 {
    public static void main(String[] args) {
        int ukuran;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan ukuran array: ");
        ukuran = sc.nextInt();

        int[] array = new int[ukuran];

        System.out.println("Masukkan nilai untuk array:");
        for (int i = 0; i < ukuran; i++) {
            System.out.print("Indeks " + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("Nilai array:");
        for (int i = 0; i < ukuran; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
