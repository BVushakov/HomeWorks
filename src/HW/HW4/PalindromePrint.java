package HW.HW4;

public class PalindromePrint {
    public static void main(String[] args) {

        String s = "Голод долог".toUpperCase();
        boolean b = true;

        for (int i = 0; i < s.length() / 2 + 1; i++) {
            if (s.toCharArray()[i] != s.toCharArray()[s.length() - i - 1]) {
                b = !b;
                break;
            }
        }
        System.out.println(b ? "Палиндром " + s : "Слово НЕ палиндром " + s);
    }

}
