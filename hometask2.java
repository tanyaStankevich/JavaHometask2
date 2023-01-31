
// Задание 2
import java.util.logging.*;
import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */

    static int sum(int a, int b) {
        return a + b;
    }

    static int raz(int a, int b) {
        return a - b;
    }

    static int pr(int a, int b) {
        return a * b;
    }

    static int del(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(App.class.getName());
        logger.setLevel(Level.INFO);

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = iScanner.nextInt();
        System.out.println("Введите второе число");
        int b = iScanner.nextInt();
        System.out.println("Выберите арифметическую операцию: сложение +, вычитание -, умножение *, деление /");
        String op = iScanner.next();

        switch (op) {
            case "+":
                System.out.println(sum(a, b));
                break;
            case "-":
                System.out.println(raz(a, b));
                break;
            case "/":
                System.out.println(del(a, b));
                break;
            case "*":
                System.out.println(pr(a, b));
                break;
        }

    }
}