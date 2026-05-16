package br.com.fiapride.model;

// Aula 9: interface criada com método abstrato e constantes
public interface Carregavel {

    // Constantes de interface (implicitamente public static final)
    int CARGA_MAXIMA = 100;
    int CARGA_MINIMA = 0;

    // Método abstrato — implementação obrigatória em quem implementar a interface
    void carregar(int carga);
}
