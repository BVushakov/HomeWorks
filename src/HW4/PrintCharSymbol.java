package HW4;

public class PrintCharSymbol {
    public static void main(String[] args) {
        int a = 135;
        int b = 255;

        for (int i = a; i < b + 1; i++) {
            char character = (char) i;
            System.out.println(character);
        }
    }
}
