package ContaSeguindoDiagrama;

public class Diretor extends PessoaFisica implements Autenticavel {
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public boolean autenticar(String senha) {
    // Implementação da autenticação do diretor
        return false;
    }
}
