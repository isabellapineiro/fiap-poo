package br.com.fiapride.main;

import br.com.fiapride.model.Humano;

public class SistemaPrincipal {

	public static void main(String[] args) {

		Humano Isabella = new Humano("FIAP", 20, "Feminino");
		Isabella.catracaFiap();

		Humano Matheus = new Humano("UniNassau", 26, "Masculino");
		Matheus.catracaFiap();

		System.out.println("Minha faculdade (Isabella) é: " + Isabella.getFaculdade());
		System.out.println("A do Matheus é: " + Matheus.getFaculdade());

		System.out.println("Eu nasci em: " + (2025 - Isabella.getIdade()) +
		" Ele nasceu em: " + (2025 - Matheus.getIdade()));

		Isabella.fezAniversario(Isabella.getIdade());
		Matheus.fezAniversario(Matheus.getIdade());
	}
}
