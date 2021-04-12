package aula07pooultraemojicombat;

public class Aula07POOUltraEmojiCombat {

    public static void main(String[] args) {
        //Para criar varios objetos de uma classe pode-se usar os vetores.
        //No caso abaixo eu chamo a classe(Lutador) e digo que o objeto ou instância vai se chamar l.
        //quando eu coloco os [], estou dizendo que é um vetor. Agora eu atribuo atraves do sinal de igual
        //uma nova instância contendo 6 posições (de 0 a 5).
        //Em seguida eu atribuo as caracteristicas de cada lutador em cada posição,de acordo como foi montado
        //no método CONSTRUTOR da classe Lutador.
        
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 11, 2, 1, 1.75f, 68.9f);
        l[1] = new Lutador("Putscript", "Brasil", 29, 14, 2, 3, 1.68f, 57.8f);
        l[2] = new Lutador("SnapShadow", "EUA", 35, 12, 2, 1, 1.65f, 80.9f);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 13, 0, 2, 1.70f, 119.3f);
        l[4] = new Lutador("UFO Cobol", "Brasil", 37, 5, 4, 3, 1.70f, 119.3f);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 12, 2, 4, 1.81f, 105.7f);
        
        Luta UEC01=new Luta();
        UEC01.MarcarLuta(l[4], l[5]);

    }

}
