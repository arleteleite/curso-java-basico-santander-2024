package edu.arlete.BancoDigital;

import java.util.List;

public class Relatorio {
    private Banco banco;

    public Relatorio(Banco banco) {
        this.banco = banco;
    }

    // Método para exibir todas as contas
    public void exibirTodasAsContas() {
        List<Conta> contas = banco.getContas();
        System.out.println("Lista de todas as contas:");
        for (Conta conta : contas) {
            System.out.println("Agência: " + conta.getAgencia() +
                    ", Número: " + conta.getNumero() +
                    ", Saldo: " + conta.getSaldo() +
                    ", Cliente: " + conta.getCliente().getNome());
        }
    }

    // Método para exibir o saldo de uma conta específica
    public void exibirSaldo(Conta conta) {
        System.out.println("Saldo da Conta:");
        System.out.println("Agência: " + conta.getAgencia() +
                ", Número: " + conta.getNumero() +
                ", Saldo: " + conta.getSaldo());
    }

    // Método para exibir todas as contas de um cliente específico
    public void exibirContasDeCliente(Cliente cliente) {
        List<Conta> contas = banco.getContas();
        System.out.println("Contas do Cliente " + cliente.getNome() + ":");
        for (Conta conta : contas) {
            if (conta.getCliente().equals(cliente)) {
                System.out.println("Agência: " + conta.getAgencia() +
                        ", Número: " + conta.getNumero() +
                        ", Saldo: " + conta.getSaldo());
            }
        }
    }
}
