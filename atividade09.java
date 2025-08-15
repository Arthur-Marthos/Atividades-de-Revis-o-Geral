package atividadesDeRevisao;

import java.util.Random;
import java.util.Scanner;

public class atividade09 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int vida1 = 100;
    int vida2 = 100;
    int rodada = 1;

    System.out.println("🏆 Torneio de Luta Aleatório!");
    System.out.println("Você controla o Personagem 1. Aperte ENTER para atacar.\n");

    while (vida1 > 0 && vida2 > 0) {
        System.out.print("Rodada " + rodada + " - Pressione ENTER para atacar...");
        scanner.nextLine();

        int golpe1 = random.nextInt(21) + 5; // 5 a 25
        int golpe2 = random.nextInt(21) + 5; // 5 a 25

        vida2 -= golpe1;
        vida1 -= golpe2;

        if (vida1 < 0) vida1 = 0;
        if (vida2 < 0) vida2 = 0;

        System.out.println("Você causou " + golpe1 + " de dano. Vida do inimigo: " + vida2);
        System.out.println("O inimigo causou " + golpe2 + " de dano. Sua vida: " + vida1 + "\n");

        rodada++;
    }

    if (vida1 > 0) {
        System.out.println("🎉 Você venceu a luta!");
    } else if (vida2 > 0) {
        System.out.println("💀 Você perdeu! O inimigo venceu.");
    } else {
        System.out.println("🤝 Empate! Ambos caíram ao mesmo tempo!");
    }

    scanner.close();
}
}
