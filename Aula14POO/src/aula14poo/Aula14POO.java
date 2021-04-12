package aula14poo;
public class Aula14POO {
    public static void main(String[] args) {
      //criação de um vetor v com 2 posições
      //atribuição do vetor atraves da instanciação da classe Video que de acordo com o 
      //seu construtor exige o nome ou atributo do seu parametro especificado
      
        Video v[] = new Video[2];
        v[0]= new Video("E o Vento Levou");
        v[1] = new Video("GUanabara");
        
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        
        //v[0].play();
        //v[1].pause();
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("JOao", "Masc", 22, "PédeFeijão");
       // System.out.println(v[0].toString());
        //System.out.println(v[1].toString());
        //System.out.println(g[0].toString());
        
    //mesma explicação acima. Criação de objetos instanciando da classe Visualização que foi agregada
    //com atributos e métodos das classe Gafanhoto e Video.
    
        Visualizacao vi = new Visualizacao(g[0],v[0]);
        System.out.println(vi.toString());
        Visualizacao vis = new Visualizacao(g[0],v[1]);
        vis.avaliar();
        System.out.println(vis.toString());
        vis.avaliar(5);
        System.out.println(vis.toString());
        vis.avaliar(52.6f);
        System.out.println(vis.toString());
    }
    
}
