package com.company;

public class PrimeNo {
    public static void main(String[] args) {
        int no=7;int temp=0;
        for(int i=2;i<=no-1;i++)
        {
            if (no%i==0) //  9%3==0(no is not prime)
            {
                temp=temp+1;  // temp=1  //out of for loop and check temp=0 or not
            }                 //temp=0 >>>>prime number
        }
        if (temp>0)
        {
            System.out.println(no+ " >>>>no is not prime");
        }
        else
        {
            System.out.println(no+ " >>>>no is prime");
        }


    }

}
