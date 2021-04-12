package aula06poo;
public interface Controlador {  //a interface serve para dizer quais métodos abstratos
                                //vou ter no meu código. Uma lista dos métodos utilizados
                                // por assim dizer.
   // a interface é o que o seu nome quer dizer. É a interação do usuário com o aplicativo criado
    
    public abstract void ligar();
    public abstract void desligar();
    public abstract void  abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
    
}
