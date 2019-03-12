package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        String Roll_again = "";
        String user = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Let's Play Roll Dice! ");
        Random r = new Random();
        do {
            int x = 1 + r.nextInt(6);
            int y = 1 + r.nextInt(6);
            System.out.println("You Rolls " + x + " &" + y);

            if ((x == 1) && (y == 1)) {
                sum += 25;
                System.out.println("Score:" + sum);
            } else if ((x == 1) || (y == 1)) {
                sum += 0;
                System.out.println("Score: " + sum);
            } else {
                sum += x + y;
                System.out.println("Score: " + sum);

                System.out.println("Roll again? yes");
                user = scanner.nextLine();

            }
        }while (sum <= 100 && user.equalsIgnoreCase("yes")) ;

        if (sum >= 100) {
            System.out.println("You have scored over 100");
        }
        System.out.println("Thank you for playing");


    }

}










