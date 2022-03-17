package com.exito.tasks.purchase;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.exito.userinterfaces.purchase.ListOption.*;

public class OrderProduct implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ORDENAR_POR),
                Click.on(PRECIO_BAJO)
        );

    }

    public static OrderProduct orderProduct() {
        return new OrderProduct();
    }
}
