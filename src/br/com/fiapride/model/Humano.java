package br.com.fiapride.model;

public class Humano {   
    public String faculdade;
    public int idade;
    public String sexo;
    

	public Humano(String faculdade, int idade, String sexo) {
	    this.faculdade = faculdade;
	    this.idade = idade; // Novo Atributo
	    this.sexo = sexo;
	}
	
	public void catracaFiap(String faculdade) {
	    if (faculdade == "FIAP") {
	        System.out.println("Acesso autorizado.");
	        return;
	    } else {
	    	System.out.println("Acesso negado");
	    } 
	}

	public void fezAniversario(int idade) {
		this.idade += 1;
		System.out.println("O usuário fez aniversário, agora a idade dele é " + this.idade);
	}
}