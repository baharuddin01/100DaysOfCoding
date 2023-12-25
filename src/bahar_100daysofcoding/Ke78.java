package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah iterasi: ");
        int jumlahIterasi = scanner.nextInt();

        for (int i = 1; i <= jumlahIterasi; i++) {
            System.out.println("Iterasi ke-" + i);

            System.out.print("Masukkan nilai: ");
            int nilai = scanner.nextInt();

            // Percabangan
            if (nilai >= 70) {
                System.out.println("Lulus");
            } else {
                System.out.println("Tidak Lulus");
            }

            // Penggunaan switch-case
            switch (i % 2) {
                case 0:
                    System.out.println("Iterasi genap");
                    break;
                case 1:
                    System.out.println("Iterasi ganjil");
                    break;
            }
        }

        System.out.println("Selesai");
        scanner.close();
    }
}
