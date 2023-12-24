

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
         * System.out.print("write a your weight pls : ");
         * double weight = input.nextDouble();
         * System.out.print("write a your height pls : ");
         * double height = input.nextDouble();
         * System.out.println("your VKI : " + (float)(weight / (height * height)));
         */

        // System.out.print("pls tell me vertical edge : ");
        // int verticalEdge = input.nextInt();
        // System.out.print("pls tell me horizontal edge : ");
        // int horizontalEdge = input.nextInt();

        // System.out.println("the hıpatenus of this Triangle : "
        // + (float) (Math.sqrt(Math.pow(verticalEdge, 2) + Math.pow(horizontalEdge,
        // 2))));

        // resarchAsalNumber(20);


       System.out.println("ebob of this numbers "+findEbob(27,15 )); 
    }

    // public static void resarchAsalNumber(int maxLimited) {
    //     int i = 2;
    //     for (i = 2; i < maxLimited; i++) {
    //         if (asalNumber(i)) {
    //             System.out.println(i + " asal sayidir");
    //         } else {
    //             System.out.println(i + " asal sayi degildir");
    //         }
    //     }
    // }

    // public static boolean asalNumber(int number) {
    //     int i = 2;
    //     for (i = 2; number > i; i++)
    //         if (number % i == 0) {
    //             return false;
    //         }
    //     return true;
    // }

    public static int findEbob(int firstNumber, int secondNumber) {
        int minSayi = findMinNumber(firstNumber, secondNumber);

        while (minSayi > 1) {

            if (firstNumber % (minSayi ) != 0 && secondNumber % (minSayi) != 0) {
                minSayi--;
            } else if (firstNumber % (minSayi  ) != 0 && secondNumber % (minSayi ) == 0) {
                minSayi--;

            } else if (firstNumber % (minSayi ) == 0 && secondNumber % (minSayi ) != 0) {
                minSayi--;

            } else {
                break;
            }

        }
        return minSayi;

    }

    public static int findMinNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return secondNumber;
        }
        return firstNumber;
    }

}

