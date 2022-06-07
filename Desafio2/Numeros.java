package Desafio2;

import java.util.ArrayList;

public class Numeros {
    
    public static void main(String[] args) {
        ArrayList<Double> listaNumeros = new ArrayList<>();
        int count;
        for(count=0;count<10;){
            String input = System.console().readLine();
            Double numero = Double.parseDouble(input);

            if(listaNumeros.contains(numero) == true){
                System.out.println("Esse número já foi inserido, digite novamente!");
            }
            else{
                listaNumeros.add(numero);
                count++;
            }        
        }

        double maiorNumero = listaNumeros.get(0);
        double menorNumero = listaNumeros.get(0);
        double media=0;
        ArrayList<Double> maiorQueDez = new ArrayList<>();
        ArrayList<Double> maiorQueCinquenta = new ArrayList<>();

        int cont;
        Double num;
        for(cont=0;cont<listaNumeros.size();cont++){
            num = listaNumeros.get(cont);
            if(num>maiorNumero){
                maiorNumero = num;
            }
            if(num<menorNumero){
                menorNumero = num;
            }
            if(num>10){
                maiorQueDez.add(num);
            }
            if(num>50){
                maiorQueCinquenta.add(num);
            }
            media+=num;

        }
        media = media/listaNumeros.size();
        System.out.println("Maior numero:" + maiorNumero);
        System.out.println("Menor numero:" + menorNumero);
        System.out.println("Média:" + media);
        System.out.println("Maior que 10:" + maiorQueDez);
        System.out.println("Maior que 50:" + maiorQueCinquenta);
    }    
}

