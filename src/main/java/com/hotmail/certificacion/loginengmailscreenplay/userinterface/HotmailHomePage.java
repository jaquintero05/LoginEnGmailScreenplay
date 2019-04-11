package com.hotmail.certificacion.loginengmailscreenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1555017483&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fRpsCsrfState%3de3798f2f-f98a-d50f-e82e-98532bddac65&id=292841&aadredir=1&whr=hotmail.com&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015")
public class HotmailHomePage  extends PageObject{
	
	public static final Target BARRA_USUARIO = Target.the("barra de busqueda").
			locatedBy("//input[@placeholder='Email, phone, or Skype']");	
	
	public static final Target BOTON_NEXT = Target.the("bonton continiar").
			locatedBy("//input[@value='Next']");
		
	
	public static final Target BARRA_CONTRASEÑA = Target.the("barra de busqueda").
			locatedBy("//input[@placeholder='Password']");
	
	public static final Target BOTON_REGIDTRO = Target.the("boton registrase").
			locatedBy("//input[@id='idSIButton9']");
	
			

}
