package aula06poo;

public class ControleRemoto implements Controlador {
    //atributos ou caracteristicas da classe controle remoto 

    private int volume;
    private boolean ligado, tocando;
    private String StatusOnOff;

    //Métodos Especiais
    //MÉTODO CONSTRUTOR
    //o método construtor sempre deve ser o nome da classe
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }


    // a declaração private quer dizer que esses valores das variaveis
    //só podem ser manipulados aqui nessa classe e só aqui podem receber
    // ou gravar valores .
    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    //métodos implementados(importados) da interface Controlador.java criada antes.
    //Métodos Abstratos...
    
    @Override  //<<< significa sobrescrever. O que for escrito aqui vai sobrescrever o que tiver na interface. 
    public void ligar() {
        this.setLigado(true);
        System.out.println("O controle foi ligado");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("O controle foi desligado.");
    }

    @Override
    public void abrirMenu() {
        if (this.ligado) {
            if (this.tocando) {
                System.out.println(" ");
                System.out.println("O controle está ligado");
                System.out.println("O player está tocando");
                System.out.print("O volume está em " + this.getVolume()+" ");
                for (int i = 1; i <= this.getVolume(); i += 10) {
                    System.out.print("+");
                }
            } else {
                System.out.println("O controle está ligado");
                System.out.println("O player NÃO está tocando");
            }
        } else {
            System.out.println("O controle não está ligado");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.ligado) {
            System.out.println("Fechando Menu....");
        } else {
            System.out.println("Como fechar se nem foi aberto?");
        }
    }

    @Override
    public void maisVolume() {
        if (this.ligado) {
            setVolume(this.getVolume() + 5);
        } else {
            System.out.println("A TV tá desligada. Impossivel aumentar vol");
        }
    }

    @Override
    public void menosVolume() {
        if (this.ligado) {
            setVolume(this.getVolume() - 5);
        } else {
            System.out.println("TV desligada. Impossivel diminuir volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado()) {
            if (this.getVolume() > 0) {
                this.setVolume(0);
                System.out.println("");
                System.out.println("Volume está em MUTE.");
            } else {
                System.out.println("");
                System.out.println("O volume já está em MUTE.");
            }
        } else {
            System.out.println("");
            System.out.println("A teve não tá ligada.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado()) {
            if (this.getVolume()==0) {
                this.setVolume(50);
                System.out.println("");
                System.out.println("Volume alterado para 50.");
            } else {
                System.out.println("");
                System.out.println("O volume não esta em MUTE.");
            }
        } else {
            System.out.println("");
            System.out.println("A tv não estpa ligada");
        }
    }

    @Override
    public void play() {
        if (this.ligado) {
            if (this.tocando) {
                this.tocando=false;
                //System.out.println("");
                System.out.println("Player tocando mané");
            }else{
                this.tocando=true;
                //System.out.println("");
                System.out.println("Player  em pause moço");
            }
        } else {
           // System.out.println("");
            System.out.println("A tv não foi ligada");
        }
    }

    @Override
    public void pause() {
        if (this.ligado) {
            if(this.tocando){
                this.tocando=false;
                System.out.println("");
                System.out.println("A tv foi colocada em pausa");
            }else{
                this.tocando=true;
                System.out.println("");
                System.out.println("A tv foi colocada pra tocar");
            }
        } else {
            System.out.println("");
            System.out.println("TV desligada");
        }
    }

}
