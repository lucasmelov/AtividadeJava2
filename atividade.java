import java.util.Scanner;

public class teddowhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, quantLidos = 0, soma = 0;
        int quantidadePositivos = 0, quantidadeNegativos = 0;


        do {

            System.out.print("Informe o seu número inteiro ( digite 0 para sair): ");
            numero = Integer.parseInt(entrada.nextLine());

            if(numero > 0){
                quantidadePositivos++;
            }
            else if(numero < 0){
                quantidadeNegativos++;
            }

            soma += numero;

            if(numero != 0){
                quantLidos++;
            }
        }
        while(numero != 0);

        if(quantLidos == 0){
            System.out.println("Você não informou um número.");
        }
        else{
            System.out.println("Quantidade de números positivos: " + quantidadePositivos);
            System.out.println("Quantidade de números negativos: " + quantidadeNegativos);
            System.out.println("A soma dos números lidos é: " + soma);
            System.out.println("A média aritmética é: " + ((soma * 1.0) / quantLidos));


        }
    }
}