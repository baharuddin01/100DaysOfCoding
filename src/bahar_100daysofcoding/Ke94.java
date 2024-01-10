/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahar_100daysofcoding;

import java.util.Scanner;
public class Ke94 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        System.out.print("Berapa banyak angka yang ingin Anda masukkan: ");
        int jumlahAngka = masuk.nextInt();

        double[] angka = new double[jumlahAngka];

        // Mengisi array dengan angka yang dimasukkan pengguna
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = masuk.nextDouble();
        }

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = masuk.next().charAt(0);

        // Melakukan operasi matematika sesuai operator yang dimasukkan
        double hasil = angka[0];
        for (int i = 1; i < jumlahAngka; i++) {
            switch (operator) {
                case '+':
                    hasil += angka[i];
                    break;
                case '-':
                    hasil -= angka[i];
                    break;
                case '*':
                    hasil *= angka[i];
                    break;
                case '/':
                    if (angka[i] != 0) {
                        hasil /= angka[i];
                    } else {
                        System.out.println("Pembagian dengan nol tidak valid.");
                        return; // Keluar dari program jika pembagian dengan nol
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid.");
                    return; // Keluar dari program jika operator tidak valid
            }
        }

        System.out.println("Hasil operasi: " + hasil);
    }
}
