public class ContaCorrente {
    public String nome;
    private int numero;
    private short agencia;
    private double saldo;

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

    public void imprimir(){
        System.out.println("Nome do titular: "+nome);
        System.out.println("Número da conta: "+numero);
        System.out.println("Agência "+agencia);
        System.out.println("Saldo: "+saldo+"\n");

    }
}
