import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            clearScreen();

            // عنوان ملون
            System.out.println(ColorsExample.CYAN + "\t\t\t\t\t Hello dear in our calculator " + ColorsExample.RESET);
            System.out.println(ColorsExample.YELLOW + "\t\t\t\t\t [ +     -       *       / ] " + ColorsExample.RESET);
            System.out.println(ColorsExample.YELLOW + "\t\t\t\t\t [ 0     1       2       3 ] " + ColorsExample.RESET);
            System.out.println(ColorsExample.YELLOW + "\t\t\t\t\t [ 4     5       6       7 ] " + ColorsExample.RESET);
            System.out.println(ColorsExample.YELLOW + "\t\t\t\t\t [ 8     9       %         ] " + ColorsExample.RESET);

            System.out.println(ColorsExample.GREEN + "\t\t\t\t\t Enter first number: " + ColorsExample.RESET);
            int num1 = input.nextInt();
            input.nextLine(); // تنظيف البافر

            System.out.println(ColorsExample.GREEN + "\t\t\t\t\t Enter operator (+, -, *, /, %): " + ColorsExample.RESET);
            String op = input.nextLine();

            System.out.println(ColorsExample.GREEN + "\t\t\t\t\t Enter second number: " + ColorsExample.RESET);
            int num2 = input.nextInt();
            input.nextLine(); // تنظيف البافر

            switch (op) {
                case "+":
                    add(num1, num2);
                    break;
                case "-":
                    sub(num1, num2);
                    break;
                case "*":
                    mul(num1, num2);
                    break;
                case "/":
                    div(num1, num2);
                    break;
                case "%":
                    mod(num1, num2);
                    break;
                default:
                    System.out.println(ColorsExample.RED + "\t\t\t\t\t Invalid operator!" + ColorsExample.RESET);
            }

            System.out.println("\nPress Enter to continue...");
            input.nextLine(); // استنى المستخدم
        }
    }

    static void add(int a, int b) {
        int sum = a + b;
        System.out.println(ColorsExample.BLUE + "\t\t\t\t\t The sum is: " + sum + ColorsExample.RESET);
    }

    static void sub(int a, int b) {
        int sub = a - b;
        System.out.println(ColorsExample.BLUE + "\t\t\t\t\t The subtraction is: " + sub + ColorsExample.RESET);
    }

    static void mul(int a, int b) {
        int mul = a * b;
        System.out.println(ColorsExample.BLUE + "\t\t\t\t\t The multiplication is: " + mul + ColorsExample.RESET);
    }

    static void div(int a, int b) {
        if (b != 0) {
            int div = a / b;
            System.out.println(ColorsExample.BLUE + "\t\t\t\t\t The division is: " + div + ColorsExample.RESET);
        } else {
            System.out.println(ColorsExample.RED + "\t\t\t\t\t Can't divide by zero!" + ColorsExample.RESET);
        }
    }

    static void mod(int a, int b) {
        int mod = a % b;
        System.out.println(ColorsExample.BLUE + "\t\t\t\t\t The modulus is: " + mod + ColorsExample.RESET);
    }

    static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
