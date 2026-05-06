/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepraticajava02;

import java.util.Scanner;

/**
 *
 * @author priscyla.leffler
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Conta c;
        c = new Conta();
        
        int opcao = 0;
        double valor = 0;
        boolean resposta;
        
        System.out.println("*** Banco Online ***\n");
        
        System.out.println("Informe o numero da conta: ");
        c.numero = scan.nextInt();
        
        System.out.println("\nInforme o nome do(a) titular da conta: ");
        c.nome_titular = scan.next();
        
        System.out.println("\nInforme o saldo atual da conta:  ");
        c.saldo = scan.nextDouble();
        
        System.out.println("""
            *** Menu de Selecao ***
                           
              Informe a opcao desejada abaixo:
                           
                
              \n1 - Depositar
              \n2 - Sacar
              \n3 - Sair
                        
                           """);
        
        opcao = scan.nextInt();
        
        while (opcao == 1 || opcao == 2){
            switch (opcao){
                case 1:
                       System.out.println("Informe o valor que deseja depositar na conta: ");
                       valor = scan.nextDouble();
                       c.depositar(valor);
                       break;
                case 2:
                       System.out.println("Informe o valor que deseja sacar da conta: ");
                       valor = scan.nextDouble();
                       resposta = c.sacar(valor);
                       if(resposta){
                           System.out.println("Saque realizado com sucesso!");
                           System.out.println("\nO saldo atual da conta e: \n" + c.saldo);
                       }
                       else{
                           System.out.println("Nao foi possivel realizar o saque.");
                           System.out.println("\nO saldo atual da conta permanece: \n" + c.saldo);
                       }
                       break;
                default:
                       break;
            }
            System.out.println("""
            *** Menu de Selecao ***
                           
              Informe a opcao desejada abaixo:
                           
                
              \n1 - Depositar
              \n2 - Sacar
              \n3 - Sair
                        
                           """);
            opcao = scan.nextInt();
        }
        

    }
    
   
}
