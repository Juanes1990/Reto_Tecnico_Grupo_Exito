package com.exito.userinterfaces.purchase;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    public static final Target CATEGORIAS = Target.
            the("todas las categorias")
            .located(By.xpath("//p[contains(text(), 'Todas las categorías')]"));
    public static final Target MERCADO = Target.
            the("mercado")
            .located(By.id("mercado"));

    public static final Target CAMPO_BUSQUEDA = Target.
            the("campo de busqueda")
            .located(By.id("downshift-0-input"));

    public static final Target BOTON_BUSCAR = Target.
            the("boton buscar")
            .located(By.xpath("//div[@class='vtex-store-components-3-x-suffixWrapper flex h-100']"));


    public static final Target CAMPO_CIUDAD = Target.
            the("campo de ciudad")
            .located(By.xpath("//input[@autocapitalize='none']"));

    public static final Target BOTON_CONFIRMAR = Target.
            the("boton confirmar")
            .located(By.xpath("//button[@class='exito-geolocation-3-x-primaryButton shippingaddress-confirmar']"));
}
