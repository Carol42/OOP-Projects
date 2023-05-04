public class Aluno extends Pessoa {
    private String ra;

    // construtores
    public Aluno(String nome, String telefone, Data nascimento, String ra){
        super(nome,telefone,nascimento);
        this.ra=ra;
    }

    public Aluno(String nome, Data nascimento, String ra){
        super(nome,nascimento);
        this.ra=ra;
    }

    // metodos GET e SET
    public String getRa(){
        return ra;
    }

    public void setRa(String valor){
        if(valor.length()!=8)
            System.out.println("RA invalido! O RA deve conter 8 caracteres!");
        else
            ra=valor;
    }

    public String toString(){
        return super.toString()+"\nRA: "+ra;
    }
}
