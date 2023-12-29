package bahar_100daysofcoding;
public class Ke82 {

    public static void main(String[] args) {
        // Tentukan rentang bilangan
        int batasBawah = 1;
        int batasAtas = 20;

        // Hitung jumlah bilangan prima dalam rentang
        int jumlahPrima = hitungJumlahPrima(batasBawah, batasAtas);

        // Tampilkan hasil
        System.out.println("Jumlah bilangan prima antara " + batasBawah + " dan " + batasAtas + " adalah " + jumlahPrima);
    }

    private static int hitungJumlahPrima(int batasBawah, int batasAtas) {
        int jumlahPrima = 0;
        for (int i = batasBawah; i <= batasAtas; i++) {
            if (isPrima(i)) {
                jumlahPrima++;
            }
        }
        return jumlahPrima;
    }

    private static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
