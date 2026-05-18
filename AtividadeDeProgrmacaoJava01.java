/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadedeprogrmacaojava01;

import java.util.Scanner;

/**
 *
 * @author priscyla.leffler
 */
public class AtividadeDeProgrmacaoJava01 {

    public static void main(String[] args) {
        
        int idade = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a sua idade: ");
        idade = scan.nextInt();
        
        if (idade > 0 && idade < 16){
            System.out.println("Você ainda nao pode votar!");          
        }
        
        if (idade == 16 || idade == 17 || idade > 65){
            System.out.println("Voto facultativo!");          
        }
        
        if (idade >= 18 && idade <= 65){
            System.out.println("Voto obrigatorio!");          
        }
                
        else {
            System.out.println("Idade invalida.");
        }
        
        
    }
}
