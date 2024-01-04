/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke88 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah iterasi
        System.out.print("Masukkan jumlah iterasi: ");
        int jumlahIterasi = scanner.nextInt();

        // Loop for untuk melakukan iterasi sejumlah yang diminta oleh pengguna
        for (int i = 0; i < jumlahIterasi; i++) {
            // Meminta pengguna memasukkan dua angka pada setiap iterasi
            System.out.print("Masukkan angka pertama: ");
            int angka1 = scanner.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int angka2 = scanner.nextInt();

            // Menghitung jumlah angka
            int jumlah = angka1 + angka2;

            // Menentukan apakah jumlahnya genap atau ganjil dan menampilkan hasil
            if (jumlah % 2 == 0) {
                System.out.println("Iterasi ke-" + (i + 1) + ": Jumlah angka genap.");
            } else {
                System.out.println("Iterasi ke-" + (i + 1) + ": Jumlah angka ganjil.");
            }
        }

        scanner.close();
    }
}
