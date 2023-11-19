package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukkan nilai n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("+");
            for (int j = 0; j < i; j++) {
                System.out.print("---+");
            }
            
            System.out.println();
            
            System.out.print("|");
            for (int j = 0; j < i; j++) {
                System.out.print("   |");
            }
            
            System.out.println();
            
        }
        System.out.print("+");
        for (int i = 0; i < n; i++) {
            System.out.print("---+");
        }
        System.out.println();
    }
}
