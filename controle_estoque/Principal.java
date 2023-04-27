public class Principal {
    public static void main(String args[]){
        Produto vetor[];
        vetor = new Produto[3];
        vetor[0] = new Produto("Parafuso",1.5);
        vetor[0] = new Produto("Arruela",.7,50);
        vetor[0] = new Produto("Prego",1.2,70);


        System.out.println("*** IMPRIME OS VALORES INICIAIS ***");
        for(int i=0;i<3;i++)
            vetor[i].imprimir();

    }
}
