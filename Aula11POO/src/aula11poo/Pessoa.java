package aula11poo;
public abstract class Pessoa { //o termo abstract quer dizer que essa classe em especifico não pode ser
                               //instanciada como objeto. Mas se alguma classe receber ela como herança
                               //através do trmo extends, aí essa classe poderá instanciar com todos os 
                               //métodos e atributos desta classe.
    private String nome, sexo;
    private int idade;
    
    public final void  FazerNiver(){ //o termo final quer dizer que esse método não pode ser sobreescrito 
                                     //através do comando OVERRIDE . O que está programado aqui não pode
                                     //ser mudado quando essa classe for herdada por outras classes.
            this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Dados da Pessoa:" + "Nome= " + nome + ", Sexo= " + sexo + ", Idade= " + idade ;
    }
    
    
}
