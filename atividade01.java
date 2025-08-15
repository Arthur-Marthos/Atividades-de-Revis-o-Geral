package atividadesDeRevisao;

import java.util.Random;
import java.util.Scanner;

public class atividade01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int vidaJogador = 100;
        int turno = 1;

        System.out.println("🛡️ Batalha contra o Dragão começou!");
        System.out.println("Sua vida inicial: 100\n");

        while (vidaJogador > 0) {
            System.out.println("Turno " + turno + " - Pressione ENTER para continuar...");
            scanner.nextLine();

            int dano = random.nextInt(16) + 5; 
            vidaJogador -= dano;

            if (vidaJogador < 0) {
                vidaJogador = 0;
            }

            System.out.println("🔥 O dragão atacou causando " + dano + " de dano!");
            System.out.println("❤️ Vida restante: " + vidaJogador + "\n");

            turno++;
        }

        System.out.println("💀 Você foi derrotado pelo dragão...");
        scanner.close();
	}
}
