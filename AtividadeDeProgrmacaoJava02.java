/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadedeprogrmacaojava02;

import java.util.Scanner;

/**
 *
 * @author priscyla.leffler
 */
public class AtividadeDeProgrmacaoJava02 {

    public static void main(String[] args) {
        
        double soma=0, media=0;
        int notasAcima=0, notasAbaixo=0;
        double notasAluno[] = new double [10];
       
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < notasAluno.length; i++){
             
            System.out.println("Insira a sua nota: ");
            
            notasAluno[i] = scan.nextDouble();
            soma += notasAluno[i];
            media = soma / (notasAluno.length);
            }
        
        for (int i = 0; i < notasAluno.length; i++){
            if (notasAluno[i] > media){
                notasAcima++;
            }
            
            if (notasAluno[i] < media){
                notasAbaixo++;
            }
        }
        
        System.out.println("A soma total das notas e: "+soma);
        System.out.println("A media das notas e: "+media);
        System.out.println("A quantidade das notas acima da media e: " + notasAcima);
        System.out.println("A quantidade das notas abaixo da media e: " + notasAbaixo);
    }
}
