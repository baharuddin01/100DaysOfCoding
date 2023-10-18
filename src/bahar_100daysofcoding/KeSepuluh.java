package bahar_100daysofcoding;

import java.util.Scanner;

public class KeSepuluh {
    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan a: ");
        int a = nilai.nextInt();
        
        System.out.print("Masukkan bilangan b: ");
        int b = nilai.nextInt();
        
        System.out.print("Masukkan bilangan c: ");
        int c = nilai.nextInt();
        
        System.out.print("Masukkan bilangan d: ");
        int d = nilai.nextInt();
        
        System.out.print("Masukkan bilangan e: ");
        int e = nilai.nextInt();
        
        int min = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
        int max = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
        
        System.out.println("Nilai MIN: " + min);
        System.out.println("Nilai MAX: " + max);
        
        nilai.close();

    }
}
