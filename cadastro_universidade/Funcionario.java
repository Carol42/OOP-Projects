public class Funcionario extends Pessoa {
    private String registro;
    private double salario;

    // construtores
    public Funcionario(String nome, String telefone, Data nascimento, String registro, double salario){
        super(nome,telefone,nascimento);
        this.registro=registro;
        this.salario=salario;
    }
    public Funcionario(String nome, Data nascimento, String registro, double salario){
        super(nome,nascimento);
        this.registro=registro;
        this.salario=salario;
    }

    // metodos GET
    public String getRegistro(){
        return registro;
    }

    public double getSalario(){
        return salario;
    }

    // metodos SET
    public void setRegistro(String valor){
        if(valor.length()!=6)
            System.out.println("O registro deve ter 6 digitos!");
        else
            registro=valor;
    }
    public void setSalario(double valor){
        if(valor<0)
            System.out.println("O salario nao pode ser negativo!");
        else
            salario=valor;
    }

    // metodo toString
    public String toString(){
        return super.toString()+"\nRegistro: "+registro+"\nSalario: "+salario;
    }

    // metodo bonificar
    public double bonificar(){
        return salario*0.1;
    }
}
