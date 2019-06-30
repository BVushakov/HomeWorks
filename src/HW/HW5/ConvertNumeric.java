package HW.HW5;

import java.util.Scanner;

public class ConvertNumeric {
    public static void main(String[] args) {

        /** dec to bin */
        int decimal = 243;
        int yourNum = decimal;
        System.out.println("Dec: " + yourNum + " -> Bin: " + ConverterNumericClasses.converterDecimaiToBinary(decimal));

        /** bin to dec */
        String binary = "11110011";
        System.out.println("Bin: " + binary + " -> Dec: " + ConverterNumericClasses.convertBinaryToDecimal(binary));

        /** hex to dec */
        String heximal= "1B";
        System.out.println("Hex: " + heximal + " -> Dec: " + ConverterNumericClasses.convertHeximalToDecimal(heximal));

        /** dec to hex */
        Scanner input = new Scanner( System.in );
        System.out.print("Dec: ");
        int decimalNum =input.nextInt();
        System.out.println("Dec: " + decimalNum + " -> Hex: " + ConverterNumericClasses.convertDecimalToHeximal(decimalNum));
    }
}
