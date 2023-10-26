package bahar_100daysofcoding;
public class Ke18 {
    public static void main(String[] args) {
        // Outer loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
  
        // Inner loop
            for (int j = 1; j <= 5; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        } 
    }
}
