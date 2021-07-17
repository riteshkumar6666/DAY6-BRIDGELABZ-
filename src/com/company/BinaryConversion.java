
package decToBinary;

import java.util.Scanner;

public class BinaryConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:-");
        int num=sc.nextInt();


        int arr []= new int [10000];
        int index=0;
        while (num>0)
        {
            arr[index++]=num % 2 ;
            num=num/2;
        }
        System.out.println("Decimal to Binary is : ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }


    }
}
