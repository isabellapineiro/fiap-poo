package br.com.fiapride.model;

// Aula 9: Android herda Smartphone que implementa Carregavel
public class Android extends Smartphone {

    private String versaoAndroid;

    public Android(String marca, int bateria, String versaoAndroid) {
        super(marca, bateria);
        this.versaoAndroid = versaoAndroid;
    }

    public String getVersaoAndroid() {
        return versaoAndroid;
    }

    public void instalarAPK() {
        System.out.println("Instalando APK...");
    }

    // Aula 8: implementação obrigatória do método abstrato da classe mãe
    @Override
    public double calcularSeguro() {
        // Android mais barato
        return 100.0 * 0.15;
    }
}
