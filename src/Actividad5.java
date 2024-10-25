import java.util.InputMismatchException;
import java.util.Scanner;
public class Actividad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Calculadora de área y de perímetro ===");

        do {
            System.out.println("\nSelecciona una figura: ");
            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triangulo");
            System.out.println("4. Rectangulo");
            System.out.println("5. Pentágono");
            System.out.println("6. Salir");
            System.out.print("\nOpción: ");
            int opcion = 0;
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERR:Opcion inválida. Intente de nuevo.");
                scanner.next();
                continue;
            }

            if (opcion == 6) break;

            if (opcion < 1 || opcion > 5) {
                System.out.println("ERR:Opcion inválida. Intente de nuevo.");
                continue;
            }

            System.out.println("\nSeleccione una opcion: ");
            System.out.println("1. Área\n2. Perímetro");
            System.out.print("\nOpción: ");
            int calculo = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Escriba el radio(m): ");
                    double r = scanner.nextDouble();
                    if (calculo == 1) {
                        System.out.println("Área: " + (Math.PI * r * r));
                    } else {
                        System.out.println("Perímetro: " + (2 * Math.PI * r));
                    }
                    break;
                case 2:
                    System.out.println("Escriba uno de los lados(m): ");
                    double l = scanner.nextDouble();
                    if (calculo == 1) {
                        System.out.println("Área: " + (l * l));
                    } else {
                        System.out.println("Perímetro: " + (4 * l));
                    }
                    break;
                case 3:
                    System.out.println("Digite la base del triangulo(m): ");
                    double b = scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double h = scanner.nextDouble();
                    if (calculo == 1) {
                        System.out.println("Área: " + (b * h / 2));
                    } else {
                        System.out.print("Ingrese los lados restantes(m): ");
                        double lado1 = scanner.nextDouble();
                        double lado2 = scanner.nextDouble();
                        System.out.println("Perímetro: " + (b + lado1 + lado2));
                    }
                    break;
                case 4:
                    System.out.print("Escriba la base del rectangulo(m): ");
                    double base = scanner.nextDouble();
                    System.out.print("Escriba la altura del rectangulo(m): ");
                    double altura = scanner.nextDouble();
                    if (calculo == 1) {
                        System.out.println("Área: " + (base * altura));
                    } else {
                        System.out.println("Perímetro: " + (2 * (base + altura)));
                    }
                    break;
                case 5:
                    System.out.print("Digite uno lado del pentágono(m): ");
                    double lado = scanner.nextDouble();
                    double apotema = lado / (2 * Math.tan(Math.toRadians(36)));
                    if (calculo == 1) {
                        System.out.println("Área: " + (5 * lado * apotema / 2));
                    } else {
                        System.out.println("Perímetro: " + (5 * lado));
                    }
                    break;
            }
        } while (true);
        System.out.println("¡Hasta luego!");
        scanner.close();
    }
}