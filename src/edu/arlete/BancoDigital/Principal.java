package edu.arlete.BancoDigital;

public class Principal {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Exemplo");

        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");

        Conta cc1 = new ContaCorrente(cliente1);
        Conta cc2 = new ContaCorrente(cliente2);
        Conta cp1 = new ContaPoupanca(cliente1);

        banco.adicionarConta(cc1);
        banco.adicionarConta(cc2);
        banco.adicionarConta(cp1);

        cc1.depositar(1000);
        cc2.depositar(2000);
        cp1.depositar(500);
        cc1.transferir(300, cp1);
        cc2.transferir(100, cc1);

        Relatorio relatorio = new Relatorio(banco);

        // Exibir todas as contas
        System.out.println("Todas as contas:");
        relatorio.exibirTodasAsContas();

        // Exibir saldo de uma conta específica
        System.out.println("\nSaldo da conta 1:");
        relatorio.exibirSaldo(cc1);

        // Exibir todas as contas de um cliente específico
        System.out.println("\nContas de João:");
        relatorio.exibirContasDeCliente(cliente1);
    }
}
