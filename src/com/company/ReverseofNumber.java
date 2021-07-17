package com.company;

public class ReverseofNumber {
    public static void main(String[] args) {
        int no=5432,rem,rev=0;
        while (no!=0)
        {
            rem=no%10;           //5432%10 =2(rem)
            rev=rev*10+rem;        //0*10+2= 2(rev)
            no=no%10;               //543 !=0 cond true    543%10=3(rem)
                                     //543 is a new number
        }
        System.out.println(rev);

    }
}
