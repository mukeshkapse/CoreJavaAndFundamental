package com.bridgelabz.corejavafandamental;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // TODO Auto-generated method
        int y;
        System.out.println("Enter any year >>");
        Scanner scan= new Scanner(System.in);
        y = scan.nextInt();
        if (y%100==0 && y%400==0 || y%100!=0 && y%4==0) {
            System.out.println("This is leap year");
        }
        else {
            System.out.println("This is not leap year");
            scan.close();
        }
    }
}
