package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
	int	num1, num2;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite os números:");
	
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	
	if (num1 > num2) {
        System.out.println("Esse é o menor número:" + " "+ num2);
     } else {
         System.out.println("Esse é o menor número:" + " "+ num1);
	}
}
}