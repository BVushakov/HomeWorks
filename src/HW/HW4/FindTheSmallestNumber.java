package HW.HW4;

public class FindTheSmallestNumber {
    public static void main(String[] args) {

        int[] simpleArray = {1, 21, -3, 0, 18};
        int min = simpleArray[0];

        for(int i = 0; i != simpleArray.length; i ++){
            if(simpleArray[i] < min){
                min = simpleArray[i];
            }
        }
        System.out.println("Минимальное число в массиве: " + min);
    }
}
