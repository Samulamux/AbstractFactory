package Ejsuma;

public class SumaFactory implements OperacionFactory {
    @Override
    public Operacion crearOperacion() {
        return new Suma();
    }
}
