package bahar_100daysofcoding;
public class Ke63 {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi sebuah array
        int[] angka = {10, 25, 7, 30, 15, 5, 20};

        // Menampilkan elemen-elemen array
        System.out.print("Isi array: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        // Nilai batas untuk pembagian array
        int batas = 15;

        // Mengelompokkan elemen array berdasarkan nilai batas
        System.out.println("Kelompok 1 (Lebih besar dari " + batas + "):");
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > batas) {
                System.out.print(angka[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Kelompok 2 (Kurang dari atau sama dengan " + batas + "):");
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] <= batas) {
                System.out.print(angka[i] + " ");
            }
        }
        System.out.println();
    }
}
