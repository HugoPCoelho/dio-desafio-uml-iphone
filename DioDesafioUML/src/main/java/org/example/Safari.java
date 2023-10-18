package org.example;

public class Safari implements NavegadorInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página!");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página!");
    }
}
