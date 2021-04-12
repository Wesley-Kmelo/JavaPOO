package aula04poo;
public class Caneta {
    public String modelo;
    private float ponta;
    
    public  Caneta(){            // este método, caracterizado pelos(),é um método construtor. A finalidade 
        this.modelo="DataShow";  // desse método é fazer que os atributos desa classe comecem com valores 
        this.ponta = 3.0f;       // pré-definidos. Assim , quando o objeto for instanciado ele já vai ter 
                                 // esse valores como se fosse de fábrica. Para ser um construtor, o método
    }                            // tem que ter o mesmo nome da classe e sem o void.
        
   public String getModelo(){        //O metodo get retorna o valor da variavel que foi setada em set
        return this.modelo;          // Se o método set não for usado, o valor da variável será null, senão existir um método construtor.
    }                                // O método get deve ser declarado public e com o mesmo tipo do atributo.
   public void setModelo(String m){  //o método set recebe o parametro que tem que ser do mesmo tipo
        this.modelo = m;             // do parametro do atributo declarado.Na verdade o set informa que 
    }                                // o valor que ele receber no parametro(m), será atribuido ao valor do 
   public float getPonta(){          // atributo da classe(this.modelo).
        return this.ponta;
    }
   public void setPonta(float p){
        this.ponta=p;        
    } 
   
   public void status(){
       System.out.println("A cor da caneta é " + modelo);
       System.out.println("A ponta da caneta é "+ ponta);
   }
}
