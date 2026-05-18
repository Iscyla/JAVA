/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadedeprogrmacaojava03;

import java.util.Scanner;

/**
 *
 * @author priscyla.leffler
 */
public class AtividadeDeProgrmacaoJava03 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int quantidade = 0;
        double valor=0, soma=0, media=0;
        do{
            System.out.println("Digite um valor maior ou igual a zero para prosseguir: ");
            valor = scan.nextDouble();
            soma += valor;
            quantidade++;
            media=soma/quantidade;
            
        }while(valor >= 0);
        
        System.out.println("A quantidade total de valores digitados e: "+soma);
        System.out.println("A media dos valores e: "+media);
        
    }
}
