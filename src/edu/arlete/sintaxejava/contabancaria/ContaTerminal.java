package edu.arlete.sintaxejava.contabancaria;

import java.util.Scanner;

/**
 * Projeto de criação de conta bancaria
 * Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a
 * mensagem de qual informação será solicitada, exemplo:
 * Programa: "Por favor, digite o número da Agência !"
 * Usuário: 1021 (depois ENTER para o próximo campo)
 */
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo =562.65;
        String nome, agencia, numeroConta;

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = sc.next();
        System.out.println("Por favor, informe o número da Conta: ");
        numeroConta = sc.next();
        System.out.println("Por favor, informe o seu nome: ");
        nome = sc.next();

        System.out.println("Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agência é " +
                        "").concat(agencia).concat(" e conta é ").concat(numeroConta).concat("."));
        System.out.println("O seu saldo é R$ "+saldo+" já está disponível para saque.");


    }

}
