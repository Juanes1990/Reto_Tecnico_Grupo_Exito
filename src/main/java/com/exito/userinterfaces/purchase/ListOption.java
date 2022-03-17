package com.exito.userinterfaces.purchase;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ListOption extends PageObject {
    public static final Target ORDENAR_POR = Target.
            the("boton ordenar por")
            .located(By.xpath("//span[@class='vtex-search-result-3-x-filterPopupTitle c-on-base t-action--small ml-auto-ns']"));

    public static final Target PRECIO_BAJO = Target.
            the("Precio mas bajo")
            .located(By.xpath("//button[contains(text(), 'Menor precio primero')]"));

    public static final Target BOTON_AGREGAR = Target.
            the("boton agregar")
            .located(By.xpath("//div[@class='exito-vtex-components-4-x-blockBuyButton']"));


    public static final Target ENVIO_DOMICILIO = Target.
            the("Envio a domicilio")
            .located(By.xpath("//button[@class='exito-geolocation-3-x-orderOptionsButton  orderoption-envio-domicilio']"));

    public static final Target CONFIRMAR_DIRECCION = Target.
            the("confirmar direccion")
            .located(By.xpath("//button[@class='exito-geolocation-3-x-primaryButton addressbyuser-confirmar']"));

    public static final Target CARRITO = Target.
            the("carrito de compras")
            .located(By.xpath("//a[@class='exito-header-3-x-minicartButtonMobile exito-header-3-x-minicartButton']"));

    public static final Target IR_PAGAR = Target.
            the("ir a pagar")
            .located(By.id("cart-to-orderform"));

}
