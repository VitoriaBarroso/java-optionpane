public class teste {

    public static void main(String[] args) {

        // --- 1. Teste da Classe Cliente e Interface Autenticavel ---
        System.out.println("\n--- 1. TESTE CLIENTE E AUTENTICAÇÃO ---");
        cliente c1 = new cliente("João Silva", "123.456.789-00", "senha123", 1001);

        // Teste de herança e polimorfismo (método da Pessoa)
        System.out.println("Tipo de Objeto: " + c1.getTipo()); // Esperado: Cliente

        // Teste de Autenticação (Caso de sucesso)
        boolean resultado1 = c1.autentica("senha123");
        System.out.println("Resultado 1 (Sucesso): " + resultado1); // Esperado: true

        // Teste de Autenticação (Caso de falha)
        boolean resultado2 = c1.autentica("senhaerrada");
        System.out.println("Resultado 2 (Falha): " + resultado2); // Esperado: false

        // Teste de Composição (Conta Bancária)
        System.out.println("Saldo Inicial: R$" + c1.getConta().getSaldo()); // Esperado: 0.0
        c1.getConta().depositar(500.0);
        System.out.println("Novo Saldo: R$" + c1.getConta().getSaldo()); // Esperado: 500.0


        // --- 2. Teste da Classe Funcionario e Interface Autenticavel ---
        System.out.println("\n--- 2. TESTE FUNCIONÁRIO E AUTENTICAÇÃO ---");
        funcionario f1 = new funcionario("Maria Souza", "987.654.321-99", 3000.00, "123");

        // Teste de herança (método da Pessoa)
        System.out.println("Nome do Funcionário: " + f1.getNome());

        // Teste de Regra de Negócio (Bonificação)
        double bonificacao = f1.getBonificacao();
        System.out.println("Bonificação (10% de 3000): R$" + bonificacao); // Esperado: 300.0

        // Teste de Autenticação do Funcionário (Caso de Sucesso - Senha dupla)
        boolean resultado3 = f1.autentica("123");
        System.out.println("Resultado 3 (Sucesso): " + resultado3); // Esperado: true

        // Teste de Autenticação do Funcionário (Caso de Falha - Senha incorreta)
        boolean resultado4 = f1.autentica("456");
        System.out.println("Resultado 4 (Falha): " + resultado4); // Esperado: false

        // --- 3. Teste de Polimorfismo ---
        System.out.println("\n--- 3. TESTE DE POLIMORFISMO ---");
        // Uma variável do tipo interface pode receber objetos de diferentes classes
        Main a1 = c1;
        Main a2 = f1;

        System.out.print("Polimorfismo (Cliente): ");
        a1.autentica("senha123"); // Chama a implementação de Cliente

        System.out.print("Polimorfismo (Funcionário): ");
        a2.autentica("123");      // Chama a implementação de Funcionario

    }
}