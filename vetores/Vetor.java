import java.util.Arrays;

public class Vetor{
    public static void somar(int vetor[]){
        int soma = vetor[0];

        for(int i = 1; i < vetor.length; i++){
            soma = soma + vetor[i];
        }
        System.out.println("\nSoma do vetor: "+soma);
    }

    public static void media(int vetor[]){
        float media;
        int soma = vetor[0];
        for(int i = 1; i < vetor.length; i++){
            soma = soma + vetor[i];
        }
        media = (float)soma/vetor.length;
        System.out.println("\nMedia: "+media);
    }

    public static void imprime(int vetor[]){
        System.out.println("\nVetor: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println("vetor["+i+"] = "+vetor[i]);
        }
    }

    public static void ordenar(int vetor[]){
        Arrays.sort(vetor);
        System.out.println("\nVetor ordenado: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println("vetor["+i+"]"+vetor[i]);
        }
    }
    
    public static void busca(int vetor[], int busca){
        int posicao;
        Arrays.sort(vetor);
        posicao = Arrays.binarySearch(vetor,busca);

        if(posicao >= 0){
            System.out.println("\nEncontrou "+busca+" na posicao "+posicao);
        }

        if(posicao < 0){
            System.out.println("\nNao encontrou!");
        }
    }
}