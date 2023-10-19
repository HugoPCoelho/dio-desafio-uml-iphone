package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Safari safari = new Safari();
        ITunes iTunes = new ITunes();
        Telefone telefone = new Telefone();
        int opcoes;
        int acao;
        int acaoM;
        int acaoT;

        do {
            System.out.println("Digite o número para selecionar a interface: ");
            System.out.println("1 - Safari." + "\n2 - ITunes." + "\n3 - Telefone."  + "\n4 - Desligar.");
            opcoes = scanner.nextInt();

            switch (opcoes) {
                case 1:
                    do {
                        System.out.println("Bem vindo(a) ao Safari! O que deseja fazer: ");
                        System.out.println("1 - Exibir página." + "\n2 - Abrir nova aba." + "\n3 - Atualizar a página." + "\n4 - Retornar.");
                        acao = scanner.nextInt();
                        switch (acao) {
                            case 1:
                                safari.exibirPagina();
                                break;

                            case 2:
                                safari.abrirNovaAba();
                                break;

                            case 3:
                                safari.atualizarPagina();
                                break;

                            default:
                                System.out.println("Escolha uma opção!");
                        }
                    }while (acao < 4);
                    break;

                case 2:
                    do {
                        System.out.println("Bem vindo(a) ao ITunes! O que deseja fazer: ");
                        System.out.println("1 - Tocar música." + "\n2 - Pausar música." + "\n3 - Selecionar Música." + "\n4 - Retornar.");
                        acaoM = scanner.nextInt();
                        switch (acaoM) {
                            case 1:
                                iTunes.tocar();
                                break;

                            case 2:
                                iTunes.pausar();
                                break;

                            case 3:
                                iTunes.selecionarMusica();
                                break;

                            default:
                                System.out.println("Escolha uma opção!");
                        }
                    }while (acaoM < 4);
                    break;

                case 3:
                    do {
                        System.out.println("Bem vindo(a) ao Telefone! O que deseja fazer: ");
                        System.out.println("1 - Fazer ligação." + "\n2 - Atender Chamada." + "\n3 - Iniciar o correio de voz." + "\n4 - Retornar.");
                        acaoT = scanner.nextInt();
                        switch (acaoT) {
                            case 1:
                                telefone.ligar();
                                break;

                            case 2:
                                telefone.atender();
                                break;

                            case 3:
                                telefone.iniciarCorreioVoz();
                                break;

                            default:
                                System.out.println("Escolha uma opção!");
                        }
                    }while (acaoT < 4);
                    break;

                case 4:
                    System.out.println("Desligando!");
                    break;

                default:
                    System.out.println("Escolha uma opção!");

            }
        }while (opcoes < 4);
    }
}
