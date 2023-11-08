/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahar_100daysofcoding;

/**
 *
 * @author masdi
 */
public class Ke31 {
    public static void main(String[] args) {
        int hari = 24;
        int GajiKotor = 1200000;
        int makan = 15000;
        int total1 = hari * GajiKotor;
        int total2 = hari * makan;
        int total3 = total1 - total2 ;
        
        System.out.println("kariawan 1");
        System.out.println("Jumlah Hari Kerja   : "+hari+ " Hari");
        System.out.println("Gaji Perhari        : "+GajiKotor);
        System.out.println("Uang Makan Perhari  : "+makan);
        System.out.println("Gaji Kotor          : "+total1);
        System.out.println("Total Uang Makan    : "+total2);
        System.out.println("Gaji Bersih         : "+total3);
        System.out.println("=====================================================");
        System.out.println();
        int hari_kariawan2 = 25;
        int total1_1 = hari_kariawan2 * GajiKotor;
        int total1_2 = hari_kariawan2 * makan;
        int total1_3 = total1_1 - total1_2 ;
        
        System.out.println("kariawan 2");
        System.out.println("Jumlah Hari Kerja   : "+hari_kariawan2+ " Hari");
        System.out.println("Gaji Perhari        : "+GajiKotor);
        System.out.println("Uang Makan Perhari  : "+makan);
        System.out.println("Gaji Kotor          : "+total1_1);
        System.out.println("Total Uang Makan    : "+total1_2);
        System.out.println("Gaji Bersih         : "+total1_3);
        System.out.println("=====================================================");
        System.out.println();
        int hari_kariawan3 = 27;
        int total2_1 = hari_kariawan3 * GajiKotor;
        int total2_2 = hari_kariawan3 * makan;
        int total2_3 = total2_1 - total2_2 ;
        
        System.out.println("kariawan 3");
        System.out.println("Jumlah Hari Kerja   : "+hari_kariawan3+ " Hari");
        System.out.println("Gaji Perhari        : "+GajiKotor);
        System.out.println("Uang Makan Perhari  : "+makan);
        System.out.println("Gaji Kotor          : "+total2_1);
        System.out.println("Total Uang Makan    : "+total2_2);
        System.out.println("Gaji Bersih         : "+total2_3);
        System.out.println("=====================================================");
        System.out.println();
        int hari_kariawan4 = 28;
        int total3_1 = hari_kariawan4 * GajiKotor;
        int total3_2 = hari_kariawan4 * makan;
        int total3_3 = total3_1 - total3_2 ;
        
        System.out.println("kariawan 4");
        System.out.println("Jumlah Hari Kerja   : "+hari_kariawan4+ " Hari");
        System.out.println("Gaji Perhari        : "+GajiKotor);
        System.out.println("Uang Makan Perhari  : "+makan);
        System.out.println("Gaji Kotor          : "+total3_1);
        System.out.println("Total Uang Makan    : "+total3_2);
        System.out.println("Gaji Bersih         : "+total3_3);
        System.out.println("=====================================================");
        System.out.println();
        int hari_kariawan5 = 22;
        int total4_1 = hari_kariawan5 * GajiKotor;
        int total4_2 = hari_kariawan5 * makan;
        int total4_3 = total4_1 - total4_2 ;
        
        System.out.println("kariawan 5");
        System.out.println("Jumlah Hari Kerja   : "+hari_kariawan5+ " Hari");
        System.out.println("Gaji Perhari        : "+GajiKotor);
        System.out.println("Uang Makan Perhari  : "+makan);
        System.out.println("Gaji Kotor          : "+total4_1);
        System.out.println("Total Uang Makan    : "+total4_2);
        System.out.println("Gaji Bersih         : "+total4_3);
        System.out.println("=====================================================");
        System.out.println("Total uang yang di siapkan oleh perusahaan : " +total3 + total1_3 + total2_3 + total3_3 + total4_3);
    }
}
