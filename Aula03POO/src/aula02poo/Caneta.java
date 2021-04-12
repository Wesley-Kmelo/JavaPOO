
package aula02poo;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
   
public void status(){
    System.out.println("A cor da caneta é "+ this.cor);
    System.out.println("O modelo da caneta é " + this.modelo);
    System.out.println("A ponta da caneta é " + this.ponta);
    System.out.println("A carga da caneta tem " + this.carga);
    if (this.tampada==true){
            System.out.println("Não dá pra rabiscar. Caneta tampada.");
        }else{
            System.out.println("Caneta pronta pra rabiscar");
        }

}     
    
    
    public void rabiscar(){
        if (tampada==true){
            System.out.println("Não dá pra rabiscar. Caneta tampada.");
        }else{
            System.out.println("Caneta pronta pra rabiscar");
        }
    }
    
    public void tampar(){
        this.tampada=true;      
    }
    
    public void destampar(){
        this.tampada=false;
    }
}
