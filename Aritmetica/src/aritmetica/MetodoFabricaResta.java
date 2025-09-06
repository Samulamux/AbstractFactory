package aritmetica;

public class MetodoFabricaResta extends MetodoFabricaOperacion{
    @Override
    public Operacion fabricarOperacion(){
        return new Resta();
    }
}
