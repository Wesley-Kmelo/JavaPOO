package aula10pooprojetopessoas;
public class Aula10POOProjetoPessoas {

    //Programa Principal
    public static void main(String[] args) {
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p1.setNome("Pedro");
       p2.setNome("Maria");
       p3.setNome("Claudio");
       p4.setNome("Mariana");
       
       p2.setCurso("Informática");
       p3.setSalario(2500.75f);
       p4.setSetor("Almoxarifado");
       
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
