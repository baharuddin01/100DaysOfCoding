package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("nama :");
        String nama = sc.nextLine();
        
        System.out.print("umur :");
        int umur = sc.nextInt();
        
        if (17 > umur ) {
            System.out.println("blum bisa membuat sim");
        }else{
            System.out.println("sudah bisa membuat sim");
        }
    }
}
