package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke58 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        String mahasiswa[][] = new String[2][3];

        for (int i = 0; i < 2; i++) {
            System.out.println("");
            System.out.println("Data Mahasiswa ke " + (i + 1));

            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("NIM       :");
                else if (j == 1)
                    System.out.print("Nama      : ");
                else
                    System.out.print("Nilai     : ");

                System.out.print("");
                mahasiswa[i][j] = masuk.next();
            }
        }

        System.out.println("Data Mahasiswa yang dimasukan");
        System.out.println("-----------------------------");

        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 3; j++) {
                
                System.out.print(mahasiswa[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
