package aula14poo;
public abstract class Pessoa {     //a classe abstract serve para ser uma base para criar outras classes.
    protected String Nome , Sexo;
    protected int Idade , Experiencia;

    public Pessoa(String Nome, String Sexo, int Idade) {
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Idade = Idade;
        this.Experiencia = 0;
        
    }

    @Override
    public String toString() {
        return "{" + "Nome=" + Nome + ", Sexo=" + Sexo + ", Idade=" + Idade + ", Experiencia=" + Experiencia + '}';
    }

    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int Experiencia) {
        this.Experiencia = Experiencia;
    }
   
    protected void GanharExp(){
        this.Experiencia++;
    }
}
