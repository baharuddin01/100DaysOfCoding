package bahar_100daysofcoding;

import java.util.Random;
import java.util.Scanner;

public class Ke99 {
    public static void main(String[] args) {
        String[] kata = {"bahar", "baharuddin", "abd_baharuddin"};

        Random random = new Random();
        int indeksKata = random.nextInt(kata.length);
        String kataTebak = kata[indeksKata];

        char[] tebakan = new char[kataTebak.length()];
        for (int i = 0; i < kataTebak.length(); i++) {
            tebakan[i] = '_';
        }

        Scanner sc = new Scanner(System.in);
        int kesempatan = 5;
        boolean berhasil = false;

        while (kesempatan > 0 && !berhasil) {
            System.out.println("Kata yang harus ditebak: " + String.valueOf(tebakan));
            System.out.println("Kesempatan tersisa: " + kesempatan);
            System.out.print("Masukkan tebakan huruf: ");
            char tebakanUser = sc.next().charAt(0);

            boolean tebakanBenar = false;

            for (int i = 0; i < kataTebak.length(); i++) {
                if (kataTebak.charAt(i) == tebakanUser) {
                    tebakan[i] = tebakanUser;
                    tebakanBenar = true;
                }
            }
            if (!tebakanBenar) {
                kesempatan--;
            }
            if (String.valueOf(tebakan).equals(kataTebak)) {
                berhasil = true;
            }
        }
        if (berhasil) {
            System.out.println("Selamat, Anda berhasil menebak kata \"" + kataTebak + "\"!");
        } else {
            System.out.println("Maaf, kesempatan Anda habis. Kata yang benar adalah \"" + kataTebak + "\".");
        }
        sc.close();
    }
}
