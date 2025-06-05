package ContaSeguindoDiagrama;

public abstract class Conta {
    private int numero;
    private double saldo;

    // métodos get e set

    public void depositar (double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + "realizado na conta." + this.numero);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    abstract void sacar (double valor);

    public void consultarsaldo() {
        System.out.println("Saldo da conta" + this.numero + ": R$" + this.saldo);
    }

    public double getSaldo() {
        return this.saldo;
    }
}
