package bahar_100daysofcoding;

import java.util.Random;

public class Ke29 {
    public static void main(String[] args) {
        // Membuat objek Random
        Random bilangan = new Random();

        // Menghasilkan bilangan acak antara 1 dan 100
        int angka = bilangan.nextInt(100) + 1;

        // Mencetak bilangan acak ke layar
        System.out.println("Bilangan acak : " + angka);
    }
}
