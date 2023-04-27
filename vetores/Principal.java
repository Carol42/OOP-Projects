import java.util.Scanner;
public class Principal {
    public static void main(String args[]){
        Scanner leitura = new Scanner(System.in);
        int x;
        System.out.println("Digite um numero: ");
        x = leitura.nextInt();
        int vetor[] = {5,2,1,4,3};
        Vetor.somar(vetor);
        Vetor.media(vetor);
        Vetor.imprime(vetor);
        Vetor.ordenar(vetor);
        Vetor.busca(vetor,x);
    }
}
