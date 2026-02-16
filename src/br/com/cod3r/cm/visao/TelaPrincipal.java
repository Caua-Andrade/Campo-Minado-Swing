package br.com.cod3r.cm.visao;

import javax.swing.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        // métodos do JFrame
        setTitle("Campo Minado");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

        new TelaPrincipal();
    }
}
