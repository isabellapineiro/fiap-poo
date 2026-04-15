package br.com.fiapride.model;

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
    @Override
    public double calcularSeguro() {
        // Android mais barato
        return 100.0 * 0.15;
    }
}
