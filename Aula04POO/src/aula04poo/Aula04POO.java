package aula04poo;

public class Aula04POO {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        //c1.setModelo("Bic cristal");
       // c1.setPonta(1.0f);
        //c1.status();   // o método status faz o que tá escrito .
                         // o sout abaixo faz a mesma coisa mas usando os métodos get
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
}
