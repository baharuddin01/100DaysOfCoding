package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data karyawan
        System.out.print("Masukkan nama karyawan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jumlah jam kerja per minggu: ");
        double jamKerja = scanner.nextDouble();

        // Gaji per jam dan diskon
        double gajiPerJam = 10000.0; 
        double diskon = 0.05; 

        // Hitung gaji karyawan
        double gaji = jamKerja * gajiPerJam;
        double potonganDiskon = gaji * diskon;
        double gajiTotal = gaji - potonganDiskon;

        // Output hasil perhitungan
        System.out.println("\n===== RINCIAN GAJI =====");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Jam Kerja per Minggu: " + jamKerja + " jam");
        System.out.println("Gaji per Jam: Rp" + gajiPerJam);
        System.out.println("Gaji Sebelum Diskon: Rp" + gaji);
        System.out.println("Diskon (" + (diskon * 100) + "%): Rp" + potonganDiskon);
        System.out.println("Gaji Bersih: Rp" + gajiTotal);

        scanner.close();
    }
}
