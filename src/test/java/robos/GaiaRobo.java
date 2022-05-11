package robos; // Pacote Robos

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaiaRobo { // Classe

    public ChromeDriver julioDriver; // Propriedade criada, possibilitando usar em todos os metodos
    public GaiaRobo(){ // Construtor
        // o que estiver aqui será executado no new
        WebDriverManager.chromedriver().setup();
        julioDriver = new ChromeDriver();


    }

    public void acessarSiteChamado(String urlsite){ // Trabalhando com parametros
        julioDriver.get(urlsite);

    }

    public void fazerLogin() { // Metodos

    }

    public void lancarNota() {
        System.out.println("Gaia: Vou lançar nota!");

    }
}
