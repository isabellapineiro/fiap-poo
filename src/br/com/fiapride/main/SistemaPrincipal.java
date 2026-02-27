package br.com.fiapride.main;

import br.com.fiapride.model.Humano;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Humano Isabella = new Humano(null, 0, null);
		Isabella.faculdade = "FIAP";
		Isabella.idade = 20;
		Isabella.sexo = "Feminino";
		Isabella.catracaFiap(Isabella.faculdade);
		
		Humano Matheus = new Humano(null, 0, null);
		Matheus.faculdade = "UniNassau";
		Matheus.idade = 26;
		Matheus.catracaFiap(Matheus.faculdade);
		
		System.out.println("Minha faculdade (Isabella) é: " + Isabella.faculdade);
		System.out.println("A do Matheus é: " + Matheus.faculdade);
		System.out.println("Eu nasci em: " + (2025 - Isabella.idade) + " Ele nasceu em: " + (2025 - Matheus.idade));
		
		Isabella.fezAniversario(Isabella.idade);
		Matheus.fezAniversario(Matheus.idade);
	}
}
