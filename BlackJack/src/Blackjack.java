// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean pos1 = false;
        int num1 = 0, num2 = 0;
        while (!pos1) {
            System.out.println("Please enter a positive number.");
            num1 = scanner.nextInt();

            System.out.println("Please enter another positive number.");
            num2 = scanner.nextInt();

            if (num1 > 0 && num2 > 0) {
                pos1 = true;
            } else {
                System.out.println("Please enter two POSITIVE numbers.");
            }
        }


        if (num1 > 21 && num2 > 21) {
            System.out.println(0);
        } else if (num1 > 21) {
            System.out.println(num2);
        } else if (num2 > 21) {
            System.out.println(num1);
        } else {
            System.out.println(Math.max(num1, num2));
        }
    }
}