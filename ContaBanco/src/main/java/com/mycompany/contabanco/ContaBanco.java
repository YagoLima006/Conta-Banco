
	/*path = conta-banco-dio/Conta-Banco
	url = https://YagoLima006@github.com/YagoLima006/Conta-Banco.git
       Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license*/
 

package com.mycompany.contabanco;

import java.util.Scanner;

/**
 *
 * @author yagof
 */
public class ContaBanco {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite seu nome: ");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Digite o numero da conta:");
            int numeroConta = scanner.nextInt();
            
            System.out.println("Digite agencia: ");
            String agencia = scanner.nextLine();
            
            System.out.println("Digite o saldo: ");
            Double saldo = scanner.nextDouble();
            
           System.out.println("ola " +nomeCliente+ "obrigado por criar conta em nosso banco, sua agencia e " +agencia+ " o numero da conta " +numeroConta+ "e o saldo de " +saldo+ " ja esta disponivel para saque");
           
           scanner.close();
        }
    };
}
