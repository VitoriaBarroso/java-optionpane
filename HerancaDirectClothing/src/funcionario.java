public class funcionario extends pessoa implements Main {
    private double salario;
    private String senha;

    public funcionario(String nome, String cpf, double salario, String senha) {
        super(nome, cpf);
        this.salario = salario;
        this.senha = senha;
    }

    @Override
    public boolean autentica(String senha) {

        if (this.senha.equals(senha) && senha.equals("123")) {
            System.out.println("Autenticação do Funcionário " + this.nome + " bem-sucedida.");
            return true;
        } else {
            System.out.println("Autenticação do Funcionário " + this.nome + " falhou.");
            return false;
        }
    }

    @Override
    public String getTipo() {
        return "Funcionário";
    }

    public double getBonificacao() {
        return this.salario * 0.10;
    }
}