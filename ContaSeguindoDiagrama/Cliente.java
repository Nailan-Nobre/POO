package ContaSeguindoDiagrama;

public class Cliente extends PessoaFisica implements Autenticavel {
    private Conta conta;

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public boolean autenticar(String senha) {
    // Implementação da lógica de autenticação do cliente
        return false;
    }
}
