package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int batas = 40;
        int ganjil = 0;
        int genap = 0;
        
        System.out.print("Masukkan jumalah angkah genap dan ganjil : ");
        int ganjilGenap = sc.nextInt();

        System.out.println("Bilangan Ganjil:");
        for (int i = 1; i <= batas && ganjil < ganjilGenap; i += 2) {
            System.out.println(i + " ");
            ganjil++;
        }
        System.out.println("Bilangan Genap:");
        for (int i = 2; i <= batas && genap < ganjilGenap; i += 2) {
            System.out.println(i + " ");
            genap++;
        }
    }
}
