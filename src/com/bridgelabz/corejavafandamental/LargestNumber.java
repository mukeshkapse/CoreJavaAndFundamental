package com.bridgelabz.corejavafandamental;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a, b;
        Scanner var= new Scanner(System.in);
        System.out.println("Enter the numbers to find largest num");
        a=var.nextInt();
        b=var.nextInt();
        if(a>b) {
            System.out.println("Largest number is:"+a);
        }else {
            System.out.println("Largest number is:"+b);
            var.close();
        }

    }
}
