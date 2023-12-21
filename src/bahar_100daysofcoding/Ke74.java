package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nilai :");
        int nilai = sc.nextInt();

        if (nilai >= 90 && nilai <= 100) {
            System.out.println("A");
        } else if (nilai >= 80 && nilai <= 89) {
            System.out.println("B");
        } else if (nilai >= 70 && nilai <= 79) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
