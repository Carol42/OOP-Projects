public class Principal{
    public static void main(String args[]){
        ContaCorrente vetor[];
        vetor = new ContaCorrente[3];
        vetor[0] = new ContaCorrente("Fulaninho",100,(short)10);
        vetor[1] = new ContaCorrente("Beltraninho",200,(short)10,100);
        vetor[2] = new ContaCorrente("Ciclaninho",300,(short)10,250,400);


        /*ContaCorrente conta1, conta2, conta3;
        conta1 = new ContaCorrente("Fulaninho", 001, (short)01, 150.0,100.0);
        conta2 = new ContaCorrente("Beltraninho", 002, (short)01, 239.0, 200.0);
        conta3 = new ContaCorrente("Ciclaninho", 003, (short)01, 555.0, 350.0);*/

        System.out.println("*** IMPRIMIR VALORES DAS CONTAS CRIADAS ***");
        for(int i=0;i<3;i++)
            vetor[i].imprimir();

        /*
        conta1.imprimir();
        conta2.imprimir();
        conta3.imprimir();*/

        System.out.println("*** Atualiza saldo e limite ***");
        vetor[0].atualizar(2000,10000);
        vetor[0].imprimir();
        vetor[1].atualizar(3000,12000);
        vetor[1].imprimir();
        vetor[2].atualizar(4000,13000);
        vetor[2].imprimir();

        System.out.println("*** SAQUE 50 REAIS ***");
        for(int i=0;i<3;i++){
            vetor[i].sacar(50);
            vetor[i].imprimir();
        }
        /*
        conta1.sacar(50);
        conta1.imprimir();
        conta2.sacar(50);
        conta2.imprimir();
        conta3.sacar(50);
        conta3.imprimir(); */

        System.out.println("*** DEPOSITA 75.9 ***");
        for(int i=0;i<3;i++){
            vetor[i].depositar(75.9);
            vetor[i].imprimir();
        }
        /*    
        conta1.depositar(75.9);
        conta1.imprimir();
        conta2.depositar(75.9);
        conta2.imprimir();
        conta3.depositar(75.9);
        conta3.imprimir();*/


     }

}