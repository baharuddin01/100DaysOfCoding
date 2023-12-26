package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();

        // Inisialisasi array untuk menyimpan data
        int[] data = new int[jumlahData];

        // Memasukkan data ke dalam array
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        // Memanggil fungsi untuk menghitung rata-rata
        double rataRata = hitungRataRata(data);
        System.out.println("Rata-rata data: " + rataRata);

        // Memanggil fungsi untuk menemukan nilai maksimum
        int nilaiMaksimum = cariNilaiMaksimum(data);
        System.out.println("Nilai maksimum: " + nilaiMaksimum);

        scanner.close();
    }

    // Fungsi untuk menghitung rata-rata data
    private static double hitungRataRata(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return (double) total / data.length;
    }

    // Fungsi untuk mencari nilai maksimum dalam data
    private static int cariNilaiMaksimum(int[] data) {
        int maksimum = data[0];
        for (int nilai : data) {
            if (nilai > maksimum) {
                maksimum = nilai;
            }
        }
        return maksimum;
    }
}
