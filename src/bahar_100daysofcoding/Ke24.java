package bahar_100daysofcoding;
public class Ke24 {
    public static void main(String[] args) {
        int nilai = 100; // Tipe data int digunakan untuk menyimpan bilangan bulat 
        char grade; //Tipe data char digunakan untuk menyimpan karakter tunggal, seperti huruf, angka, atau simbol. 

        /* if dan else digunakan bersama-sama untuk memilih tindakan yang akan diambil tergantung pada apakah 
        kondisi tertentu benar (true) atau salah (false).*/
        // Memeriksa nilai dan menetapkan grade berdasarkan kondisi tertentu
        if (nilai >= 90) {
            grade = 'A';
        } else if (nilai >= 70) {
            grade = 'B';
        } else if (nilai >= 60) {
            grade = 'C';
        } else if (nilai >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Menampilkan nilai dan grade ke layar
        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);
    }
}
