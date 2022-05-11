package executores;

import robos.GaiaRobo;
import robos.JonasRobo;

public class Executora {
    public static void main(String[] args) {

        GaiaRobo umaGaiarobo = new GaiaRobo(); // Criando uma variavel


        umaGaiarobo.acessarSiteChamado("http://www.juliodelima.com.br/taskit");
        umaGaiarobo.fazerLogin();
        umaGaiarobo.lancarNota();

        GaiaRobo umaOutraGaiaRobo = new GaiaRobo();
        umaOutraGaiaRobo.acessarSiteChamado("http://www.dnasistemas.com");

    }
}

