package aritmetica;

public class MetodoFabricaDiv extends MetodoFabricaOperacion{
    @Override
    public Operacion fabricarOperacion(){
        return new Division();
    }
}
