package HW.HW4;

import java.util.Scanner;

public class ConvertingHexadecimalToDecimal {
    public static void main(String[] args) {
        System.out.println("Hexadecimal to Decimal");
        Scanner input = new Scanner(System.in);

        while ( true ) {
            System.out.print("Hex: ");
            if ( ! input.hasNextInt(16) )
                break;

            int n = input.nextInt(16);
            System.out.printf("Dec: %d", n);
            System.out.println("");
        }
        input.close();
    }
}