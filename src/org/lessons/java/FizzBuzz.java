package org.lessons.java;

import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberToPrint = 100;

        do{
            System.out.println("Inserisci quanti numeri vuoi stampare:");
            numberToPrint = Integer.parseInt(scan.nextLine());
        } while(numberToPrint < 0 || numberToPrint > 1000);

        String[] arrayNumber = new String[numberToPrint];

        for(int i = 0; i < arrayNumber.length; i++){
           if((i+1) % 3 == 0){
               arrayNumber[i] = "FIZZ";
           } else if((i+1) % 5 == 0){
               arrayNumber[i] = "BUZZ";
           } else {
               arrayNumber[i] = Integer.toString(i + 1);
           }

           if((i+1) % 3 == 0 && (i+1) % 5 == 0) {
            arrayNumber[i] = "FIZZBUZZ";
           }
        }

        System.out.println(Arrays.toString(arrayNumber));
    }
}

