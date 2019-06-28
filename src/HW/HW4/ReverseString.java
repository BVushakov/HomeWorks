package HW.HW4;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello Alexey";
        System.out.println("Оригинальная строка - " + str);

        char[] array = str.toCharArray();
        System.out.print("Перевернутая строка - ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
