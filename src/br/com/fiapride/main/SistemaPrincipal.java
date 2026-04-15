package br.com.fiapride.main;

import br.com.fiapride.model.Humano;
import br.com.fiapride.model.Android;
import br.com.fiapride.model.Iphone;

public class SistemaPrincipal {

	public static void main(String[] args) {

		Iphone celularIsabella = new Iphone("Apple", 80, true);
		Android celularMatheus = new Android("Samsung", 60, "Android 14");

		Humano Isabella = new Humano("FIAP", 20, "Feminino", celularIsabella);
		Isabella.catracaFiap();

		Humano Matheus = new Humano("UniNassau", 26, "Masculino", celularMatheus);
		Matheus.catracaFiap();

		System.out.println("Minha faculdade (Isabella) é: " + Isabella.getFaculdade());
		System.out.println("A do Matheus é: " + Matheus.getFaculdade());

		System.out.println("Eu nasci em: " + (2025 - Isabella.getIdade()) +
				" Ele nasceu em: " + (2025 - Matheus.getIdade()));

		Isabella.fezAniversario();
		Matheus.fezAniversario();

		System.out.println("Celular da Isabella: " + Isabella.getSmartphone().getMarca());
		System.out.println("Bateria: " + Isabella.getSmartphone().getBateria() + "%");

		System.out.println("Versão Android: " + celularMatheus.getVersaoAndroid());
		celularMatheus.instalarAPK();

		System.out.println("Tem FaceID? " + celularIsabella.isTemFaceID());
		celularIsabella.usarAirDrop();
	}
}
