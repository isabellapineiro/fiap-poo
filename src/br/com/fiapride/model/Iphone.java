package br.com.fiapride.model;

public class Iphone extends Smartphone {

    private boolean temFaceID;

    public Iphone(String marca, int bateria, boolean temFaceID) {
        super(marca, bateria);
        this.temFaceID = temFaceID;
    }

    public boolean isTemFaceID() {
        return temFaceID;
    }

    public void usarAirDrop() {
        System.out.println("Usando AirDrop...");
    }
    @Override
    public void carregar(int carga) {
        System.out.println("Carregamento otimizado Apple...");
        super.carregar(carga);
    }
    @Override
    public double calcularSeguro() {
        // iPhone mais caro
        return 100.0 * 0.25;
    }
}