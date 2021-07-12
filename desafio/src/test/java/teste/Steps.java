package teste;

import elementos.Elemento;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodo;

public class Steps {
	
	Metodo metodos = new Metodo();
	Elemento elementos =  new Elemento();
	
	
	
	@Given("que esteja no site {string}")
	public void que_esteja_no_site(String site) {
		metodos.abrirNavegador(site);
	 
	}

	@When("preencher os campos")
	public void preencher_os_campos() {
		metodos.digitar("Tina", elementos.getNome());
		metodos.digitar("tina@tina.com.br", elementos.getEmail());
		metodos.digitar("Aqui digito a msg", elementos.getTexto());
	  
		metodos.clicar(elementos.getEnviar());
	
	}

	@Then("validar msg")
	public void validar_msg() {
	    
	}

}
