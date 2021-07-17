

import java.util.Scanner;

public class SwapNibble {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number :-");
        int decimal = sc.nextInt();
        int x = decimal;

        int arr [] =new int[100];
        int index =0;

        while (decimal>0)
        {
            arr[index++]= decimal%2;
            decimal = decimal/2;
        }

        System.out.println("Decimal to Binary is : ");
        for (int i = 7; i >= 0; i--) {
            System.out.print(arr[i]);

        }
        System.out.println(" ");

        System.out.println("Before Swapping "+ x );
        int y = ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
        System.out.println("After Swapping "+y);
        System.out.println("Resultant Number Power of 2 is " + (int)Math.pow(y,2));

    }
}









