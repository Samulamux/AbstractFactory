package aritmetica;

public class Suma extends Operacion{
    float op1, op2;
    
    @Override
    public float operar(float op1, float op2){
        this.op1 = op1;
        this.op2 = op2;
        return op1 + op2;
    }
}