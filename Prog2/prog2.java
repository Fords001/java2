package Prog2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class prog2 {
    public static void main(String[]args) {

        try {
            Scanner num = new Scanner(System.in);

            System.out.print("Ввеедите первое число: ");
            double first = num.nextDouble();
            System.out.print("Ввеедите второе число: ");
            double second = num.nextDouble();

            System.out.print("Введите оператор (+, -, *, /): ");
            char operator = num.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = first + second;
                    break;

                case '-':
                    result = first - second;
                    break;

                case '*':
                    result = first * second;
                    break;

                case '/':
                    result = first / second;
                    break;

                // оператор не соержит (+, -, *, /)
                default:
                    System.out.println("Неверный оператор");
                    return;
            }

            System.out.printf("%.2f %c %.2f = %.2f", first, operator, second, result);
        } catch (InputMismatchException e) {
          System.out.println("Вы ввели не число");
        }
    }

}


