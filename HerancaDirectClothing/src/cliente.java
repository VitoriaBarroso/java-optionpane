public class cliente extends pessoa implements Main {
    private String senha;
    private contaBancaria conta;

    public cliente(String nome, String cpf, String senha, int numeroConta) {
        super(nome, cpf);
        this.senha = senha;
        this.conta = new contaBancaria(numeroConta);
    }

    @Override
    public boolean autentica(String senha) {
        if (this.senha.equals(senha)) {
            System.out.println("Autenticação do Cliente " + this.nome + " bem-sucedida.");
            return true;
        } else {
            System.out.println("Autenticação do Cliente " + this.nome + " falhou.");
            return false;
        }
    }

    @Override
    public String getTipo() {
        return "Cliente";
    }

    public contaBancaria getConta() {
        return conta;
    }
}