package vendingmachine;
import java.util.Scanner;
public class VendingMachine {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] notes = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };

        System.out.println("Enter the amount to change ");
        int change = sc.nextInt();
        int i=0;
        int total = 0;

        while(change != 0)
        {
            if (change >= notes[i])
            {
                int count = change / notes[i];
                int rem = change % notes[i];
                change = rem;
                total += count;
                System.out.println(count+" number of "+notes[i] + " notes" );
            }

            else
            {
                i++;
            }

        }
        System.out.println("Minimum notes required is " + total);
    }

}
