package co.com.gmail.certificacion.loginengmailscreenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
															
@CucumberOptions( features= { "src/test/resources/features/IniciarSeccion.feature"},
        glue = { "co.com.gmail.certificacion.loginengmailscreenplay.stepdefinitions" },
        snippets =  SnippetType.CAMELCASE
        
       	
        )  

public class InciarSeccionRunners {

}
