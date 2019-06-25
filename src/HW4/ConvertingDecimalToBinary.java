package HW4;

public class ConvertingDecimalToBinary {
    public static void main(String[] args) {
        int number = 243;
        int yourNum = number;
        int b;
        String res = "";

        while(number != 0) {
            b = number % 2;
            res = b + res;
            number = number / 2;
        }
        System.out.println(yourNum + " -> " + res);
        System.out.println("");

        /** Converting binary to decimal */
        String str = "11110011";// Your binary code
        int sum = 0;
        int a;
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(str.length() - 1 - i);

            if(c == '1' || c == '0') {
                if (c == '1') {
                    a = 1;
                } else a = 0;
            } else {
                System.out.println("Ошибка ввода!");
                break;
            }
            sum += (a * Math.pow(2, i));
        }

        System.out.println(str + " -> " + sum);
    }
}
