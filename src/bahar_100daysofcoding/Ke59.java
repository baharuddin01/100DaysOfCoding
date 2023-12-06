package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke59 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah angka yang ingin dihitung rata-ratanya: ");
            int jumlahAngka = input.nextInt();

            if (jumlahAngka <= 0) {
                System.out.println("Jumlah angka harus lebih dari 0.");
                return;
            }

            int[] angka = new int[jumlahAngka];
            int total = 0;

            for (int i = 0; i < angka.length; i++) {
                System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
                angka[i] = input.nextInt();
                total += angka[i];
            }

            double rataRata = (double) total / jumlahAngka;

            System.out.println("\nOutput:");
            System.out.println("Rata-rata dari " + jumlahAngka + " angka adalah " + rataRata);
        }
    }
}
