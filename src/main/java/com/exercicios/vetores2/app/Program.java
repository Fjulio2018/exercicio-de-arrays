package com.exercicios.vetores2.app;

import com.exercicios.vetores2.classes.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault( Locale.US );
        Scanner sc = new Scanner( System.in );
        Aluguel[] vet = new Aluguel[10];
        System.out.println("Quantos quartos serão alugados? ");
        int quantQuarAlu = sc.nextInt();

        for (int i=0; i<= quantQuarAlu;i++){
            System.out.println();
            System.out.println("Aluguel#: "+ i +":");
            System.out.println("Nome:");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Email:");
            String email = sc.nextLine();
            System.out.println("Quarto:");
            int quarto = sc.nextInt();
            vet[quarto] = new Aluguel( nome , email );

        }
        System.out.println();
        System.out.println("Ocupação: ");
        for ( int i=0; i<10; i++){
            if (vet[i] != null){
                System.out.println("No quarto "+ i + " ; " + vet[i]);
            }
        }










        sc.close();


    }
}
