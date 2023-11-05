package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("nilai 1 :");
        int nilai1 = input.nextInt();
        System.out.println("nilai 2 :");
        int nilai2 = input.nextInt();
        
        int penjumlahan = nilai1 + nilai2;
        int pengurangan = nilai1 - nilai2;
        int perkalian = nilai1 * nilai2;
        int pembagian = nilai1 / nilai2;
        
        // Menampilkan menggunakan SOUT
        System.out.println(nilai1 +" + " +nilai2 +" = " + penjumlahan );
        System.out.println(nilai1 +" - " +nilai2 +" = " + pengurangan );
        System.out.println(nilai1 +" x " +nilai2 +" = " + perkalian );
        System.out.println(nilai1 +" / " +nilai2 +" = " + pembagian );
    }
}
