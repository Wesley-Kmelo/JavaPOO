
package aula02poo;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
   
void status(){
    System.out.println("A cor da caneta é "+ cor);
    if (tampada==true){
            System.out.println("Não dá pra rabiscar. Caneta tampada.");
        }else{
            System.out.println("Caneta pronta pra rabiscar");
        }

}    
    
    
    void rabiscar(){
        if (tampada==true){
            System.out.println("Não dá pra rabiscar. Caneta tampada.");
        }else{
            System.out.println("Caneta pronta pra rabiscar");
        }
    }
    
    void tampar(){
        this.tampada=true;      
    }
    
    void destampar(){
        this.tampada=false;
    }
}
