package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke25 {
    public static void main(String[] args) {
        Scanner gji = new Scanner(System.in);
        
        // Meminta pengguna memasukkan gaji
        System.out.println("Masukkan gaji: ");
        double gaji = gji.nextDouble();
        
        // Menampilkan gaji yang dimasukkan oleh pengguna
        System.out.println("Gaji : " + gaji);
        
        // Menghitung dan menampilkan pajak berdasarkan jumlah gaji
        if (gaji >= 3000000){
            // Pajak 5%
            System.out.println("Pajak 5%");
            System.out.println(gaji - (gaji * 0.05));
        }else if (gaji >= 5000000){
            // Pajak 10%
            System.out.println("Pajak 10%");
            System.out.println(gaji - (gaji * 0.1));
        }else{
            // Jika gaji kurang dari 3.000.000
            System.out.println("Tidak Kenak Pajak");
        }
    }
}
