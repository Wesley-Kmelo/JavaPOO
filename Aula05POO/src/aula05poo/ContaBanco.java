package aula05poo;

import java.util.Scanner;

public class ContaBanco {

    public int numConta, mov;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean statusConta;
    private String txtStatus;

    Scanner teclado = new Scanner(System.in); //criar entrada de dados pelo teclado 

    public ContaBanco() {      // MÉTODO CONSTRUTOR
        this.numConta = 0;
        this.tipoConta = "conta não criada";
        this.dono = "<vazio>";
        this.saldo = 0;
        this.statusConta = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numc) {
        this.numConta = numc;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tc) {
        this.tipoConta = tc;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String ndc) {
        this.dono = ndc;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float sc) {
        this.saldo = sc;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    public void abrirConta() {
        if (this.statusConta == false) {
            System.out.print("Para abrir uma conta, digite o número da Conta..");
            this.numConta = teclado.nextInt();

            System.out.print("Nome do Proprietário da conta ");
            this.dono = teclado.next();

            System.out.print("Digite 'cc' para ContaCorrente ou 'cp' para ContaPoupança...");
            this.tipoConta = teclado.next();
            if ("cc".equals(this.tipoConta)) {
                this.saldo += 50;
            } else if ("cp".equals(this.tipoConta)) {
                this.saldo += 150;
            }
            pagarMensalidade();
            this.statusConta = true;
        } else {
            System.out.println("A conta já está aberta.");
        }
    }

    public void fecharConta() {
        if (this.saldo < 0) {
            System.out.println("Você deve regularizar este débito no valor de " + this.saldo);
            depositar();
            System.out.println("Agora você deve sacar esse dinheiro...");
            sacar();
        } else if (this.saldo > 0) {
            System.out.println("Você deve sacar o valor de " + this.saldo + " antes de fechar essa conta.");
            sacar();
        } else {
            System.out.println("Conta encerrada...");
            this.statusConta = false;
        }
    }

    public void depositar() {
        if (this.statusConta = true) {
            System.out.println("Quanto deseja depositar ? ");
            this.saldo += teclado.nextInt();
            this.saldo-=mov;
            
        } else {
            System.out.println("A conta ainda não está aberta");
        }
    }

    public void sacar() {
        if (this.statusConta==true){
        if (this.saldo > 0) {
            System.out.println("Quanto deseja sacar? ");
            this.saldo -= teclado.nextFloat();
            this.saldo-=mov;
            
        } else {
            System.out.println("Deseja encerrar a conta ?");
            String r = teclado.next();
            if (r == "sim") {
                fecharConta();
            } else {
                System.out.println("Então deposite o valor que vc quiser...");
                depositar();
            }
        }
    }else{
            System.out.println("Não tem conta aberta ainda");
        }
    }
    public void pagarMensalidade() {
        //int tx = 0;        
        if (this.tipoConta=="cc") {
            mov = 12;
        }else{
            mov = 20;
        }
    }

    public void status() {
        if (statusConta == true) {
            txtStatus = "A conta está aberta";
        } else {
            txtStatus = "A conta está fechada";
        }
        System.out.println("Dados da Conta");
        System.out.println("Numero da Conta: " + numConta);
        System.out.println("Tipo da conta:  " + tipoConta);
        System.out.println("Proprietário da Conta: " + dono);
        System.out.println("Saldo da Conta: " + saldo);
        System.out.println(txtStatus);
    }
}
