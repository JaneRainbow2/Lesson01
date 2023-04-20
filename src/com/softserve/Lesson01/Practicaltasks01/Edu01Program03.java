package com.softserve.edu01.Practicaltasks01;

import java.util.Scanner;

public class Edu01Program03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Input integer variable a:");
            String str1 = scanner.nextLine();
            int a = Integer.parseInt(str1);
            System.out.println("Input integer variable b:");
            String str2 = scanner.nextLine();
            int b = Integer.parseInt(str2);
            System.out.printf("Output obtained results:\na+b=%d\na-b=%d\na*b=%d\na/b=%.2f", a + b, a - b, a * b, a * 1.0 / b);

        } catch (NumberFormatException ex) {
            System.out.println("Variable entered incorrectly");
        }
    }
}
