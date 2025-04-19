public class Conta {
    // variável da classe conta
    double saldo = 10.0;

    // método para sacar valor da conta
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;  // Atualiza o saldo
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }

    // método para imprimir o saldo atual
    public void imprimirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    // método que simula o crescimento de uma dívida
    public double calcularDividaExponencial() {
        double valorParcela = 50.0;
        double valorMontante = 0.0; // começando a variável com valor zero
        for (int x = 1; x <= 5; x++) {
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        return valorMontante;
    }
}
