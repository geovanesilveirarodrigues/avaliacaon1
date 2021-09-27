package Jogo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {

		Scanner jogo = new Scanner(System.in);

		System.out.println("___jokenpo___");
		System.out.println(" 1. Papel");
		System.out.println(" 2. Pedra");
		System.out.println(" 3. Tesoura");
		System.out.println("Digite a opção Desejada");

//	    1 - Papel; 2 - Pedra; 3 - Tesoura
//		u(1) c(2) = -1 vencedor Usuario
//		u(2) C(1) = -1 vencendor Computador
//		u(3) c(1) =  2 vencendor Usuario
//		u(1) c(3) =  2 vencendor Computador
//		u(2) c(3) =  1 vencendor Usuario
//		u(3) c(2) = -1 vencendor Computador

		Random rand = new Random();
		int escolhaComputador;

		Scanner teclado = new Scanner(System.in);
		int numeroUsuario;

		numeroUsuario = teclado.nextInt();
		escolhaComputador = rand.nextInt(3) + 1; // Gera um numero entre 1 e 3
//		imprimier a escolha do computador
		switch(escolhaComputador) {
		case 1:
			System.out.println("Computador escolheu Papel");
			break;
		case 2:
			System.out.println("Computador escolheu Pedra");
		case 3:
			System.out.println("Computador escolheu Tesoura");
			break;
					
		}
//verificação do resultado
		if (numeroUsuario == escolhaComputador) {
			System.out.println("Empate");
		} 
		if((numeroUsuario - escolhaComputador) == -1 || (numeroUsuario - escolhaComputador) == 1) {
			System.out.println("Usuario Vencendor");
			
		
			

		}else if((numeroUsuario - escolhaComputador) == -1 || (numeroUsuario - escolhaComputador) == 2) {
			System.out.println("Computador Vencendor");
		}else {
			System.out.println("Jogada Invalida");
		}

	}
}
