package edu.arlete.sintaxejava.desafios.loopsExecoes;

import java.util.Scanner;

public class ontroleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do limite diário para saque: ");
        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {

            System.out.println("Informe o valor que deseja sacar: ");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                // TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
                /*
                Saque realizado. Limite restante: 1070.0
                 Transacoes encerradas.
                 */
                limiteDiario = limiteDiario-valorSaque;
                System.out.println("Saque realizado. Limite restante:"+ limiteDiario);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
