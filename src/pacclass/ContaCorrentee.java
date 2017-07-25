package pacclass;

public class ContaCorrentee {

    String nome;
    float saldo = 0;

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
