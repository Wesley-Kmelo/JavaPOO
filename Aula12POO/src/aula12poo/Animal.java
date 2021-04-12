package aula12poo;

public abstract class Animal { //o termo abstract quer dizer que essa classe não pode ser instanciada,
                               //mas pode ser herdada.

protected int idade, membros; // o termo protected permite que todas as subclasses dessa classe pode ter
                              //acesso direto aos atributos dessa classe.
protected float peso;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    //o termo abstract no nome do método quer dizer que o método aqui citado será modificado apenas 
    //através do OVERRIDE nas classes que herdarem essa, ou seja, nas subclasses.
    //Como se fosse uma interface.
    
public abstract void locomover();
public abstract void alimentar();
public abstract void emitirSom();

    @Override
    public String toString() {
        return "Animal{" + "idade=" + idade + ", membros=" + membros + ", peso=" + peso + '}';
    }


}
