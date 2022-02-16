package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello.  What is your name? (Sorry, I keep forgetting.) ");
        String name = scanner.nextLine();

        System.out.print("Ok, " + name + ", How old are you? ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("");

        String message = "";
        if (age < 16) {
            message += "You can't drive";
        } else if (16 <= age && age <= 17) {
            message += "You can drive but not vote";
        } else if (18 <= age && age <= 24) {
            message += "You can vote but not rent a car";
        } else {
            message += "You can do pretty much anything";
        }
        message += ", " + name + ".";
        System.out.println(message);
    }
}