package aritmetica;

public class MetodoFabricaSuma extends MetodoFabricaOperacion{
    @Override
    public Operacion fabricarOperacion(){
        return new Suma();
    }
}
