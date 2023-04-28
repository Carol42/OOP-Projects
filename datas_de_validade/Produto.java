package datas_de_validade;

public class Produto {

    private String nome;
    private double preco;
    private int qtd;
    private Data validade;

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQtd(){
        return qtd;
    }

    public Data getValidade(){
        return validade;
    }

    public void setNome(String valor){
        nome = valor;
    }

    public void setPreco(double valor){
        if(valor>0)
            preco = valor;
        else System.out.println("O preco nao pode ser negativo!");
    }

    public void setQtd(int valor){
        if(valor>0)
            qtd=valor;
        else System.out.println("Quantidade invalida!");
    }

    public void setValidade(int dia, int mes, int ano){
        validade.setDia(dia);
        validade.setMes(mes);
        validade.setAno(ano);
    }

    public void setValidade(Data validade){
        this.validade=validade;
    }

    // construtores
    public Produto(String nome, double preco, int qtd, Data validade){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
        this.validade = validade;
    }
    public Produto(String nome, double preco, Data validade){
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }

    public Produto(String nome, Data validade){
        this.nome = nome;
        this.validade = validade;
    }

    public void vender(int valor){
        if(valor<=qtd)
            qtd-=valor;
        else System.out.println("Nao ha produtos suficientes no estoque para efetuar a venda!");
    }

    public void comprar(int valor){
        if(valor>0)
            qtd+=valor;
        else System.out.println("Quantidade invalida!");
    }

    public String toString(){
        String temp;
        temp = "\nNome: "+nome+"\nValidade: "+validade;
        return temp;
    }
}
