import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== Calculadora Básica ===");
            System.out.print("Introduce el primer número: ");
            double num1 = sc.nextDouble();

            System.out.print("Introduce el segundo número: ");
            double num2 = sc.nextDouble();

            System.out.println("Selecciona la operación (+, -, *, /): ");
            char operacion = sc.next().charAt(0);

            double resultado;

            switch (operacion) {
                case '+':
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '-':
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '*':
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: no se puede dividir entre 0.");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    }
                    break;

                default:
                    System.out.println("Operación no válida.");
            }

        } catch (Exception e) {
            System.out.println("Error: entrada no válida.");
        }
    }
}
