package presentacion;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        try {
            double resultado = calcular(num1, num2, operador);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir por cero.");
        }

        scanner.close();
    }

    public static double calcular(double num1, double num2, char operador) throws ArithmeticException {
        double resultado = 0.0;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("División por cero");
                }
                resultado = num1 / num2;
                break;
            default:
                System.err.println("Operador no válido.");
        }
        return resultado;
    }
    }

