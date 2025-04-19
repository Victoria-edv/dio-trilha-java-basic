public class ContaTeste {
    public static void main(String[] args) {
        Conta minhaConta = new Conta(); // cria uma nova conta

        minhaConta.imprimirSaldo(); // mostra o saldo inicial

        minhaConta.sacar(5.0); // realiza um saque

        minhaConta.imprimirSaldo(); // mostra o saldo após o saque

        double divida = minhaConta.calcularDividaExponencial(); // calcula a dívida
        System.out.println("Dívida exponencial calculada: R$" + divida);
    }
}