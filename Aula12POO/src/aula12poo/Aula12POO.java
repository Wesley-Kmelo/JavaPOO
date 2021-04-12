package aula12poo;

public class Aula12POO {

    public static void main(String[] args) {

        Mamifero a1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave av = new Ave();
        
        Canguru c1 = new Canguru();
        Cachooro k1 = new Cachooro();
        
        a1.locomover();
        c1.locomover();
        a1.emitirSom();
        k1.emitirSom();
        
    }
    
}
