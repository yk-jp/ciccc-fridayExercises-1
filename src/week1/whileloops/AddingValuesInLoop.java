package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will add up the numbers you give me.");

        int totalNum = 0;

        while (true) {
            System.out.print("Number: ");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            }
            totalNum += number;
            System.out.println("The total so far is " + totalNum);
        }

        System.out.println("The total is " + totalNum + ".");
    }
}
