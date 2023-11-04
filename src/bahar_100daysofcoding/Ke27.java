package bahar_100daysofcoding;
public class Ke27 {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array 2D
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Mengakses dan mencetak elemen-elemen array 2D
        for (int[] matrix1 : matrix) {
            for (int i = 0; i < matrix1.length; i++) {
                System.out.print(matrix1[i] + " ");
            }
            System.out.println();  // menggunkan sout agar pindah ke baris berikutnya
        }
    }
}

