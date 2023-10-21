package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke13 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Anda memasukkan angka genap.");
        } else {
            System.out.println("Anda memasukkan angka ganjil.");
        }

        scanner.close();
    }
}
