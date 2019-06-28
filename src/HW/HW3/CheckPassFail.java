package HW.HW3;

public class CheckPassFail {

    public static final String passVar = "PASS";
    public static final String failVar = "FAIL";

    public static void main(String[] args) {

        int mark = 50;

        if (mark >= 50) {
            System.out.println(passVar);
        } else {
            System.out.println(failVar);
        }
        System.out.println("DONE");

    }
}
