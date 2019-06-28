package HW.HW4;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        int[] arr = {0, 123, -12, 991, 89, 66, 21, 89};
        int temp;

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        System.out.println(Arrays.toString(arr));
    }
}