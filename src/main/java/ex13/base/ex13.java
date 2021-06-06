package ex13.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
*/


import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principle amount? ");
        String str1 = input.nextLine();
        int principle = Integer.parseInt(str1);

        System.out.print("What is the rate? ");
        String str2 = input.nextLine();
        double ratePercent = Double.parseDouble(str2);
        double rate = ratePercent / 100;

        System.out.print("What is the number of years? ");
        String str3 = input.nextLine();
        int years = Integer.parseInt(str3);

        System.out.print("What is the number of times the interest is compounded per year? ");
        String str4 = input.nextLine();
        int numComp = Integer.parseInt(str4);

        double interest = (1 + (rate / numComp));
        interest = Math.pow(interest, (numComp * years));
        interest = interest * principle;

        System.out.print(principle + " invested at " + ratePercent + "% for " + years + " years compounded " + numComp + " times per year is ");
        System.out.format("$%.2f.%n", interest);

    }
}
