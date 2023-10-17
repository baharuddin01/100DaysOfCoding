package bahar_100daysofcoding;

import java.util.Scanner;

public class KeSembilan {
    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama (a): ");
        int a = nilai.nextInt();
        System.out.print("Masukkan bilangan kedua (b): ");
        int b = nilai.nextInt();
        
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        
        System.out.println("Nilai MIN: " + min);
        System.out.println("Nilai MAX: " + max);
        
        nilai.close();
    }
}