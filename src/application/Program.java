package application;

import java.util.Scanner;

import model.entities.Elevador;

public class Program {


	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			int capacidadeTotal = 8;
			int todosOsAndares = 10;
					
			Elevador elevador = new Elevador (8,0,0,10);
			elevador.inicializar(capacidadeTotal, todosOsAndares);
			System.out.println("=== ESCOLHA A A��O DO ELEVADOR ===");
			
			boolean stop = false;
			while (stop == false) {
				System.out.println("PRESSIONE 1 PARA SUBIR\nPRESSIONE 2 PARA DESCER\nPRESSIONE 3 PARA ENTRADA DE UMA PESSOA\n"
						+ "PRESSIONE 4 PARA SA�DA DE UMA PESSOA.");
				int n = sc.nextInt();
				if (n == 1) {
					elevador.subir(elevador.getAndarAtual());
					System.out.println("Pronto? S/N ");
					String r = sc.next().toLowerCase();
					stop = pronto(r.charAt(0));
				}
				else if (n == 2) {
					elevador.descer(elevador.getAndarAtual());
					System.out.println("Pronto? S/N ");
					String r = sc.next().toLowerCase();
					stop = pronto(r.charAt(0));
				}
				else if (n == 3) {
					elevador.entrar(elevador.getPessoasDentro());
					System.out.println("Pronto? S/N ");
					String r = sc.next().toLowerCase();
					stop = pronto(r.charAt(0));
				}
				else if (n == 4) {
					elevador.sair(elevador.getPessoasDentro());
					System.out.println("Pronto? S/N ");
					String r = sc.next().toLowerCase();
					stop = pronto(r.charAt(0));
				}
				else {
					System.out.println("Digite uma op��o v�lida aqui.");
				}
			}
			System.out.println("Valeu a� por n�o usar as escadas do pr�dio.");
		}
		catch (Exception e) {
			System.out.println("D� um saque onde c� errou..." + e.getMessage());
		}
		
		
		
	}

	public static boolean pronto(char c) {
		if (c == 's') {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
