package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan untuk menghitung faktorial: ");
        int bilangan = scanner.nextInt();

        long faktorial = hitungFaktorial(bilangan);

        System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);

        scanner.close();
    }

    private static long hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
}
