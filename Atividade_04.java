import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner Salario = new Scanner(System.in);
        int[] contadores = new int[9];
        
        System.out.println("Digite a quantidade de vendedores:");
        int quantidade = Salario.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite as vendas brutas do vendedor " + (i + 1) + ": ");
            double vendas = Salario.nextDouble();

            double salario = 200 + (0.09 * vendas);

            for (int j = 0; j < contadores.length; j++) {
                if ((j == 0 && salario >= 200 && salario <= 299) ||
                    (j == 1 && salario >= 300 && salario <= 399) ||
                    (j == 2 && salario >= 400 && salario <= 499) ||
                    (j == 3 && salario >= 500 && salario <= 599) ||
                    (j == 4 && salario >= 600 && salario <= 699) ||
                    (j == 5 && salario >= 700 && salario <= 799) ||
                    (j == 6 && salario >= 800 && salario <= 899) ||
                    (j == 7 && salario >= 900 && salario <= 999) ||
                    (j == 8 && salario >= 1000)) {
                    contadores[j]++;
                    break;
                }
            }
        }

        Salario.close();

        System.out.println("\nDistribuição dos salários:");
        String[] faixas = {
            "$200 - $299", "$300 - $399", "$400 - $499",
            "$500 - $599", "$600 - $699", "$700 - $799",
            "$800 - $899", "$900 - $999", "$1000 em diante"
        };

        for (int i = 0; i < contadores.length; i++) {
            System.out.println(faixas[i] + ": " + contadores[i]);
        }

        System.out.println("\nPrograma encerrado. Obrigado por utilizar!");
    }
}