package br.com.fiapride.model;

// Aula 9: Iphone herda Smartphone que implementa Carregavel
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

    // Aula 9: implementação do método da interface (via Smartphone) com comportamento específico
    @Override
    public void carregar(int carga) {
        System.out.println("Carregamento otimizado Apple...");
        super.carregar(carga);
    }

    // Aula 8: implementação obrigatória do método abstrato da classe mãe
    @Override
    public double calcularSeguro() {
        // iPhone mais caro
        return 100.0 * 0.25;
    }
}
