import br.com.bancodigital.multbank.negocio.Cliente;
import br.com.bancodigital.multbank.negocio.Conta;
import br.com.bancodigital.multbank.negocio.ContaCorrente;
import br.com.bancodigital.multbank.negocio.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente anderson = new Cliente();
        anderson.setNome("Anderson");

        Conta cc = new ContaCorrente(anderson);
        Conta poupanca = new ContaPoupanca(anderson);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
