package bahar_100daysofcoding;

import java.util.Arrays;

public class Ke26 {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array
        int[] numbers = {6, 2, 4, 5, 8};

        // Menampilkan isi array
        System.out.println("Isi array: " + Arrays.toString(numbers));
       
        // Menghitung rata-rata isi array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double hasil = (double) sum / numbers.length;
        System.out.println("Hasil penjumlah: " + sum);       
        System.out.println("Banyaknya elemen: " + numbers.length);       
        System.out.println("Rata-rata: " + hasil);

    }
}
