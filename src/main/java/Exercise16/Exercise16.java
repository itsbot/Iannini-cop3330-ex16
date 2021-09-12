/*
 *  UCF COP3330 Fall 2021 Exercise 16 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise16;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();

        String canDrive = (age>=16) ? (" ") : (" not ");

        System.out.println("You are"+canDrive+"old enough to legally drive.");
    }
}
