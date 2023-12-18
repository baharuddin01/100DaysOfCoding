package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Angka 1: ");
        int angka1 = input.nextInt();

        System.out.println("Angka 2 : ");
        int angka2 = input.nextInt();

        if (angka1 > angka2 && angka2 == 0) {
            System.out.println("Angka 1 lebih besar dari Angka 2.");
        } else if (angka1 != 1) {
            System.out.println("Angka 2 lebih besar dari Angka 1.");
        } else {
            System.out.println("Kondisi lainnya.");
        }
    }
}
