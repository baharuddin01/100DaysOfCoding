package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();

        if (angka > 10) {
            System.out.println("Angka lebih besar dari 10.");
        } else {
            System.out.print("Angka kurang dari atau sama dengan 10. Masukkan angka lain: ");
            int angkaBaru = scanner.nextInt();

            if (angkaBaru > 10) {
                System.out.println("Angka baru lebih besar dari 10.");
            } else {
                System.out.println("Angka baru juga kurang dari atau sama dengan 10.");
            }
        }

        scanner.close();
    }
}
