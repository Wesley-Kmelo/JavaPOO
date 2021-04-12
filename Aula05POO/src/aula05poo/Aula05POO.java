package aula05poo;

import java.util.Scanner;

public class Aula05POO {

    public static void main(String[] args) {
        int resp, resp1;
        Scanner tec = new Scanner(System.in);
        ContaBanco p1 = new ContaBanco();

        System.out.println("Escolha 1 para começar ou 0 para encerrar");
        resp = tec.nextInt();
        do {
            if (resp == 1) {
                do {
                    System.out.println("1 AbreCOnta 2Deposita 3Saca 4Fechar 0Termina");
                    resp1 = tec.nextInt();
                    switch (resp1) {
                        case 1:
                            p1.abrirConta();
                            break;
                        case 2:
                            p1.depositar();
                            break;
                        case 3:
                            p1.sacar();
                            break;
                        case 4:
                            p1.fecharConta();
                            break;
                        case 0:
                            break;
                    }
                } while (resp1 != 0);
                System.out.println("Operações encerradas");
                System.out.println("O valor da conta de P1 é " + p1.getSaldo());
                System.out.println("Deseja Continuar ?" + "(1 para sim e 0 para não)");
                resp = tec.nextInt();

            } else if (p1.isStatusConta() == false) {
                System.out.println("A conta ainda não foi aberta.");
                System.out.println("Deseja abrir ? "+"(1 para sim e 0 para não)");
                resp = tec.nextInt();
                
            } else {
                System.out.println("Procedimento encerrado");
                System.out.println("O valor da conta de P1 é " + p1.getSaldo());
                System.out.println("Deseja Continuar ?" +"(1 para sim e 0 para não)");
                resp = tec.nextInt();
            }
        } while (resp != 0);
        System.out.println(
                "Programa Terminado");
        System.out.println(
                "O valor do saldo da conta de  " + p1.getDono() + " é de " + p1.getSaldo());
    }
}
