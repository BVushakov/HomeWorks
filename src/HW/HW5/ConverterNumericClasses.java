package HW.HW5;

public class ConverterNumericClasses {

    public static final int BINARYPOINTS = 2;
    public static final int HEXIMALPOINTS = 16;
    public static final char [] HEXIMALARR ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    public static final String DIGITS = "0123456789ABCDEF";

    public static String converterDecimaiToBinary (int decimal) {
        int b;
        String res = "";

        while(decimal != 0) {
            b = decimal % BINARYPOINTS;
            res = b + res;
            decimal = decimal / BINARYPOINTS;
        }
        return res;
    }

    public static int convertBinaryToDecimal (String binary) {

        int sum = 0;
        int a;
        char c;

        for (int i = 0; i < binary.length(); i++) {
            c = binary.charAt(binary.length() - 1 - i);

            if(c == '1' || c == '0') {
                if (c == '1') {
                    a = 1;
                } else a = 0;
            } else {
                System.out.println("Ошибка ввода!");
                break;
            }
            sum += (a * Math.pow(BINARYPOINTS, i));
        }

        return sum;
    }

    public static String convertDecimalToHeximal (int decimalNum) {

        int rem;
        String str="";

        while(decimalNum>0)
        {
            rem = decimalNum % HEXIMALPOINTS;
            str = HEXIMALARR [rem] + str;
            decimalNum = decimalNum / HEXIMALPOINTS;
        }

        return str.toUpperCase();
    }

    public static int convertHeximalToDecimal(String heximal){
        heximal = heximal.toUpperCase();
        int val = 0;
        for (int i = 0; i < heximal.length(); i++)
        {
            char c = heximal.charAt(i);
            int d = DIGITS.indexOf(c);
            val = HEXIMALPOINTS * val + d;
        }
        return val;
    }

}
