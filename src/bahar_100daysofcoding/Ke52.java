package bahar_100daysofcoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Ke52 {
    public static void main(String[] args) {
        ArrayList<String> arrayString = new ArrayList<>();
        ArrayList<Integer> arrayAngka = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah karakternya: ");
        int jumlah = sc.nextInt();

        // Membersihkan newline character di buffer
        sc.nextLine();

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan input ke-" + i + ": ");
            String input = sc.nextLine();

            // Memeriksa apakah input merupakan string atau angka
            try {
                // Jika dapat diubah menjadi angka, tambahkan ke dalam array angka
                int angka = Integer.parseInt(input);
                arrayAngka.add(angka);
            } catch (NumberFormatException e) {
                // Jika tidak dapat diubah menjadi angka, tambahkan ke dalam array string
                arrayString.add(input);
            }
        }

        // Menampilkan isi array string
        System.out.println("Array String: " + arrayString);

        // Menampilkan isi array angka
        System.out.println("Array Angka: " + arrayAngka);

        // Menutup scanner
        sc.close();
    }
}
