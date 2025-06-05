import java.util.ArrayList;
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner TotalNotas = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double soma = 0;

        System.out.println("Digite as notas (digite -1 para encerrar):");
        while (true) {
            double nota = TotalNotas.nextDouble();
            if (nota == -1) break;
            notas.add(nota);
            soma += nota;
        }
        TotalNotas.close();

        int quantidade = notas.size();
        System.out.println("\nQuantidade de valores lidos: " + quantidade);

        System.out.println("Valores informados: " + notas);

        System.out.println("\nValores na ordem inversa:");
        for (int i = quantidade - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double media = soma / quantidade;
        System.out.printf("\nMédia das notas: %.2f%n", media);

        int acimaMedia = 0;
        int abaixoDeSete = 0;
        for (double nota : notas) {
            if (nota > media) acimaMedia++;
            if (nota < 7) abaixoDeSete++;
        }

        System.out.println("\nQuantidade de valores acima da média: " + acimaMedia);
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoDeSete);

        System.out.println("\nFim do programa. Obrigado por utilizar!");
    }
}