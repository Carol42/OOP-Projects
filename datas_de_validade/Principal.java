package datas_de_validade;

public class Principal {
    public static void main(String args[]){
        Produto p1, p2;
        Data d1, d2, d3;
        
        System.out.println("\n*** Inicializando as datas ***");
        d1 = new Data(1,1,2023);
        d2 = new Data(2,2,2023);
        System.out.println("Data 1: "+d1+"\nData 2: "+d2);

        System.out.println("\n*** Inicializando os produtos ***");
        p1 = new Produto("Arroz", d1);
        p2 = new Produto("Feijao", d2);
        System.out.println("Produto 1: "+p1+"\nProduto 2: "+p2);
        
        System.out.println("\n*** Atualizando a validade diretamente ***");
        p1.setValidade(21,2,2023);
        System.out.println("Produto 1: "+p1+"\nProduto 2: "+p2);

        System.out.println("\n*** Atualizando a validade pelo metodo set ***");
        d3 = new Data(23,3,2023);
        p2.setValidade(d3);
        System.out.println("Data 3: "+d3);
        System.out.println("\nProduto 1: "+p1+"\nProduto 2: "+p2);

    }
}
