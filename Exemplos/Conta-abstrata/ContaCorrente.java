public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    @Override
    void sacar (double valor) {
        double saldoDisponivel = getSaldo () + limiteChequeEspecial;
        if (valor > 0 && valor <= saldoDisponivel) {
            double novoSaldo = getSaldo() - valor;
            depositar (novoSaldo - getSaldo());
            System.out.println("Saque de R$" + valor + "realizado na conta corrente.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
}
