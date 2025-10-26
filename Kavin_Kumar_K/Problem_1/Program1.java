package Problem_1;

//Problem-1: Create a small calculator 
//which performs operations such as Addition, Subtraction, Multiplication and Division using class.

import java.util.*;


    class Calculator {
    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    void calculate() {
        double result = 0;
        switch (operation.toLowerCase()) {
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "divide":
                if (b != 0)
                    result = a / b;
                else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation type!");
                return;
        }
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.next();

        Calculator calc = new Calculator(a, b, op);
        calc.calculate();
        sc.close();
    }
}

