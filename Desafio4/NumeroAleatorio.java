package Desafio4;

import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10);
        System.out.println("Digite um numero de 0 a 10");
        String numUsuarioString =  System.console().readLine();
        int numUsuario = Integer.parseInt(numUsuarioString);

        int parada=0;
        while(parada==0){
            if(numUsuario==numeroAleatorio){
                parada=1;
                System.out.println("Você acertou! Numero = " + numeroAleatorio);
            }
            else{
                System.out.println("Você ainda não acertou, tente novamente!");
                numUsuarioString =  System.console().readLine();
                numUsuario = Integer.parseInt(numUsuarioString);
            } 
        }        
    }
}
