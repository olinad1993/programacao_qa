package robos; // Pacote Robos

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaiaRobo { // Classe

    public ChromeDriver julioDriver; // Propriedade criada, possibilitando usar em todos os metodos

    public void abrirChrome() {
        WebDriverManager.chromedriver().setup();
        julioDriver = new ChromeDriver();

    }

    public void acessarSite(){

        julioDriver.get("http://www.juliodelima.com.br/taskit");

    }

    public void fazerLogin() { // Metodos

    }

    public void lancarNota() {
        System.out.println("Gaia: Vou lançar nota!");

    }
}
