package aritmetica;

public class Aritmetica {

    public static void main(String[] args) {
        
        MetodoFabricaOperacion fabrica = new MetodoFabricaDiv();

        Operacion operacion = fabrica.fabricarOperacion();

        float a = Entrada.leerFloat("Ingrese el primer número: ");
        float b = Entrada.leerFloat("Ingrese el segundo número: ");

        float resultado = operacion.operar(a, b);

        Salida.mostrarResultado(resultado);
    }
}
