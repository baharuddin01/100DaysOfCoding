package bahar_100daysofcoding;
public class Ke46 {
    public static void main(String[] args) {
        int tinggi = 6;
        int lebar = 4; 

        // Membuat pola persegi panjang bintang
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= lebar; j++) {
                System.out.print("*");
            }
            System.out.println(); // Pindah ke baris baru setelah setiap baris selesai
        }
    }
}
