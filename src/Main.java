package java4OperadoresLogicos;

public class Main {
    public static void main(String[] args) {
        //!Comparacion
        System.out.println(100 == 10);
        System.out.println(100 != 10);
        System.out.println(100 > 10);
        System.out.println(100 >= 10);
        System.out.println(100 <= 10);

        //!Logicos
        System.out.println("Logicos");
        System.out.println(100 > 10 && 50 < 5);
        System.out.println(100 > 10 || 50 < 5);
        System.out.println(!true);
        System.out.println(!(5==5));
    }



}