package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Inserisci la distanza che vuoi percorrere:");
        int distance = Integer.parseInt(scan.nextLine());
        System.out.println("Inserisci la tua età:");
        int age = Integer.parseInt(scan.nextLine());

        double pricePerKm = 0.21;
        double totalPrice = pricePerKm * distance;
        double discountedPrice = 0;
        String message = "Il tuo sconto è del ";
        System.out.println("Prezzo totale " + totalPrice);

        if(age < 18){
            discountedPrice = totalPrice - ((totalPrice * 20) / 100);
            message += "20%";
        } else if (age > 65){
            discountedPrice = totalPrice - ((totalPrice * 40) / 100);
            message += "40%";
        } else {
            discountedPrice = totalPrice;
            message = "Non ci sono sconti disponibili";
        }

        String decimalFormat = new DecimalFormat("#.##").format(discountedPrice);

        System.out.println(message + " il prezzo finale è " + decimalFormat);
    }
}
