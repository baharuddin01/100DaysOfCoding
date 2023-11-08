package bahar_100daysofcoding;

import java.util.Scanner;
public class Ke31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        
        for(int a = 1; a <=5; a++){ // perulangan sebanyak 5 kali
            System.out.println("Kariawan : "+a);    
            System.out.print("hari kerja = "); 
            int hari = input.nextInt();
            int GajiKotor = 1200000;
            int makan = 15000;
            int total1 = hari * GajiKotor;
            int total2 = hari * makan;
            int total3 = total1 - total2 ;

            // Menampilkan informasi tentang gaji karyawan
            System.out.println("Jumlah Hari Kerja   : "+hari+ " Hari");
            System.out.println("Gaji Perhari        : "+GajiKotor);
            System.out.println("Uang Makan Perhari  : "+makan);
            System.out.println("Gaji Kotor          : "+total1);
            System.out.println("Total Uang Makan    : "+total2);
            System.out.println("Gaji Bersih         : "+total3);
            total += total3; /* mengakumulasi total gaji bersih 
            dari semua kariawan selama perulangan for*/
            System.out.println("===================================");
            System.out.println();
            
        }
            System.out.println("uang yang di siapkan oleh perusahaan : " + total);
    }
}
