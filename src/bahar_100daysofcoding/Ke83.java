package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke83 {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau frasa: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " adalah palindrom.");
        } else {
            System.out.println(input + " bukan palindrom.");
        }

        scanner.close();
    }
}
