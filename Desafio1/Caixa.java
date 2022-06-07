package Desafio1;


public class Caixa {
    
    public Caixa(){

    }
    public double calculaValorFinal(Produto produto, int quantidade){
        
        double valorFinal = produto.getValor()*quantidade;
        if(produto.getTipo()==1){
            valorFinal = valorFinal*0.9;
        }
        else if(produto.getTipo()==2){
            valorFinal = valorFinal*0.8;
        }
        else if (produto.getTipo()==3 && quantidade >5 ){
            valorFinal = valorFinal*0.9;
        }

        return valorFinal;
    }
}
