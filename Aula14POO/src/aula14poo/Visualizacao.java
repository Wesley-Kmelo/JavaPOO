package aula14poo;
//esta classe foi criada para mostrar uma forma de unir os dados de uma classe com outra classe,
//através do conceito de agregação.
//Nesse caso os atributos declarados são instancias ou objetos de outras classs. Isso é agregação.
//A variavel espectador é uma instância da classe Gafanhoto e a variavel filme é uma instância da 
//classe Video.

//Através do método toString desta classe pode-se receber os dados das outras classe tranqilo.

public class Visualizacao {
  private Gafanhoto espectador;
  private Video filme;

  
  //metodo construtor
  //esse método pode ser incrementado com os atributos view e curtidas da classe Video.
      public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        
  //o método setTotAssistido da classe Gafanhoto(representado pela variavel espectador)exige que se 
  //diga quantas curtidas são necessarias. Isso é feito recebendo o valor de getToassistido, que é 0,
  //e somando mais 1.
        this.filme.setViews(this.filme.getViews()+1);
  //a mesma explicação de cima
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
    }

      //métodos especiais
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }

  //criação de métodos de polimorfismo de sobrecarga. Ou seja, mesma classe e mesmo nome mas com 
  //parâmetros ou assinatura diferentes.
    
    public void avaliar(){
        this.filme.setAvalia(this.filme.getAvalia()+1);
        
    }
    public void avaliar(int nota){
        this.filme.setAvalia(nota);
        
    }
    public void avaliar(float porc){
        int tot = 0;
        if (porc<=20) {
            tot=3;
        } else if (porc <=50) {        
           tot = 5;
        } else if(porc<=80){
        tot = 8;
        }else{
          tot = 10;  
      }
         this.filme.setAvalia(tot);
    }
}
