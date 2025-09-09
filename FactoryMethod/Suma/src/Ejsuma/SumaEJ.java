package Ejsuma;

public class SumaEJ {

    public static void main(String[] args) {
        
        OperacionFactory fabrica = new SumaFactory();
        Operacion operacion = fabrica.crearOperacion();
        
        float a = Entrada.leerFloat("Ingrese el primer número: ");
        float b = Entrada.leerFloat("Ingrese el segundo número: ");

        float resultado = operacion.operar(a, b);

        Salida.mostrarResultado(resultado);
    }
}
