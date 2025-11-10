public class contaBancaria {
    private int numeroConta;
    private double saldo;

    public contaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + this.saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }
}