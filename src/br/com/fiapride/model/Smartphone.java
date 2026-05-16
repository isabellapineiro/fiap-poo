package br.com.fiapride.model;

// Aula 8: classe mãe transformada em abstract class
public abstract class Smartphone implements Carregavel {

    private String marca;
    private int bateria; // %

    public Smartphone(String marca, int bateria) {
        this.marca = marca;

        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        } else {
            this.bateria = 100;
        }
    }

    public String getMarca() {
        return marca;
    }

    public int getBateria() {
        return bateria;
    }

    public void usarBateria(int consumo) {
        if (consumo > 0 && bateria - consumo >= 0) {
            this.bateria -= consumo;
        } else {
            System.out.println("Consumo inválido ou bateria insuficiente.");
        }
    }

    // Aula 9: implementação padrão do método da interface Carregavel
    @Override
    public void carregar(int carga) {
        if (carga > 0 && bateria + carga <= CARGA_MAXIMA) {
            this.bateria += carga;
        } else {
            System.out.println("Carga inválida ou bateria já cheia.");
        }
    }

    // Aula 8: método abstrato — implementação obrigatória nas classes filhas
    public abstract double calcularSeguro();
}
