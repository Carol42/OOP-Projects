public class Principal{
    public static void main(String args[]){
        ContaCorrente conta1, conta2;
        conta1 = new ContaCorrente();
        conta2 = new ContaCorrente();

        conta1.nome="Fulaninho";
        conta1.setNumero(10);
        conta1.setAgencia((short)001);
        conta1.setSaldo(200);

        conta2.nome="Beltraninho";
        conta2.setNumero(15);
        conta2.setAgencia((short)001);
        conta2.setSaldo(350.71);

        System.out.println("*** IMPRIMIR VALORES DAS CONTAS CRIADAS ***");
        conta1.imprimir();
        conta2.imprimir();

        System.out.println("*** SAQUE 50 REAIS ***");
        conta1.sacar(50);
        conta1.imprimir();
        conta2.sacar(50);
        conta2.imprimir();


        System.out.println("*** DEPOSITA 75.9 ***");
        conta1.depositar(75.9);
        conta1.imprimir();
        conta2.depositar(75.9);
        conta2.imprimir();

     }
}