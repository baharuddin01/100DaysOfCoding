package bahar_100daysofcoding;

import java.util.Scanner;
public class KeDelapan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan biodata
        System.out.println("Silakan masukkan biodata Anda:");

        // Meminta nama
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        // Meminta usia
        System.out.print("Usia: ");
        int usia = scanner.nextInt();
        scanner.nextLine(); // Membersihkan karakter newline dari buffer

        // Meminta alamat
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();

        // Menampilkan biodata
        System.out.println("\nBiodata Anda:");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Alamat: " + alamat);

        // Menutup objek Scanner
        scanner.close();
    }
}
