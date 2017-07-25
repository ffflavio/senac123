package pacclass;

import java.util.Scanner;

public class PacoteClassSenac {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe nome do cliente");
        ContaCorrentee ctc = new ContaCorrentee(entrada.next());

        System.out.println("Situacao do cliente");
        System.out.println("Nome do sacador " + ctc.nome);
        System.out.println("Seu saldo é: " + ctc.verificarSaldo());
        int menu;
        do {
            System.out.println("\n *************Menu************");
            System.out.println("Saldo opção 1");
            System.out.println("Deposito opção 2");
            System.out.println("Sacar opção 3");
            System.out.println("Sair do sistema opção 0");
            menu = entrada.nextInt();
            if (menu == 1) {
                System.out.println("Seu saldo é: "+ctc.verificarSaldo());

            }  if (menu == 2) {
                System.out.println("Quanto deseja depositar");
                ctc.depositarValor(entrada.nextFloat());

            }  if (menu == 3) {
                System.out.println("Quanto desejas sacar ");
                ctc.sacarValor(entrada.nextFloat());
            }  if (menu == 0) {
                System.out.println("Adeus");

            }else {
                System.out.println("\n Digite um opção valida no Menu");
            }

        } while (menu !=0);

    }
    

}
