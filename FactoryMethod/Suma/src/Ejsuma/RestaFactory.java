package Ejsuma;

public class RestaFactory implements OperacionFactory {
    @Override
    public Operacion crearOperacion() {
        return new Resta();
    }
}
