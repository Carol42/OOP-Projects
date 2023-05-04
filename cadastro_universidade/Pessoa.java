public class Pessoa {
    private String nome;
    private String telefone;
    private Data nascimento;

    // construtores
    public Pessoa(String nome, String telefone, Data nascimento){
        this.nome=nome;
        this.telefone=telefone;
        this.nascimento=nascimento;
    }
    public Pessoa(String nome, Data nascimento){
        this.nome=nome;
        this.nascimento=nascimento;
    }

    // metodos GET
    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public Data getNascimento(){
        return nascimento;
    }

    // metodos SET
    public void setNome(String valor){
        if(valor.length()<3)
            System.out.println("O nome precisa ter mais que tres caracteres!");
        else
            nome=valor;
    }

    public void setTelefone(String valor){
        if(valor.length()<10){
            System.out.println("Digite um numero de telefone valido! (com DDD)");
        }
        else
            telefone=valor;
    }

    public void setNascimento(Data valor){
        nascimento=valor;
    }

    // metodo toString
    public String toString(){
        return "\nNome: "+nome+"\nTelefone: "+telefone+"\nNascimento: "+nascimento;
    }
}
