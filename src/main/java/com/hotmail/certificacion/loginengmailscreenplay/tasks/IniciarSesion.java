package com.hotmail.certificacion.loginengmailscreenplay.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import static com.hotmail.certificacion.loginengmailscreenplay.userinterface.HotmailHomePage.*;

import org.openqa.selenium.Keys;

import com.hotmail.certificacion.loginengmailscreenplay.models.Credenciales;

public class IniciarSesion implements Task {

	private String usuario;
	private String contraseña;

	public IniciarSesion(String usuario, String contraseña) {

		this.contraseña = contraseña;
		this.usuario = usuario;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(

				Enter.theValue(usuario).into(BARRA_USUARIO).thenHit(Keys.ENTER),
				Enter.theValue(contraseña).into(BARRA_CONTRASEÑA)

		);

	}

	public static IniciarSesion conLasCredenciales(Credenciales credenciales) {
		return Tasks.instrumented(IniciarSesion.class, credenciales.getUser(), credenciales.getPassword());

	}

}
