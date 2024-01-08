
package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = sc.nextInt();

        int[] angka = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        int jumlah = 0;
        for (int num : angka) {
            jumlah += num;
        }

        System.out.println("Jumlah elemen array: " + jumlah);
    }
}