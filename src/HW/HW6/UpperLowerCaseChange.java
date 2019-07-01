package HW.HW6;

public class UpperLowerCaseChange {
    public static void main(String[] args) {

        String text = "академия таможенной службы украины";
        System.out.println(getFirstLettertoUpperCase(text));
    }

    public static String getFirstLettertoUpperCase (String text) {
        if((text == null) || (text.equals("")))
            return null;

        char[] charArray = text.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);

        for(int i = 2; i < charArray.length; i++) {
            if(charArray[i - 1] == ' ')
                charArray[i] = Character.toUpperCase(charArray[i]);
        }
        String correctText = new String(charArray);

        return correctText;
    }
}
