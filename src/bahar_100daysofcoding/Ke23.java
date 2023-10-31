package bahar_100daysofcoding;
import java.util.Scanner; 
public class Ke23 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); // ini Membuat objek Scanner untuk menerima input
        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = inputScanner.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = inputScanner.nextDouble();
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga: " + luas);
        inputScanner.close(); //penutup objeck Scanner
    }
}
