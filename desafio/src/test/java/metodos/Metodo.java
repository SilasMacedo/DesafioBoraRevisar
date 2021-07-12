package metodos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodo {

	WebDriver driver;

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(site);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void digitar (String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void clicar (By elemento) {
		driver.findElement(elemento).click();
		
	}


}



