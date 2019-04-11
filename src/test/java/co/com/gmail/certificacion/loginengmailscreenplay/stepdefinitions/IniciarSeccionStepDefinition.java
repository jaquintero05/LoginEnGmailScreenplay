package co.com.gmail.certificacion.loginengmailscreenplay.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.hotmail.certificacion.loginengmailscreenplay.models.Credenciales;
import com.hotmail.certificacion.loginengmailscreenplay.tasks.IniciarSesion;
import com.hotmail.certificacion.loginengmailscreenplay.userinterface.HotmailHomePage;


import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class IniciarSeccionStepDefinition {
	HotmailHomePage hotmaillHomePage;

	public  static final int USUARIO_EN= 0;
	@Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor juan; 
	
    @Before
    public void actorCanBrowseTheWeb() {
    	juan = Actor.named("Juan");
    	juan.can(BrowseTheWeb.with(hisBrowser));
   }

@Given("^juan puede entrar a la pagina inicial de hotmail$")
public void juanPuedeEntrarALaPaginaInicialDeHotmail() {
	juan.wasAbleTo(Open.browserOn(hotmaillHomePage));
	
}

@When("^el ingresa credencial$")
public void elIngresaCredencial(List<Credenciales> credenciales) {
	juan.attemptsTo(IniciarSesion.conLasCredenciales(credenciales.get(USUARIO_EN)));
	
}

@Then("^el validad si se inicio seccion corretamente$")
public void elValidadSiSeInicioSeccionCorretamente() throws Exception {
    // Write code here that turns the phrase above into concrete actions

}


}
