package aula11poo;
public class Aula11POO {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        
        v1.setIdade(32);
        v1.setNome("Raimundo");
        v1.setSexo("Masc");
        v1.FazerNiver();
        
        a1.setNome("AlunoJao");
        a1.setIdade(40);
        a1.setSexo("Masc");
        a1.setCurso("Informatica");
        a1.PagarMensal();
        a1.FazerNiver();
        
        b1.setNome("bolsamaria");
        b1.setIdade(29);
        b1.setSexo("Fem");
        b1.FazerNiver();
        b1.PagarMensal();
        
        System.out.println(v1.toString());
        System.out.println(a1.toString()+a1.getCurso());
        System.out.println(b1.toString());
    }
    
}
