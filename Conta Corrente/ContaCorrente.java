public class ContaCorrente {
    private String nome;
    private int numero;
    private short agencia;
    private double saldo;
    private double limite;

    public ContaCorrente(String nome, int numero, short agencia, double saldo, double limite){
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
    }
    public ContaCorrente(String nome, int numero, short agencia, double saldo){
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    public ContaCorrente(String nome, int numero, short agencia){
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
    }
    public String getNome(String n){
        return nome;
    }

    public void setNome(String n){
        if(n.length()>=3)
            nome=n;
        else
            System.out.println("O nome não pode ter menos que 3 caracteres");
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int valor){
        if(valor>0)
            numero=valor;
        else System.out.println("O número da conta não pode ser menor ou igual a zero");
    }

    public short getAgencia(){
        return agencia;
    }

    public void setAgencia(short valor){
        if(valor>0)
            agencia=valor;
        else System.out.println("O número da agência não pode ser menor ou igual a zero");
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double valor){
        saldo=valor;
    }

    public double getLimite(double valor){
        return limite;
    }

    public void setLimite(double valor){
        if(valor>=0)
            limite=valor;
        else System.out.println("O limite não pode ser menor que zero.");
    }

    public void sacar(double valor){
        if(valor>0 && valor<=saldo){
            saldo=saldo-valor;
        }
        else System.out.println("Valor incorreto ou saldo insuficiente!");
    }

    public void depositar(double valor){
        if(valor>0){
            saldo=saldo+valor;
        }
        else System.out.println("O valor a depositar não pode ser negativo");
    }

    public void atualizar(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }

    public void atualizar(String nome, int numero, short agencia){
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void imprimir(){
        System.out.println("Nome do titular: "+nome);
        System.out.println("Número da conta: "+numero);
        System.out.println("Agência "+agencia);
        System.out.println("Saldo: "+saldo);
        System.out.println("Limite: "+limite+"\n");

    }
}
