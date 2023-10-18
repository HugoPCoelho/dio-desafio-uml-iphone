package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Safari safari = new Safari();
        ITunes iTunes = new ITunes();
        Telefone telefone = new Telefone();

        System.out.println("Digite o número para selecionar a interface: ");
        System.out.println("1 - Safari." + "\n2 - ITunes." + "\n3 - Telefone.");
        int opcoes = scanner.nextInt();

        switch (opcoes) {
            case 1:
                System.out.println("Bem vindo(a) ao Safari! O que deseja fazer: ");
                System.out.println("1 - Exibir página." + "\n2 - Abrir nova aba." + "\n3 - Atualizar a página.");
                int acao = scanner.nextInt();
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
                break;

            case 2:
                System.out.println("Bem vindo(a) ao ITunes! O que deseja fazer: ");
                System.out.println("1 - Tocar música." + "\n2 - Pausar música." + "\n3 - Selecionar Música.");
                int acaoM = scanner.nextInt();
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
                break;

            case 3:
                System.out.println("Bem vindo(a) ao Telefone! O que deseja fazer: ");
                System.out.println("1 - Fazer ligação." + "\n2 - Atender Chamada." + "\n3 - Iniciar o correio de voz.");
                int acaoT = scanner.nextInt();
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
                break;

            default:
                System.out.println("Escolha uma opção!");

        }
    }
}
