public class Produto {
    private String nome;
    private double preco;
    private int qtd;

    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String valor){
        if(valor.length()>=3)
            nome=valor;
        else
            System.out.println("O nome não pode ter menos que 3 caracteres!");
    }
    public double getPreco(){
        return preco;
    }
    public double setPreco(double valor){
        if(valor>=0)
            preco=valor;
        else
            System.out.println("O valor do produto não pode ser negativo!");
    }
    public int qtd(){
        return qtd;
    }
    public int qtd(int valor){
        if(valor>0)
            qtd=valor;
        else
        System.out.println("A quantidade do produto não pode ser menor ou igual a 0");
    }

    public void vender(int valor){
        if(valor>=qtd){
            qtd-=valor;
        }
        else
            System.out.println("Não tem produtos suficientes no estoque para efetuar a venda.");
    }
    public void comprar(int valor){
        if(valor>0)
            qtd+=valor;
        else
            System.out.println("Valor inválido para a quantidade de produtos comprados!");
    }
    public void imprimir(){
        System.out.println("*** DADOS DO PRODUTO ***\n");
        System.out.println("Nome: "+nome+"\n");
        System.out.println("Preco: "+preco+"\n");
        System.out.println("Quantidade: "+qtd+"\n");

    }
}