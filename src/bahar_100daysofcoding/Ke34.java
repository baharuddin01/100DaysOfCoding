package bahar_100daysofcoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ke34 {
    public static void main(String[] args) throws IOException{
        // Inisialisasi BufferedReader untuk mengambil input dari pengguna
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        // Deklarasi variabel untuk menyimpan data nama, nim, umur, dan alamat
        String nim = "", nama = "", umur = "", alamat = "";

        // Meminta pengguna memasukkan nama
        System.out.println("Masukkan nama anda:");
        nama = dataIn.readLine();

        // Meminta pengguna memasukkan nim
        System.out.println("Masukkan nim anda:");
        nim = dataIn.readLine();

        // Meminta pengguna memasukkan alamat
        System.out.println("Masukkan alamat anda:");
        alamat = dataIn.readLine();

        // Meminta pengguna memasukkan umur
        System.out.println("Masukkan umur anda:");
        umur = dataIn.readLine();
        
        // Output dari data yang telah dimasukkan oleh pengguna
        System.out.println("");
        System.out.println("----------------------------------------------------");
        System.out.println("Selamat datang " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Umur        : " + umur);
    }
}
