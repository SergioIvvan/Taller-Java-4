import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de Pepito: ");
        int edadPepito = scanner.nextInt();

        System.out.println("Ingrese la edad de Juan: ");
        int edadJuan = scanner.nextInt();

        if (edadPepito > edadJuan){
            System.out.println("Pepito es mayor que Juan.");
        }
        else if (edadPepito < edadJuan) {

            System.out.println("Juan es mayor que Pepito.");
        }
        else {
            System.out.println("Pepito y Juan tienen la misma edad.");
        }

       scanner.close();


    }

}
