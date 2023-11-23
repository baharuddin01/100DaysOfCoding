/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahar_100daysofcoding;
public class Ke46 {
    public static void main(String[] args) {
        int tinggi = 6; // Anda dapat mengganti tinggi sesuai keinginan
        int lebar = 4; // Anda dapat mengganti lebar sesuai keinginan

        // Membuat pola persegi panjang bintang
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= lebar; j++) {
                System.out.print("*");
            }
            System.out.println(); // Pindah ke baris baru setelah setiap baris selesai
        }
    }
}
