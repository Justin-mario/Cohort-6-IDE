package javaClass;

import java.util.Scanner;

public class KataTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kata test = new Kata();
        int buyerQuantity = 0;
        int unitPrice = 0;
        int counter = 0;

        while (buyerQuantity != -1) {
            System.out.println(" Choose Number of Copies: ");
            buyerQuantity = input.nextInt();



            if (buyerQuantity >= 1 && buyerQuantity < 5) {
                unitPrice = 1500;
            }
            if (buyerQuantity >= 5 && buyerQuantity < 10) {
                unitPrice = 1400;
            }
            if (buyerQuantity > 9 && buyerQuantity < 30) {
                unitPrice = 1200;
            }
            if (buyerQuantity > 29 && buyerQuantity < 50) {
                unitPrice = 1100;
            }
            if (buyerQuantity > 49 && buyerQuantity < 100) {
                unitPrice = 1000;
            }
            if (buyerQuantity > 99 && buyerQuantity < 200) {
                unitPrice = 900;
            }
            if (buyerQuantity > 199) {
                unitPrice = 800;
            }
            if (buyerQuantity > 0)
                System.out.println("price is: " + unitPrice * buyerQuantity);
            counter++;
        }

    }



    }

