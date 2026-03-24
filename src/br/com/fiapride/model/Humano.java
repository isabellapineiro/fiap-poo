package br.com.fiapride.model;

public class Humano {

    private Smartphone smartphone;
    private String faculdade;
    private int idade;
    private String sexo;

    public Humano(String faculdade, int idade, String sexo, Smartphone smartphone) {
        this.setFaculdade(faculdade);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setSmartphone(smartphone);
    }

    // Getters
    public Smartphone getSmartphone() {
        return smartphone;
    }

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

    public void setSmartphone(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    // regra: idade não pode ser negativa
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
}
