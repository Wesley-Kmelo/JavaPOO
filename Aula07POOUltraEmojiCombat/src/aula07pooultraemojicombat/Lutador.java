package aula07pooultraemojicombat;

public class Lutador {
    //Atributos ou caracteristicas dessa classe

    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    //Métodos Públicos...que vão ser acessados por outras classes.
    public void apresentar() {
        System.out.println("Apresentando o Lutador " + this.getNome());
        System.out.println("Sua origem é da " + this.getNacionalidade());
        System.out.println("E tem " + this.getIdade() + " anos de idade e altura de " + this.getAltura() + " mts");
        System.out.println("Pesa " + this.getPeso() + " kilos.");
        System.out.println("Possui " + this.getVitorias() + " vitórias");
        System.out.println(this.getEmpates() + " empates");
        System.out.println("E " + this.getDerrotas() + " derrotas.");
        System.out.println("--------------------------------------------");
    }

    public void status() {

        System.out.println("O Lutador " + this.getNome());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println("E tem " + this.getVitorias() + " vitórias, "
                + this.getEmpates() + " empates e " + this.derrotas + " derrotas.");
        System.out.println("--------------------------------------------");

    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    //Métods Especiais...só podem ser acessados e modificados aqui
    //aqui se incluem os getters e setters e construtor
    //Método Construtor
    public Lutador(String no, String na, int id, int vi, int de, int em, float al, float pe) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.altura = al;
        this.setPeso(pe);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Abaixo do peso ideal.";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve.";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio.";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado.";
        } else {
            this.categoria = "Acima do peso ideal.";
        }

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

}
