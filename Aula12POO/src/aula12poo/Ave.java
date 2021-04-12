package aula12poo;

public class Ave extends Animal{
private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Ave voa ");
    }

    @Override
    public void alimentar() {
        System.out.println("Ave comendo minhoca");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de passaro");
    }
    
    public void fazerNinho(){
        System.out.println("Contruiu ninho");
    }
}
