package com.softserve.edu01.Homework01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Edu01Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Input the radius = ");
            double number = scanner.nextDouble();
            System.out.printf("Perimeter = %.2f\nArea = %.2f", 2 * Math.PI * number, Math.PI * Math.pow(number, 2));

        } catch (InputMismatchException ex) {
            System.out.println("Variable entered incorrectly");
        }
    }
}
