package com.exercicios.vetores1.app;

import com.exercicios.vetores1.classes.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault( Locale.US );
        Scanner sc = new Scanner( System.in );

        System.out.println("Entre com o número de produtos: ");

        int quantProd = sc.nextInt();

        Produto[] vet = new Produto[quantProd];

        for (int i=0; i< vet.length;i++){
            sc.nextLine();
            System.out.println("Ente com o nome");
            String nome = sc.nextLine();
            System.out.println("Ente com o preco");
            double preco = sc.nextDouble();
            vet[i]= new Produto( nome , preco );
        }

        double soma = 0.0;
        for (int i=0; i< vet.length;i++){
            soma += vet[i].getPreco();

        }
        double media = soma/quantProd;
        System.out.printf( "A Média é: %.2f%n", media );










        sc.close();

    }
}
