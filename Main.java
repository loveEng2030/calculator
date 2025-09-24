import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            clearScreen();

            System.out.println(" \t\t\t\t\t hello dear in our calculator ");
            System.out.println(" \t\t\t\t\t [ +     -       *       / ] ");
            System.out.println(" \t\t\t\t\t [ 0     1       2       3 ]  ");
            System.out.println(" \t\t\t\t\t [ 4     5       6       7 ]  ");
            System.out.println(" \t\t\t\t\t [ 8     9       %         ]  ");
            System.out.println(" \t\t\t\t\t enter first number: ");

            int num1 = input.nextInt();
            input.nextLine(); // تنظيف البافر

            System.out.println(" \t\t\t\t\t enter operator (+, -, *, /, %): ");
            String op = input.nextLine();

            System.out.println(" \t\t\t\t\t enter second number: ");
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
                    System.out.println("\t\t\t\t\t invalid operator");
            }

            System.out.println("\nPress Enter to continue...");
            input.nextLine(); // استنى المستخدم
        }
    }

    static void add(int a, int b) {
        int sum = a + b;
        System.out.println("\t\t\t\t\t the sum is: " + sum);
    }

    static void sub(int a, int b) {
        int sub = a - b;
        System.out.println("\t\t\t\t\t the subtraction is: " + sub);
    }

    static void mul(int a, int b) {
        int mul = a * b;
        System.out.println("\t\t\t\t\t the multiplication is: " + mul);
    }

    static void div(int a, int b) {
        if (b != 0) {
            int div = a / b;
            System.out.println("\t\t\t\t\t the division is: " + div);
        } else {
            System.out.println("\t\t\t\t\t can't divide by zero!");
        }
    }

    static void mod(int a, int b) {
        int mod = a % b;
        System.out.println("\t\t\t\t\t the modulus is: " + mod);
    }

    static void clearScreen() {
        // طباعة أسطر كتير كبديل للـ clear
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
