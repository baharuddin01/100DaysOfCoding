package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b ;
        System.out.println("favor ingresar el primer valor : ");
        a = sc.nextInt();
        System.out.println("favor ingresar el primer valor : ");
        b = sc.nextInt();
        
        // Looping dari 1 hingga 10
        for (int i = a; i <= b; i++) {
            // Cek apakah nilai i genap atau ganjil
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }
    }
}
