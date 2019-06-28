package HW.HW4;

import java.util.Scanner;
public class ConvertingDecimalToHexadecimal {
        public static void main(String args[])
    {
        Scanner input = new Scanner( System.in );
        System.out.print("Dec: ");
        int num =input.nextInt();
        int rem;
        String str="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(num>0)
        {
            rem=num%16;
            str=hex[rem]+str;
            num=num/16;
        }
        System.out.println("Hex: "+str.toUpperCase());
    }
}
