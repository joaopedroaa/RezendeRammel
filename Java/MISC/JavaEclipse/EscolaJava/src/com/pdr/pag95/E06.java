package com.pdr.pag95;

import java.util.Scanner;
/* P D R */		
public class E06 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String n,e;
		int t;
		
		
		System.out.print("Nome: ");
		n = sc.nextLine();
		
		System.out.print("Endre�o: ");
		e = sc.nextLine();
		
		System.out.print("Telefone: ");
		t = sc.nextInt();
		
		
		System.out.println("\n\nNome: " + n);
		System.out.println("Endere�o: " + e);
		System.out.println("Telefone " + t);
		
	}

}
