import java.util.Scanner;
import java.util.ArrayList;

public class atv2 {
    public static void main(String[] args) {
        Scanner crime = new Scanner(System.in);
        ArrayList<String> perguntas = new ArrayList<>();
        
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

                int respostasPositivas = 0;
        
        System.out.println("Responda com 'sim' ou 'não':");

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " ");
            String resposta = crime.next().trim().toLowerCase();
            
            if (resposta.equals("sim")) {
                respostasPositivas++; 
            }
        }

                String classificacao;
        if (respostasPositivas == 2) {
            classificacao = "Suspeita";
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            classificacao = "Cúmplice";
        } else if (respostasPositivas == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }

                System.out.println("\nClassificação: " + classificacao);
        crime.close();
    }
}