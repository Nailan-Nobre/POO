package ContaBancaria;
public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    //metodos getters e setters
    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return this.titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return this.saldo;
    }

    //metodo sacar
    public boolean sacar(double valor) {
        if (valor > this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    //metodo depositar
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
}
