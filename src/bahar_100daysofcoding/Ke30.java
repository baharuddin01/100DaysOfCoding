package bahar_100daysofcoding;
public class Ke30 {
    public static void main(String[] args) {
        int hari = 25;
        int GajiKotor = 1200000;
        int makan = 15000;
        int total1 = hari * GajiKotor;
        int total2 = hari * makan;
        int total3 = total1 - total2;
        
        System.out.println("Jumlah Hari Kerja   : "+hari+ " Hari");
        System.out.println("Gaji Perhari        : "+GajiKotor);
        System.out.println("Uang Makan Perhari  : "+makan);
        System.out.println("Gaji Kotor          : "+total1);
        System.out.println("Total Uang Makan    : "+total2);
        System.out.println("Gaji Bersih         : "+total3);
    }
}
