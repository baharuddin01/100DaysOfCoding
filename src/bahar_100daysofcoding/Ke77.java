package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menetapkan nilai awal
        int nilai = 50;
        System.out.println("Nilai awal: " + nilai);

        // Meminta input pengguna untuk memperbarui nilai
        System.out.print("Masukkan nilai baru: ");
        int nilaiBaru = scanner.nextInt();
        // Memperbarui nilai
        nilai = nilaiBaru;
        System.out.println("Nilai setelah diperbarui: " + nilai);
        scanner.close();
    }
}
