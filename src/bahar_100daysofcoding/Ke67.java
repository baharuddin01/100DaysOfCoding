package bahar_100daysofcoding;
public class Ke67 {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi sebuah array
        int[] angka = {64, 34, 25, 12, 22, 11, 90};

        // Menampilkan elemen-elemen array sebelum diurutkan
        System.out.print("Isi array sebelum diurutkan: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        // Melakukan Bubble Sort untuk mengurutkan array
        int n = angka.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (angka[j] > angka[j+1]) {
                    // Menukar angka[j] dan angka[j+1] jika diperlukan
                    int temp = angka[j];
                    angka[j] = angka[j+1];
                    angka[j+1] = temp;
                }
            }
        }

        // Menampilkan elemen-elemen array setelah diurutkan
        System.out.print("Isi array setelah diurutkan: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();
    }
}
