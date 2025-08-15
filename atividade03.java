package atividadesDeRevisao;

import java.util.Scanner;

public class atividade03 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Você é legal?");
	String resposta = scanner.nextLine().toLowerCase();
	
	if(resposta.equals("sim")) {
		System.out.println("Você merece um bombom 🍫");
	} else {
		System.out.println("Todo mundo tem seus dias 😊");
	}
	scanner.close();
}
}
