package aula12poo;
public class Peixe extends Animal{
private String CorEscama;

    public String getCorEscama() {
        return CorEscama;
    }

    public void setCorEscama(String CorEscama) {
        this.CorEscama = CorEscama;
    }

    @Override
    public void locomover() {
        System.out.println("peixe nada");
    }

    @Override
    public void alimentar() {
        System.out.println("peixe bebe");
    }

    @Override
    public void emitirSom() {
        System.out.println("peixe não emite som");
    }
    public void SoltarBolha(){
        System.out.println("Peixe soltou bolha");
    }
    
    
}
