package az.consoleApps;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        mainMenu();
    }

    public static double plus(double a, double b) {

        return a + b;
    }

    public static double minus(double a, double b) {

        return a - b;
    }

    public static double multi(double a, double b) {

        return a * b;
    }

    public static double divide(double a, double b) {

        return a / b;
    }

    public static void calculate() {
        try {
            System.out.print("Misal : ");
            double a = sc.nextDouble();
            String sign = sc.next();
            double b = sc.nextDouble();

            switch (sign) {
                case "+":
                    System.out.print("Cavab : ");
                    System.out.printf("%.3f", plus(a, b));
                    break;
                case "-":
                    System.out.print("Cavab : ");
                    System.out.printf("%.3f", minus(a, b));
                    break;
                case "*":
                    System.out.print("Cavab : ");
                    System.out.printf("%.3f", multi(a, b));
                    break;
                case "/":
                    System.out.print("Cavab : ");
                    System.out.printf("%.3f", divide(a, b));
                    break;
                default:
                    System.out.println("Verilənləri düzgün daxil edin : ");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Verilənləri düzgün daxil edin : ");
            calculate();
        }

    }

    public static void history() {
        // TODO: 12.11.2023 tarixce burada olacaq , kodlamagi unutma
    }

    public static void mainMenu() {
        System.out.println(" __________________________");
        System.out.println("| Console App - Calculator |");
        System.out.println(" --------------------------");

        System.out.println("| Hesablamağa başla  ->  1 |");
        System.out.println("| Tarixçəni göstər   ->  2 |");
        System.out.println("| Proqramdan çıxış   ->  3 |");
        System.out.println(" --------------------------");
        menuChoose();
    }

    public static void menuChoose() {
        System.out.print("Seçiminiz : ");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                calculatorUI();
                calculate();
                break;
            case 2:
                history();
                break;
            case 3:
                System.out.println();
                System.out.println("Proqramdan istifadə etdiyiniz üçün təşəkkürlər...");
                break;
            default:
                System.out.println("Yanlış seçim...");
                System.out.println();
                menuChoose();
        }
    }

    public static void calculatorUI() {
        System.out.println(" _________________");
        System.out.println("|  C  | +/- |  %  |");
        System.out.println("|-----|-----|-----|");
        System.out.println("|  7  |  8  |  9  |");
        System.out.println("|-----|-----|-----|");
        System.out.println("|  4  |  5  |  6  |");
        System.out.println("|-----|-----|-----|");
        System.out.println("|  1  |  2  |  3  |");
        System.out.println("|-----|-----|-----|");
        System.out.println("|  0  |  ,  |  =  |");
        System.out.println("|-----|-----|-----|");
    }
}
