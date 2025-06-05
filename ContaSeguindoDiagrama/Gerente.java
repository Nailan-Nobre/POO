package ContaSeguindoDiagrama;

public class Gerente extends PessoaFisica implements Autenticavel{
    private String agencia;

    // Métodos get e set
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Override
    public boolean autenticar(String senha) {
        // Implementação da lógica de autenticação do gerente
        return false;
    }
}
