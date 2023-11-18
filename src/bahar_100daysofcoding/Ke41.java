package bahar_100daysofcoding;

public class Ke41 {
    public static void main(String[] args) {
        // Mendeklarasikan array 
        int[] angkaArray = new int[11];

        // Mengisi nilai ke dalam array menggunakan loop for
        for (int i = 0; i < 11; i++) {
            angkaArray[i] = i * 3; // Mengisi nilai dengan kelipatan 3
        }

        // Mencetak nilai array menggunakan loop for
        System.out.println("Isi Array:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Index ke-" + i + ": " + angkaArray[i]);
        }
    }
}
