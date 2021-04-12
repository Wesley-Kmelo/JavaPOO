package aula11poo;

public class Bolsista extends Aluno{
    private int Bolsa;

    public int getBolsa() {
        return Bolsa;
    }

    public void setBolsa(int Bolsa) {
        this.Bolsa = Bolsa;
    }
    
    public void RenewBolsa(){
        
    }

    @Override
    public void PagarMensal() {
        System.out.println("Pagando mensalidade do Bolsista " + this.getNome());
    }
    
}
