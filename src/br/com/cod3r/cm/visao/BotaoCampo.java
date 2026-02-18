package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.modelo.Campo;
import br.com.cod3r.cm.modelo.CampoEvento;
import br.com.cod3r.cm.modelo.CampoObservador;

import javax.swing.*;
import java.awt.*;

public class BotaoCampo extends JButton implements CampoObservador {

    private final Color BG_PADRAO = new Color(184,184,184);
    private final Color BG_PADRAO = new Color(184,184,184);
    private final Color BG_PADRAO = new Color(184,184,184);
    private final Color BG_PADRAO = new Color(184,184,184);

    private Campo campo;

    public BotaoCampo(Campo campo) {
        this.campo = campo;
        setBackground();
        campo.registrarObservador(this);
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
