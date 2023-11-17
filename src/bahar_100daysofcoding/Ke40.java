package bahar_100daysofcoding;

import java.util.Scanner;

public class Ke40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        float a , b , hasil;
        String operator;
        
        System.out.print("Nilai A     : ");
        a = sc.nextFloat();
        System.out.print("Operatur    : ");
        operator = sc.next();
        System.out.print("Nilai B     : ");
        b = sc.nextFloat();
        
        switch(operator){
            case "+":
                hasil = a + b ;
                System.out.println("Hasil       : "+hasil);
                break;
            case "-":
                hasil = a - b ;
                System.out.println("Hasil       : "+hasil);
                break;
            case "*":
                hasil = a * b ;
                System.out.println("Hasil       : "+hasil);
                break;    
            case "/":
                hasil = a / b ;
                System.out.println("Hasil       : "+hasil);
                break;
            default:
        }
    }
}
