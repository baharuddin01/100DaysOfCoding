package bahar_100daysofcoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Ke100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Aplikasi To-Do List ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Hapus Tugas");
            System.out.println("3. Lihat Daftar Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int pilihan = sc.nextInt();
            sc.nextLine(); // Membuang karakter newline setelah membaca angka

            switch (pilihan) {
                case 1:
                    tambahTugas(sc, toDoList);
                    break;
                case 2:
                    hapusTugas(sc, toDoList);
                    break;
                case 3:
                    lihatDaftarTugas(toDoList);
                    break;
                case 4:
                    System.out.println("Terima kasih! Selamat tinggal.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void tambahTugas(Scanner sc, ArrayList<String> toDoList) {
        System.out.print("Masukkan tugas baru: ");
        toDoList.add(sc.nextLine());
        System.out.println("Tugas berhasil ditambahkan!");
    }

    private static void hapusTugas(Scanner sc, ArrayList<String> toDoList) {
        if (toDoList.isEmpty()) {
            System.out.println("Daftar tugas kosong. Tidak ada tugas untuk dihapus.");
            return;
        }
        lihatDaftarTugas(toDoList);
        System.out.print("Pilih nomor tugas yang ingin dihapus: ");
        int nomorTugas = sc.nextInt();

        if (nomorTugas >= 1 && nomorTugas <= toDoList.size()) {
            String tugasDihapus = toDoList.remove(nomorTugas - 1);
            System.out.println("Tugas \"" + tugasDihapus + "\" berhasil dihapus.");
        } else {
            System.out.println("Nomor tugas tidak valid. Tidak ada tugas yang dihapus.");
        }
    }

    private static void lihatDaftarTugas(ArrayList<String> toDoList) {
        if (toDoList.isEmpty()) {
            System.out.println("Daftar tugas kosong. Tidak ada tugas yang perlu dilakukan.");
        } else {
            System.out.println("Daftar Tugas:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }
}
