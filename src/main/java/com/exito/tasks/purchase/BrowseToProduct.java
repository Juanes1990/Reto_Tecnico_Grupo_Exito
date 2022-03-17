package com.exito.tasks.purchase;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import static com.exito.userinterfaces.purchase.ProductPage.*;

public class BrowseToProduct implements Task {
    private String product;
    private String city;

    public BrowseToProduct withProduct(String product){
        this.product=product;
        return this;
    }

    public BrowseToProduct andCity(String city){
        this.city=city;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATEGORIAS),
                Click.on(MERCADO),
                Click.on(CAMPO_BUSQUEDA),
                Enter.theValue(product).into(CAMPO_BUSQUEDA),
                Click.on(BOTON_BUSCAR),
                Click.on(CAMPO_CIUDAD),
                Enter.theValue(city).into(CAMPO_CIUDAD),
                Hit.the(Keys.ENTER).into(CAMPO_CIUDAD),
                Click.on(BOTON_CONFIRMAR)
        );

    }

    public static BrowseToProduct browsetoProduct(){
        return new BrowseToProduct();
    }
}
