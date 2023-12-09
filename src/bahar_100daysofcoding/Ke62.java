package bahar_100daysofcoding;
public class Ke62 {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi sebuah array
        int[] angka = {1, 5, 3, 7, 2, 8, 4};

        // Menampilkan elemen-elemen array
        System.out.print("Isi array: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        // Menghitung jumlah elemen dalam array
        int jumlah = 0;
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }
        System.out.println("Jumlah elemen dalam array: " + jumlah);

        // Mencari nilai maksimum dalam array
        int maksimum = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > maksimum) {
                maksimum = angka[i];
            }
        }
        System.out.println("Nilai maksimum dalam array: " + maksimum);

        // Menampilkan elemen-elemen array yang genap
        System.out.print("Elemen array yang genap: ");
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) {
                System.out.print(angka[i] + " ");
            }
        }
        System.out.println();
    }
}
