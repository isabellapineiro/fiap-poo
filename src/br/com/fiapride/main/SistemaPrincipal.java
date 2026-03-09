package br.com.fiapride.main;

import br.com.fiapride.model.Humano;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Humano Isabella = new Humano("FIAP", 20, "Feminino");
		Isabella.catracaFiap();
		
		Humano Matheus = new Humano(null, 0, null);
		Matheus.faculdade = "UniNassau";
		Matheus.idade = 26;
		
		System.out.println("Minha faculdade (Isabella) é: " + Isabella.faculdade);
		System.out.println("A do Matheus é: " + Matheus.faculdade);
		System.out.println("Eu nasci em: " + (2025 - Isabella.idade) + " Ele nasceu em: " + (2025 - Matheus.idade));
	}
}
