package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.modelo.Campo;
import br.com.cod3r.cm.modelo.CampoEvento;
import br.com.cod3r.cm.modelo.CampoObservador;

import javax.swing.*;

public class BotaoCampo extends JButton implements CampoObservador {

    public BotaoCampo(Campo campo) {

    }

    @Override
    public void eventoOcorreu(Campo campo, CampoEvento evento) {
        switch (evento) {
            case ABRIR: {
                aplicarEstiloAbrir();
                break;
            }
            case MARCAR: {
                aplicarEstiloMarcar();
                break;
            }
            case EXPLODIR: {
                aplicarEstiloExplodir();
                break;
            }
            default:
                aplicarEstiloPadrao();
        }
    }

    private void aplicarEstiloPadrao() {
    }

    private void aplicarEstiloExplodir() {
    }

    private void aplicarEstiloMarcar() {
    }

    private void aplicarEstiloAbrir() {
    }
}
