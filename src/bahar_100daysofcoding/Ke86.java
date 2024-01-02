package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input dari pengguna
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();

        // Memeriksa apakah bilangan tersebut adalah bilangan prima
        boolean isPrime = true;
        if (bilangan <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(bilangan); i++) {
                if (bilangan % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Menampilkan hasil
        if (isPrime) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }

        // Menutup scanner
        scanner.close();
    }
}
