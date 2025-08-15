package atividadesDeRevisao;

import java.util.Random;
import java.util.Scanner;
	
public class atividade04 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int totalDegraus = 20; 
    int posicaoRapunzel = random.nextInt(totalDegraus) + 1; 
    int posicaoJogador = 0;

    System.out.println("🏰 Subindo a escada para encontrar Rapunzel!");
    System.out.println("(Aperte ENTER para subir cada degrau)\n");

    while (posicaoJogador < totalDegraus) {
        scanner.nextLine(); 
        posicaoJogador++;

        System.out.println("Você está no degrau " + posicaoJogador);

        if (posicaoJogador == posicaoRapunzel) {
            System.out.println("\n💖 Você encontrou a Rapunzel no degrau " + posicaoRapunzel + "!");
            break;
        }
    }

    scanner.close();
}
}
