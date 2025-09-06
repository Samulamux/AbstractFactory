package aritmetica;
import java.util.Scanner;

public class Entrada {
    private static Scanner scanner = new Scanner(System.in);
    
    public static int leerEntero(String mensaje) {
        Salida.mostrar(mensaje);
        return scanner.nextInt();
    }
    
    public static String leerTexto(String mensaje) {
        Salida.mostrar(mensaje);
        return scanner.next();
    }

    public static float leerFloat(String mensaje) {
        Salida.mostrar(mensaje);
        return scanner.nextFloat();
    }
}
