package atividadesDeRevisao;

import java.util.Scanner;

public class atividade05 {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Infome o total de XP do jogador: ");
	
	int xp = scanner.nextInt();
	
	if(xp <=100) {
		System.out.println("Nível: Noob");
	} else if (xp <=500) {
		System.out.println("Nível: Aprendiz");
	} else if (xp <=1000) {
		System.out.println("Nível: Pro");
	} else {
		System.out.println("Nível: Lendário");
	}
	scanner.close();
}
}
