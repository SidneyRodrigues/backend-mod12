package br.com.smorais.exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNomes {

    public static void main(String[] args) {

        nomesOrdemAscendente();
    }

    private static void nomesOrdemAscendente() {
        List<String> list = new ArrayList<>();
        list.add("Miguel");
        list.add("Davi");
        list.add("Pedro");
        list.add("Henrique");
        list.add("Ana Clara");
        list.add("Lara");
        list.add("Lucca");
        list.add("Maria Fernanda");
        list.add("Vinicius");
        Collections.sort(list);

        System.out.println(list);
    }
}
