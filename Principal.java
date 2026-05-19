/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadepraticajava02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author priscyla.leffler
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        
        Conta_modificado c = new Conta_modificado();
        
        int opcao = 0, numeroConsulta = 0, contadorNumeroConta = 0;
        double valor = 0;
        boolean resposta; 
        
      System.out.println("*** Banco Online ***\n");
        
        /*System.out.println("Informe o numero da conta: ");
        c.numero = scan.nextInt();
        
        System.out.println("\nInforme o nome do(a) titular da conta: ");
        c.nome_titular = scan.next(); */
        
        System.out.println("""
            *** Menu de Selecao ***
                           
              Informe a opcao desejada abaixo:
                           
                
              \n1 - Criar conta
              \n2 - Visualizar saldo
              \n3 - Sacar
              \n4 - Depositar          
              \n5 - Sair
        """);
        
        opcao = scan.nextInt();
        
        while (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4){
            boolean respostaBusca = false;
            Iterator i = lista.iterator();
            
            switch (opcao){
                case 1:
                        c = new Conta_modificado();
                        System.out.println("\nInforme o nome do(a) titular da conta: ");
                        c.nome_titular = scan.next();

                        System.out.println("\nInforme o saldo atual da conta:  ");
                        c.saldo = scan.nextDouble();
                        
                        contadorNumeroConta++;
                        c.numero = contadorNumeroConta;
                        System.out.println("\nO numero da sua conta e: " + c.numero);

                        lista.add(c); 

                        break;
                case 2:
                        System.out.println("\nInforme o numero da conta: ");
                        numeroConsulta = scan.nextInt();

                        while(i.hasNext()){
                            c=(Conta_modificado)i.next();
                            
                            if (c.numero == numeroConsulta){
                                System.out.println("\nO saldo da conta e: "+c.saldo);
                                
                                respostaBusca = true;
                                break;
                            }
                        }
                        if(!respostaBusca){
                            System.out.println("Numero da conta esta incorreto!");
                        }
                        break;
                case 3:
                        System.out.println("\nInforme o numero da conta: ");
                        numeroConsulta = scan.nextInt();

                        while(i.hasNext()){
                            c=(Conta_modificado)i.next();
                            
                            if (c.numero == numeroConsulta){
                                System.out.println("Informe o valor que deseja sacar  : ");
                                valor = scan.nextDouble();
                                resposta = c.sacar(valor);
                                respostaBusca = true;
                                if(resposta){
                                    System.out.println("Saque realizado com sucesso!");
                                    System.out.println("\nO saldo atual da conta e: \n" + c.saldo);
                                }
                                else{
                                    System.out.println("Nao foi possivel realizar o saque.");
                                    System.out.println("\nO saldo atual da conta permanece: \n" + c.saldo);
                    }
                    break;
                            }
                        }
                        if(!respostaBusca){
                            System.out.println("Numero da conta esta incorreto!");
                        }
                        
                        break;
                case 4:
                       System.out.println("Informe o numero da conta: ");
                       numeroConsulta = scan.nextInt();
                       
                       while(i.hasNext()){
                            c=(Conta_modificado)i.next();
                            if (c.numero == numeroConsulta){
                                System.out.println("Informe o valor que deseja depositar na conta: ");
                                valor = scan.nextDouble();
                                c.depositar(valor);
                                System.out.println("\nO saldo atual da conta e: " + c.saldo);
                                respostaBusca = true;
                                break;
                            }
                       }
                       if(!respostaBusca){
                            System.out.println("Numero da conta esta incorreto!");
                        }
                        break;
                default:
                        break;
            }
            System.out.println("""
            *** Menu de Selecao ***
                           
              Informe a opcao desejada abaixo:
                           
                
                \n1 - Criar conta
                \n2 - Visualizar saldo
                \n3 - Sacar
                \n4 - Depositar
                \n5 - Sair
                        
                           """);
            opcao = scan.nextInt();
        }
        

    }
    
   
}
