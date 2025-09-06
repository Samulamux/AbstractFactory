package aritmetica;

public class MetodoFabricaMulti extends MetodoFabricaOperacion{
    @Override
    public Operacion fabricarOperacion(){
        return new Multiplicacion();
    }
}

