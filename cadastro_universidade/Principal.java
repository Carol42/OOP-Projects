public class Principal{
    public static void main(String args[]){
        Data d1;
        Aluno a1;
        d1 = new Data(5,4,2002);
        a1 = new Aluno("Aluno01",d1,"12345678");
        System.out.println(a1);
    }
}