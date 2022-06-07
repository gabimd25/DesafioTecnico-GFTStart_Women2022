package Desafio1;

public class Main {
    
    public static void main(String[] args) {
        Caixa caixa = new Caixa();

        Produto banana = new Produto("Banana", 0.99, 2);
        System.out.printf("%s = R$%.2f \n" ,banana.getNome(),caixa.calculaValorFinal(banana, 3));

        Produto energetico = new Produto("Energético", 5.49, 3);
        System.out.printf("%s = R$%.2f \n",energetico.getNome(),caixa.calculaValorFinal(energetico, 7));

        Produto arroz = new Produto("Arroz", 20.00, 1);
        System.out.printf("%s = R$%.2f \n",arroz.getNome(),caixa.calculaValorFinal(arroz, 1));

        Produto chocolate = new Produto("Chocolate", 4.50, 1);
        System.out.printf("%s = R$ %.2f \n",chocolate.getNome(),caixa.calculaValorFinal(chocolate, 12));

        Produto leite = new Produto("Leite", 3.73, 3);
        System.out.printf("%s = R$%.2f \n",leite.getNome(),caixa.calculaValorFinal(energetico, 5));

        Produto abacaxi = new Produto("Abacaxi", 2.40, 2);
        System.out.printf("%s = R$%.2f \n",abacaxi.getNome(),caixa.calculaValorFinal(abacaxi, 1));
    }
}
