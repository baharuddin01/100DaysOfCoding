package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih jenis konversi suhu:");
        System.out.println("1. Celsius ke Fahrenheit");
        System.out.println("2. Fahrenheit ke Celsius");

        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                konversiCelsiusToFahrenheit();
                break;
            case 2:
                konversiFahrenheitToCelsius();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        sc.close();
    }
    private static void konversiCelsiusToFahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celsius: ");
        double suhuCelsius = sc.nextDouble();
        double suhuFahrenheit = (suhuCelsius * 9 / 5) + 32;
        System.out.println("Hasil konversi: " + suhuCelsius + " Celsius = " + suhuFahrenheit + " Fahrenheit");
    }
    private static void konversiFahrenheitToCelsius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        double suhuFahrenheit = sc.nextDouble();
        double suhuCelsius = (suhuFahrenheit - 32) * 5 / 9;
        System.out.println("Hasil konversi: " + suhuFahrenheit + " Fahrenheit = " + suhuCelsius + " Celsius");
    }
}
