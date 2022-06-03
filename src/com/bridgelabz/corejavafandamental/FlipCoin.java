package com.bridgelabz.corejavafandamental;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Given a number=");
        Scanner sc= new Scanner(System.in);
        int headcount=0;
        int tailcount=0;
        int count= sc.nextInt();

        for (int i=0; i<count; i++) {
            double random= Math.random();

            if (random<0.5)
                tailcount++;

            else
                headcount++;
        }
        sc.close();
        System.out.println("percentageof tails ("+ tailcount+"): "+(tailcount*100f / (headcount + tailcount)));
        System.out.println("percentageof head ("+ headcount+"): "+(headcount*100f / (headcount + tailcount)));
    }
}
