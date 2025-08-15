package atividadesDeRevisao;

import java.util.Scanner;

public class atividade02 {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	int placarRobo1 = 0;
	int placarRobo2 = 0;
	
	for(int i =1; i<=5; i++) {
		System.out.println("\nRodada " + i + ":");
		
		System.out.println("Força do Robô 1 (1 a 100");
		int forca1 = scanner.nextInt();
		System.out.println("Força do Robô 2 (2 a 100");
		int forca2 = scanner.nextInt();
		
		if(forca1 > forca2) {
			System.out.println("Robô 1 vence a rodada!");
			placarRobo1++;
		} else if (forca2 > forca1) {
			System.out.println("Robô 2 vence a rodada!");
			placarRobo2++;
		} else {
			System.out.println("Empate na rodada!");
		}
	}
	System.out.println("\n 🚩 Placar Final:");
	System.out.println("Robô 1: " + placarRobo1 + " vitórias");
	System.out.println("Robô 2: " + placarRobo2 + " vitórias");
	if(placarRobo1 > placarRobo2) {
		System.out.println("🥇 Robô 1 é o CAMPEÃO!");
	} else if (placarRobo2 > placarRobo1) {
		System.out.println("🥇 Robô 2 é o CAMPEÃO!");
	} else {
		System.out.println("⚔️ A batalha ficou empatada!");
	}
	scanner.close();
}
}
