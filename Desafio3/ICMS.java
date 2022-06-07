package Desafio3;

public class ICMS implements  Imposto {

    @Override
    public double calculaImposto(double valor){
        return valor * 1.3;
    }
}