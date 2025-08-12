import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();


        System.out.println("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        int imcEntero = (int) imc;


        System.out.println("Tu IMC calculado es: " + imc);
        System.out.println("Tu IMC entero calculado es: " + imcEntero);


        scanner.close();
    }
}
