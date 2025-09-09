package Ejsuma;

public class DivFactory implements OperacionFactory {
    @Override
    public Operacion crearOperacion() {
        return new Division();
    }
}
