package robos; // Pacote Robos

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaiaRobo { // Classe

    public void abrirChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver julioDriver = new ChromeDriver();

        julioDriver.get("http://www.juliodelima.com.br/taskit");
    }

    public void fazerLogin() { // Metodos

    }

    public void lancarNota() {
        System.out.println("Gaia: Vou lançar nota!");

    }
}
