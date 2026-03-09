package br.com.fiapride.main;

import br.com.fiapride.model.Humano;

public class TesteHumano {

    public static void main(String[] args) {

        Humano isabella = new Humano("FIAP", 20, "Feminino");
        isabella.catracaFiap();

        Humano matheus = new Humano("UniNassau", 26, "Masculino");

        System.out.println("Faculdade da Isabella: " + isabella.getFaculdade());
        System.out.println("Faculdade do Matheus: " + matheus.getFaculdade());

        System.out.println("Isabella nasceu em: " + (2025 - isabella.getIdade()));
        System.out.println("Matheus nasceu em: " + (2025 - matheus.getIdade()));

        // Tentando burlar a regra
        System.out.println("\nTentando colocar idade negativa");
        matheus.setIdade(-5);

        System.out.println("Idade do Matheus depois da tentativa: " + matheus.getIdade());
    }
}