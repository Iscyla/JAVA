/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepraticajava02;

/**
 *
 * @author priscyla.leffler
 */
public class Conta_modificado {
    
    private int numero;
    private String nome_titular;
    private double saldo;
    
    public Conta_modificado() {

    }
    
    public Conta_modificado(int numero, String nome_titular, double saldo){
        this.numero = numero;
        this.nome_titular=nome_titular;
        this.saldo=saldo;
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    
    public boolean sacar(double valor){
            if (this.saldo>=valor){
                this.saldo-=valor;
                return(true);
            }
            else
                return false;
    }
    
    public double getSaldo() { 
        return saldo;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public String getNome_titular() {
        return nome_titular;
    }
    
    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }
  
}

