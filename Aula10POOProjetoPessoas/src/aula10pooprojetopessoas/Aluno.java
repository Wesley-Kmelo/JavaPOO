package aula10pooprojetopessoas;
public class Aluno extends Pessoa {  //o comando extends quer dizer que essa classe herda todos os atributos
                                     //e métodos existentes na classe Pessoa.
    private int mat;
    private String curso;
    
    public void CancelarMat(){
        System.out.println(" Matricula será cancelada ...");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
