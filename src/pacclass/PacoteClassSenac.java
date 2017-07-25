package pacclass;

import java.util.Scanner;

public class PacoteClassSenac {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaCorrentee ctc = new ContaCorrentee();
        System.out.println("Informe o Nome do Cliente");
        ctc.nome = entrada.next();
        System.out.println("Informe seu Saldo Inicial");
        ctc.saldo = entrada.nextFloat();
        
        System.out.println("Nome do clinete é "+ctc.nome);
        System.out.println("Seu saldo é: "+ctc.saldo);
    }
    
}
