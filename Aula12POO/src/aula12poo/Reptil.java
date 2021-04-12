package aula12poo;

public class Reptil extends Animal{
    private String CorEscama;

    public String getCorEscama() {
        return CorEscama;
    }

    public void setCorEscama(String CorEscama) {
        this.CorEscama = CorEscama;
    }

    @Override
    public void locomover() {
        System.out.println("reptil rasteja");
    }

    @Override
    public void alimentar() {
        System.out.println("come vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil");
    }
    
}
