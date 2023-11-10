package bahar_100daysofcoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ke33 {
    public static void main(String[] args) {
        // Membuat objek untuk mengambil input dari pengguna
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";
        String umur = "";
        String nim = "";

        // Meminta pengguna memasukkan nama
        System.out.println("Masukkan nama anda: ");
        try {
            nama = data.readLine();
        } catch (IOException e) {
            // Tangani kesalahan jika terjadi saat membaca input nama
        }

        // Meminta pengguna memasukkan umur
        System.out.println("Masukkan umur anda: ");
        try {
            umur = data.readLine();
        } catch (IOException e) {
            // Tangani kesalahan jika terjadi saat membaca input umur
        }

        // Meminta pengguna memasukkan NIM
        System.out.println("Masukkan nim anda: ");
        try {
            nim = data.readLine();
        } catch (IOException e) {
            // Tangani kesalahan jika terjadi saat membaca input NIM
            System.out.println("Error: " + e);
        }

        // Menampilkan informasi yang dimasukkan oleh pengguna
        System.out.println("Selamat datang " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("NIM     : " + nim);
    }
}
