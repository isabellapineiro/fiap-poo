package br.com.fiapride.model;

<<<<<<< HEAD
public class Humano {

    private String faculdade;
    private int idade;
    private String sexo;

    public Humano(String faculdade, int idade, String sexo) {
        this.faculdade = faculdade;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Getters

    public String getFaculdade() {
        return faculdade;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    // Setters

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    // REGRA: idade não pode ser negativa
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Erro: idade não pode ser negativa.");
        }
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void catracaFiap() {
        if ("FIAP".equals(faculdade)) {
            System.out.println("Acesso autorizado.");
        } else {
            System.out.println("Acesso negado");
        }
    }

    public void fezAniversario() {
        this.idade += 1;
        System.out.println("O usuário fez aniversário, agora a idade dele é " + this.idade);
    }
=======
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
>>>>>>> 6c356b6b841db86514900c29da4326df31cab974
}