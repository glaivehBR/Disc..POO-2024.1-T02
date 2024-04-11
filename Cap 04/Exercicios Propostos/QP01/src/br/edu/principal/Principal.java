package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		int nota1, nota2, nota3, nota4, media;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a nota 1:"); 
		nota1 = sc.nextInt();
		System.out.println("Digite a nota 2:");
		nota2 = sc.nextInt();
		System.out.println("Digite a nota 3:");
		nota3 = sc.nextInt();
		System.out.println("Digite a nota 4:");
		nota4 = sc.nextInt();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println(" ");
		
		if (media >= 7) {
               System.out.println("Aprovado");
            } else {
                System.out.println( "Reprovado");
            }
		
sc.close();		
	}
}
