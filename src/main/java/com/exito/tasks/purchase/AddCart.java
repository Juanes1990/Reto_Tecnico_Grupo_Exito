package com.exito.tasks.purchase;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.exito.userinterfaces.purchase.ListOption.*;

public class AddCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_AGREGAR),
                Click.on(ENVIO_DOMICILIO),
                Click.on(CONFIRMAR_DIRECCION)
        );
    }

    public static AddCart addCart(){
        return new AddCart();
    }
}
