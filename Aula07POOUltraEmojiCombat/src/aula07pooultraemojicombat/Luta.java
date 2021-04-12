package aula07pooultraemojicombat;
//Esta classe é um exemplo de como se faz o relacionamento entre classes. Aqui nessa classe é representada o 
//relacionamento por agregação, onde nos atributos dessa classe é criada uma instância ou objeto da classe Lutador.

import java.util.Random;

//Nos métodos tambem podem ser feitos essa relação onde é criada a referencia bastando apenas digitar o nome da
//classe pretendida mais o nome do objeto que se deseja . Nesse momento todos os atribuitos e métodos da classe
//referenciada se tornam disponiveis, bastando apenas fazer a lógica necessária.
public class Luta {
    //Atributos desta classe

    private Lutador desafiante, desafiado; //como dito acima o nome da classe foi invocado  e depois disso foi
                                           //criado dois objetos (desafiante e desafiado)para se trabalhar .
    private int rounds;
    private boolean aprovado;
    private String Msg;
    
    //Métodos Públicos
    // ao criar o método MarcarLuta, estou dizendo que devem ser esperados dois parametros. E esses parametros 
    //são os atributos da classe Lutador.Depois apenas foi declarado o nome dos objetos(l1 e l2)afim de poderem
    //ser trabalhados aqui nessa classe.
    //O getcategoria se refere ao método da classe Lutador e que vai seguir a lógica do que ta configurado lá.
    public void MarcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
            Lutar();

        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("A luta não pode ser marcada.");
            if(l1==l2){
                Msg="O desafiante não pode lutar contra ele mesmo. ";
            }else{
               if (l1.getPeso() < l2.getPeso()) {
                Msg="O desafiado é mais pesado que o desafiante.";
               } else {
                Msg="O desafiado é mais leve que o desafiante.";
               }
               
            }
            System.out.println(Msg);
        }   
    }
       

    private void Lutar() {
            System.out.println("Chegou a hora. Apresentando os lutadores :");
            System.out.println("Desafiante : " + this.desafiante.getNome());
            System.out.println("Desafiado : " + this.desafiado.getNome());
            System.out.println("-------------------------------------------");
            System.out.println("");
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            Random aleatorio = new Random();        //nesta linha é criado o objeto alatorio da classe RANDOM que faz parte da biblioteca java.util
            int vencedor = aleatorio.nextInt(3);    //nessa linha é usado o método nextint pra selecionar de 0 a 2
            switch (vencedor) {                       //nessa linha o comando switch vai ser usado para tratar a
                case 0:                             //variável vencedor de acordo com os case.
                    System.out.println("============================================");
                    System.out.println("A luta ficou empatada");
                    System.out.println("============================================");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    this.desafiado.status();
                    this.desafiante.status();
                    break;
                case 1:
                    System.out.println("============================================");
                    System.out.println("Vitória do Lutador " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("============================================");
                    this.desafiado.status();
                    break;
                case 2:
                    System.out.println("============================================");
                    System.out.println("Vitória do Lutador " + this.desafiante.getNome());
                    System.out.println("============================================");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    this.desafiante.status();
                    break;
            }


    }
    //Métodos Especiais set e get

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

}
