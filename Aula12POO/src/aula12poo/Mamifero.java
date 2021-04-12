package aula12poo;

public class Mamifero extends Animal{
    private String corPele;
    
    @Override
    public void locomover() {
        System.out.println("Mamifero corre.");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamifero mama.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    
}
