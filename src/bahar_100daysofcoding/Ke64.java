package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke64 {
    public static void main(String[] args) {
        Scanner material = new Scanner(System.in);
        int pilihan, jumlah, totalHarga = 0;
        String proyek = null;

        System.out.println(">>>>>material proyek<<<<<");

        // Melakukan loop untuk memasukkan material proyek
        while (true) {
            System.out.println("1. semen \n2. besi \n3. cat \n4. paku \n5. Selesai");
            System.out.print("pilihan  : ");
            pilihan = material.nextInt();

            // Keluar dari loop jika user memilih untuk selesai
            if (pilihan == 5) {
                break;
            }

            System.out.print("jumlah   : ");
            jumlah = material.nextInt();

            double harga = 0;

            // Menentukan material dan menetapkan harganya
            switch (pilihan) {
                case 1:
                    proyek = "semen";
                    harga = 50000;
                    break;
                case 2:
                    proyek = "besi";
                    harga = 70000;
                    break;
                case 3:
                    proyek = "cat";
                    harga = 20000;
                    break;
                case 4:
                    proyek = "paku";
                    harga = 2000;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    continue; // Melanjutkan ke iterasi berikutnya dari loop
            }

            // Menampilkan detail untuk setiap material
            System.out.println(">>>>>>>>>><<<<<<<<<<");
            System.out.println("bahan proyek : ");
            System.out.println(proyek + " Rp." + harga );
            double totalBiayaMaterial = harga * jumlah;
            System.out.println("jumlah : Rp." + totalBiayaMaterial);

            // Menambahkan biaya material saat ini ke total biaya
            totalHarga += totalBiayaMaterial;
        }

        // Menampilkan total biaya untuk semua material
        System.out.println("Total biaya untuk semua material: Rp." + totalHarga);
    }
}
