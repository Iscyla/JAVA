/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplos;

import java.util.Scanner;

/**
 *
 * @author priscyla.leffler
 */
public class Programa {
    
    public static void main(String[] args) {
        
        String nome;
        double deposito;
        double saque;
                
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o seu nome: ");
        nome = scan.nextLine();
        System.out.println("Qual o valor do seu deposito? ");
        deposito = scan.nextDouble();
        
        Conta c;  // Declarando a variavel que conterá a referência ao objeto
        c = new Conta(); // Instanciamento um objeto em memória
        c.nome_titular = nome;
        c.depositar(deposito);
        System.out.println("Titular: "+ c.nome_titular);
        System.out.println("Saldo Atual: "+ c.saldo);
            
        System.out.println("Qual o valor do seu saque? ");
        saque = scan.nextDouble();
        
        boolean saque_efetuado = c.sacar(saque);
        if (saque_efetuado)
            System.out.println("Saque efetuado com sucesso!");
        else 
            System.out.println("Saque nao eftuado! Saldo insuficiente!");
    }
    
}
