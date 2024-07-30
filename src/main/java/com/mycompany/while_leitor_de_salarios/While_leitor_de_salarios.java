/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while_leitor_de_salarios;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class While_leitor_de_salarios {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int masculino, feminino, opcao = 0,somamasculino = 0,somafeminino = 0;
        
 
        
        do {
                System.out.println("Digite o salario de cada funcionario");
                System.out.println("1. Masculino.");
                System.out.println("2. Feminino.");
                System.out.println("3. Sair");
                opcao = teclado.nextInt();
            switch (opcao) {
                
                case 1:
                    System.out.println("Digite o salario do funcionario.");
                    masculino = teclado.nextInt();
                    somamasculino += masculino;
                    break;
                    
                case 2:
                    System.out.println("Digite o salario da funcionaria.");
                    feminino = teclado.nextInt();
                    somafeminino += feminino;
                    break;
                    
                default:
                    System.out.println("Opçâo invalida, Tente um numero valido");
            } 
            }while (opcao != 3);
            
            if (somamasculino > 0){
                System.out.println("O Salario total dos homens é de: " + somamasculino + "R$");
                
            }if (somafeminino > 0) {
                System.out.println("O salario total das mulheres é de: " + somafeminino + "R$");
            }
            
        
        
    }
}
