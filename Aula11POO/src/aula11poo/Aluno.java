package aula11poo;

public class Aluno extends Pessoa {
    private int Mat;
    private String curso;

    public int getMat() {
        return Mat;
    }

    public void setMat(int Mat) {
        this.Mat = Mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void PagarMensal(){
        System.out.println("Pagando mensalidade do aluno "+ this.getNome());
    }
}
