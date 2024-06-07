package br.com.smorais.exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Lista para armazenar nomes masculinos e femininos
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        System.out.println("Digite nomes e gêneros (nome-sexo), separados por vírgula: ");
        System.out.println("Exemplo: Bruno-M, Sarah-F, Antônio-M");

        String input = s.nextLine();

        String[] entradas = input.split(",");

        for (String entrada : entradas) {
            entrada = entrada.trim();

            String[] partes = entrada.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String genero = partes[1].trim().toUpperCase();

                if (genero.equals("M")){
                    masculino.add(nome);
                } else if (genero.equals("F")) {
                    feminino.add(nome);
                } else {
                    System.out.println("Gênero inválido para " + nome);
                }
            } else {
                System.out.println("Entrada inválida: " + entrada);
            }
        }

        System.out.println("\nNomes Masculinos:");
        for (String nome : masculino) {
            System.out.println(nome);
        }
        System.out.println("\nNomes Femininos:");
        for (String nome : feminino) {
            System.out.println(nome);
        }
        s.close();
    }
}
