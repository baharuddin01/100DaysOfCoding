package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan ukuran array: ");
        int ukuran = sc.nextInt();

        int[] dataArray = new int[ukuran];

        for (int i = 0; i < ukuran; i++) {
            System.out.print("Masukkan elemen " + i + ": ");
            dataArray[i] = sc.nextInt();
        }
        int jumlah = 0;
        for (int i = 0; i < ukuran; i++) {
            jumlah += dataArray[i];
        }
        System.out.print("Elemen-elemen array: ");
        for (int i = 0; i < ukuran; i++) {
            System.out.print(dataArray[i] + " ");
        }
        System.out.println("\nJumlah elemen array: " + jumlah);

        sc.close();
    }
}
