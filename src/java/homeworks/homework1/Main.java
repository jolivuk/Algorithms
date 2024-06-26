package homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number");
        int number1 = scanner.nextInt();
        System.out.println("Input second number");
        int number2 = scanner.nextInt();
        System.out.println("Input third number");
        int number3 = scanner.nextInt();

        int result = number1 + number2 + number3;
        System.out.println("Result: " + result);
    }
}