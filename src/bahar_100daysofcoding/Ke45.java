package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukkan angka 1 sampai 7 :");
        int hari = sc.nextInt();

        String namaHari;
        switch (hari) {
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
                break;
            case 3:
                namaHari = "Selasa";
                break;
            case 4:
                namaHari = "Rabu";
                break;
            case 5:
                namaHari = "Kamis";
                break;
            case 6:
                namaHari = "Jumat";
                break;
            case 7:
                namaHari = "Sabtu";
                break;
            default:
                namaHari = "Tidak valid";
        }

        // Menampilkan hasil
        System.out.println("Hari ke-" + hari + " adalah " + namaHari);

        // Menutup scanner
        sc.close();
    }
}
