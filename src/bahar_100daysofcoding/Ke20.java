package bahar_100daysofcoding;
public class Ke20 {
    public static void main(String[] args) {
        int n = 3;

        // Outer loop
        for (int i = 1; i <= n; i++) {
            System.out.println("Outer: " + i);

            // Inner loop 1
            for (int j = 1; j <= i; j++) {
                System.out.println(" Inner 1: " + j);
            }

            // Inner loop 2
            for (int k = i; k >= 1; k--) {
                System.out.println(" Inner 2: " + k);
            }
        }
    }
}
