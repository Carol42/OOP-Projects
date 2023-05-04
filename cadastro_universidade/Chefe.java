public class Chefe extends Funcionario {
    private String cargo;
    
    // metodos GET e SET
    public String getCargo(){
        return cargo;
    }

    public void setCargo(String valor){
        if(cargo.length()<3)
            System.out.println("O nome do cargo nao pode ter menos que 3 caracteres");
        else
            cargo=valor;
    }

    // construtores
    public Chefe(String nome, String telefone, Data nascimento, String registro, double salario, String cargo){
        super(nome,telefone,nascimento,registro,salario);
        this.cargo=cargo;
    }
    public Chefe(String nome, Data nascimento, String registro, double salario, String cargo){
        super(nome,nascimento,registro,salario);
        this.cargo=cargo;
    }

    public String toString(){
        return super.toString()+"\nCargo: "+cargo;
    }

    // bonificacao
    public double bonificar(){
        return getSalario()*0.2;
    }
}
