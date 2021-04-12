package aula5poocorrigido;
public class Aula5POOCorrigido {
    public static void main(String[] args) {
        ContaBancoCorrigido p1 = new ContaBancoCorrigido();
        ContaBancoCorrigido p2 = new ContaBancoCorrigido();
        
        p1.setNumConta(123);
        p2.setNumConta(456);
        p1.setDono("Jubileu");
        p2.setDono("Terezinha");
        p1.abrirConta("cc");
        p2.abrirConta("cp");
        p1.depositar(300);
        p2.depositar(1000);
        p2.sacar(3400);
        p1.fecharConta();
        p1.sacar(350);
        p1.fecharConta();
        p1.depositar(100);
        
        p1.EstadoAtual();
        p2.EstadoAtual();
    }     
}
