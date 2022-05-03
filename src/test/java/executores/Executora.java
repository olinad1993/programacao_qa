package executores;

import robos.GaiaRobo;
import robos.JonasRobo;

public class Executora {
    public static void main(String[] args) {

        GaiaRobo umaGaiarobo = new GaiaRobo(); // Criando uma variavel


        umaGaiarobo.acessarSite();
        umaGaiarobo.fazerLogin();
        umaGaiarobo.lancarNota();

        GaiaRobo umaOutraGaiaRobo = new GaiaRobo();
        umaOutraGaiaRobo.acessarSite();

    }
}

