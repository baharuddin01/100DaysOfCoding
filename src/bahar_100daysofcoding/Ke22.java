package bahar_100daysofcoding;
import java.util.Scanner;
public class Ke22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = input.nextDouble();
        System.out.print("Masukkan jumlah jam kerja: ");
        double jamKerja = input.nextDouble();
        input.close();
        double gaji = upahPerJam * jamKerja;
        System.out.println("Gaji karyawan adalah: Rp " + gaji);
    }
}
