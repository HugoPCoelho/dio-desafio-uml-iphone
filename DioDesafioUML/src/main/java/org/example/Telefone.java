package org.example;

public class Telefone implements AparelhoTelefonico{

    @Override
    public void ligar() {
        System.out.println("Realizando ligação!");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado!");
    }
}
