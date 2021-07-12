package elementos;

import org.openqa.selenium.By;

public class Elemento {
	
	private By nome = By.id("nome");
	private By 	email = By.id("email");
	private By texto = By.id("msg");
	private By enviar = By.className("button");
	
	
	public By getEnviar() {
		return enviar;

	}
	public By getNome() {
		return nome;
	}
	public By getEmail() {
		return email;
	}
	public By getTexto() {
		return texto;
	}

}
