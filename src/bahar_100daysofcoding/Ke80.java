package bahar_100daysofcoding;
import java.util.Scanner;

public class KalkulatorFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        long faktorial = hitungFaktorial(angka);

        System.out.println("Faktorial dari " + angka + " adalah: " + faktorial);
    }

    private static long hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
}
