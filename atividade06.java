package atividadesDeRevisao;


import java.util.Scanner;

public class atividade06 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    int pontos = 0;

    System.out.println("⚽ Bem-vindo ao Quiz de Futebol!");
    System.out.println("Responda com a alternativa (a, b, c)\n");

    System.out.println("\n -- PERGUNTA 1 --");
    System.out.println("1) Qual seleção venceu a Copa do Mundo de 2002?");
    System.out.println("a) Alemanha");
    System.out.println("b) Brasil");
    System.out.println("c) França");
    System.out.print("Resposta: ");
    String resp1 = scanner.nextLine().toLowerCase();
    if (resp1.equals("b")) {
        pontos++;
        System.out.println("✅ Correto!\n");
    } else {
        System.out.println("❌ Errado! Foi o Brasil.\n");
    }

    System.out.println("\n -- PERGUNTA 2 --");
    System.out.println("2) Qual jogador é conhecido como 'O Bruxo'?");
    System.out.println("a) Romário");
    System.out.println("b) Ronaldo Nazário");
    System.out.println("c) Ronaldinho Gaúcho");
    System.out.print("Resposta: ");
    String resp2 = scanner.nextLine().toLowerCase();
    if (resp2.equals("c")) {
        pontos++;
        System.out.println("✅ Correto!\n");
    } else {
        System.out.println("❌ Errado! É o Ronaldinho Gaúcho.\n");
    }

    System.out.println("\n -- PERGUNTA 3 --");
    System.out.println("3) Qual clube brasileiro tem mais títulos da Libertadores?");
    System.out.println("a) Corinthians");
    System.out.println("b) Botafogo");
    System.out.println("c) Fluminense");
    System.out.print("Resposta: ");
    String resp3 = scanner.nextLine().toLowerCase();
    if (resp3.equals("a")) {
        pontos++;
        System.out.println("✅ Correto!\n");
    } else {
        System.out.println("❌ Errado! É o Corinthians.\n");
    }

    
    System.out.println("🏆 Sua pontuação final foi: " + pontos + " de 3.");
    scanner.close();
}
}