package br.com.fiapride.model;

public class Smartphone {

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

    public void carregar(int carga) {
        if (carga > 0 && bateria + carga <= 100) {
            this.bateria += carga;
        } else {
            System.out.println("Carga inválida ou bateria já cheia.");
        }
    }

    public double calcularSeguro() {
        // valor genérico
        return 100.0;
    }
}
