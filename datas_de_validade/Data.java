package datas_de_validade;

public class Data{

    private int dia;
    private int mes;
    private int ano;

   // Construtores
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(int dia, int mes){
        this.dia = dia;
        this.mes = mes;
        ano = 2023;
    }

    // metodos get e set
 
    public int getDia(){
        return dia;
    }

    public void setDia(int valor){
        if(valor>=1 && valor<=31)
            dia=valor;
        else System.out.println("Dia invalido!");
    }

    public int getMes(){
        return mes;
    }

    public void setMes(int valor){
        if(valor>=1 && valor<=12)
            mes=valor;
        else System.out.println("Mes invalido!");
    }

    public int getAno()
    {
        return ano;
    }

    public void setAno(int valor){
        if(valor>=2023)
            ano = valor;
        else System.out.println("Esse ano nao pode ser acessado!");
    }

    public String toString(){
        String temp;
        temp = dia + "/" + mes + "/" + ano;
        return temp;
    }
}