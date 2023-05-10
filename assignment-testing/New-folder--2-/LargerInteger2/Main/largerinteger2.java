package Main;

import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class largerinteger2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int firstInt = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int secondInt = scanner.nextInt();


        if (firstInt > secondInt) {
            System.out.println("The larger integer is: " + firstInt);
        } else {
            System.out.println("The larger integer is: " + secondInt);
        }


    }


    }


