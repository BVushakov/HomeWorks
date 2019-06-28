package HW.HW4;

public class FibonacciNumber {
    public static void main(String[] args) {
        int f = 0;
        int f1 = 1;
        int f2 = 0;
        int stopNumber = 500;

        System.out.print( "0 ");
        for(int i = 3; i <= stopNumber; i++){
            f = f1;
            f1 = f2;
            f2 = f + f1;
            if (f2 > stopNumber) {
            break;
            }
            System.out.print(f2 + " ");
        }
    }
}
