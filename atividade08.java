package atividadesDeRevisao;

import java.util.Scanner;

public class atividade08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bateria = 100;
		int minutos = 0;

		System.out.println("📱 Simulador de Bateria do TikTok");
		System.out.println("A cada ENTER, 1 minuto de uso será gasto (7% de bateria)\n");

		while (bateria > 0) {
			System.out.print("Pressione ENTER para simular 1 minuto...");
			scanner.nextLine();

			minutos++;
			bateria -= 7;
			System.out.println("Minuto " + minutos + " - Bateria: " + Math.max(bateria, 0) + "%\n");
		}

		System.out.println("⚡ A bateria acabou! Durou " + minutos + " minutos de TikTok.");
		scanner.close();
	}
}
