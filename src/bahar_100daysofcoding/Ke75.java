package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("jumlah gaji : ");
        int g = sc.nextInt();
        if (g >= 3000) {
            System.out.println("pajak 5 %");
            System.out.println(g-(g*0.05));
        } else if (g >= 5000) {
            System.out.println("pajak 10 %");
            System.out.println(g-(g*0.1));
        }else{
            System.out.println("tidak ada pajak");
        }
    }
}
