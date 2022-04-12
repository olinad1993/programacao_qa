package executores;

import robos.GaiaRobo;
import robos.JonasRobo;

public class Executora {
    public static void main(String[] args) {

        GaiaRobo umaGaiarobo = new GaiaRobo(); // Criando uma variavel
        JonasRobo umJonasrobo = new JonasRobo();

        umaGaiarobo.abrirChrome();
        umaGaiarobo.fazerLogin();
        umaGaiarobo.lancarNota();
        umJonasrobo.extrairRelatorio();

    }
}

