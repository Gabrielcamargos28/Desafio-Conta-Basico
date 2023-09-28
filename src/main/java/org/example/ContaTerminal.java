package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE O NUMERO:");
        int numero = scan.nextInt();
        System.out.println("DIGITE A AGENCIA:");
        String agencia = scan.next();
        System.out.println("DIGITE O NOME:");
        String nome = scan.next();
        System.out.println("DIGITE O SALDO");
        double saldo = scan.nextDouble();

        System.out.println("Olá" +nome+ " obrigado por criar uma conta em nosso banco, sua agência é "+
                agencia+" , conta"+ numero + " e seu saldo" +saldo+" já está disponível para saque");
    }
}