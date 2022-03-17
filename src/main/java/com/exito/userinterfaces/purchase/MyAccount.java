package com.exito.userinterfaces.purchase;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyAccount extends PageObject {

    public static final Target BOTON_CUENTA = Target.
            the("Mi cuenta")
            .located(By.xpath("//span[contains(text(), 'Mi cuenta')]"));

    public static final Target EMAIL_CONTRASENNA = Target.
            the("Boton email y contrasenna")
            .located(By.xpath("//span[contains(text(), 'Ingresa con email y contraseña')]"));

    public static final Target CAMPO_EMAIL = Target.
            the("Campo del email")
            .located(By.xpath("//input[@placeholder='Ingresa tu email']"));

    public static final Target CAMPO_CONTRASENNA = Target.
            the("Campo del contrasenna")
            .located(By.xpath("//input[@type='password']"));

    public static final Target BOTON_ENTRAR = Target.
            the("Boton entrar")
            .located(By.xpath("//span[contains(text(), 'Entrar')]"));

}
