package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello.  What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hi, " + name + "!  How old are you?");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("So you're " + age + ", eh?  That's not old at all!");

        System.out.println("How much do you make, " + name + "?");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println(salary + "!  I hope that's per hour and not per year! LOL!");
    }
}
