package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class Temp {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(3, 3, 9);
        tabuleiro.alterarMarcacao(0, 0);
        tabuleiro.alterarMarcacao(0, 1);
        tabuleiro.alterarMarcacao(0, 2);
        tabuleiro.alterarMarcacao(1, 0);
        tabuleiro.alterarMarcacao(1, 1);
        tabuleiro.alterarMarcacao(1, 2);
        tabuleiro.alterarMarcacao(2, 0);
        tabuleiro.alterarMarcacao(2, 1);
        tabuleiro.alterarMarcacao(2, 2);
    }
}
