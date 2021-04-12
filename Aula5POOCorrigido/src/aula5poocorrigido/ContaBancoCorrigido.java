package aula5poocorrigido;
public class ContaBancoCorrigido {
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private String txtstatus, txttipoconta;
    
    //MÉTODO CONSTRUTOR
    // sempre criar esse método com o nome da classe
    
    public  ContaBancoCorrigido(){
    this.setNumConta(0);
    this.setTipo("");
    this.setDono("<vazio>");
    this.setSaldo(0);
    this.status=false;  
      
}
    public void EstadoAtual (){
         if (this.getStatus()){
           txtstatus="A conta está aberta.";
       }else{
           txtstatus=" A conta está fechada";
       }
        if (this.getTipo()=="cc") {
            txttipoconta="Conta Corrente";
        } else if (this.getTipo()=="cp"){
            txttipoconta="Conta Poupança";
        }else{
            txttipoconta="Encerrada / Fechada";
        }
        System.out.println("__________________________________________________");
        System.out.println("O número da Conta é : " + this.getNumConta());
        System.out.println("O tipo da Conta é " + txttipoconta);
        System.out.println("O proprietário da conta se chama : " + this.getDono());
        System.out.println("O saldo da conta acima mencionada é de : " +this.getSaldo());
        System.out.println("___________________________________________________");       
    }
    public void abrirConta(String t){    // sempre é aconselhavel modificar os atributos através de métodos
                                         //set.
        this.setTipo(t); 
        this.setStatus(true); //nesta linha estou dizendo que o método setStatus recebe o valor true.
        if (t=="cc") {
            this.setSaldo(50);
        } else if (t=="cp"){
            this.setSaldo(150);
        }else{
            System.out.println("Dados Inválidos");
            System.out.println("O valor do saldo será de " + this.getSaldo());
        }
        System.out.println("Conta aberta com sucesso.");     
        
        
    }
    public void fecharConta(){
        if (this.getSaldo()>0) {
            System.out.println("Conta com Dinheiro");
            
        } else if (this.getSaldo()<0){
            System.out.println("Conta com débitos");
        }else{
            this.setStatus(false);
            System.out.println("Conta encerrada");
        }        
    }
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(getSaldo()+v);
            System.out.println("Depositado com sucesso na conta " + this.getNumConta() +" do dono " + this.getDono());
        } else {
            System.out.println("A conta não está aberta");
        }
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo()>=v) {
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque de " + v+ " realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("A conta está fechada");
        }
    }
    public void pagarMensal(){
        int v =0;
        if (this.getTipo()=="cc") {
            v=12;
        } else if (this.getTipo()=="cp"){
            v=20;
        }
        if (this.getStatus()) {
            if (this.getSaldo()>0) {
                setSaldo(this.getSaldo()-v);
                System.out.println("Valor da mensalidade descontada : " + v);
            } else {
                System.out.println("Saldo Insuficiente para descontar  mensalidade");
            }
        } else {
            System.out.println("Como pagar se a conta tá fechada?");
        }
    }
    public void dadosIniciais(){
        System.out.println("Dados iniciais da conta ");
        System.out.println("O número da conta é : " +this.numConta);
        System.out.println("O proprietário desta conta está " + this.dono);
        System.out.println("O saldo desta conta é : " + this.saldo);
        System.out.println(txtstatus);
        
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}