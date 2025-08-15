package atividadesDeRevisao;

import java.util.Random;
import java.util.Scanner;

public class atividade07 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    int tentativa = 0;
    int resultado;

    System.out.println("🎲 Vamos rolar o dado até sair 6!");
    System.out.println("Pressione ENTER para jogar...\n");

    do {
        scanner.nextLine(); 
        resultado = rand.nextInt(6) + 1; 
        tentativa++;
        System.out.println("Tentativa " + tentativa + ": saiu " + resultado);
    } while (resultado != 6);

    System.out.println("\n✅ Saiu 6! Foram necessárias " + tentativa + " tentativas.");
    scanner.close();
}
}
