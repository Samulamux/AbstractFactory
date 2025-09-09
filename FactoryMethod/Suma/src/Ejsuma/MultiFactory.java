package Ejsuma;

public class MultiFactory implements OperacionFactory {
    @Override
    public Operacion crearOperacion() {
        return new Multiplicacion();
    }
}
