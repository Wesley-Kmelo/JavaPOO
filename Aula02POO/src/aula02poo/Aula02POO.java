package aula02poo;

public class Aula02POO {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        Caneta c2=new Caneta();
        
        c1.cor="Azul";
        c1.destampar();
        c1.modelo="Bic";
        c1.status();
        
        c2.cor="Verde";
        c2.tampar();
        c2.status();
       
    }

}
