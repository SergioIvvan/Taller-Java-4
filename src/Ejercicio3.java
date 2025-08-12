import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de la primera persona: ");
        int edad1 = scanner.nextInt();

        System.out.println("Ingrese la edad de la segunda persona: ");
        int edad2 = scanner.nextInt();


        boolean ambosMayores18 = (edad1 > 18) && (edad2 > 18);

        boolean ambosMenores30  = (edad1 < 30) && (edad2 < 30);

        boolean alguienMayor50 = (edad1 > 50) || (edad2 > 50);


        System.out.println("¿Ambas personas son mayores de 18 años? " + ambosMayores18);

        System.out.println("¿Ambas personas son menores de 30 años? " + ambosMenores30);

        System.out.println("¿Alguna persona es mayor de 50 años? " + alguienMayor50);


        scanner.close();
    }
}
