package pacclass;

public class ContaCorrentee {

    String nome;
    float saldo ;

    public ContaCorrentee(String nome) {
        this.nome = nome;
        saldo = 0;
    }

    ContaCorrentee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    float verificarSaldo() {
        return saldo;
    }

    void depositarValor(float valor) {
        saldo += valor;
    }

    void sacarValor(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Não tem saldo, saldo indisponivel ");
        }
    }
}
