package com.exito.tasks.purchase;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.exito.userinterfaces.purchase.ListOption.*;

public class Checkout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CARRITO),
                Click.on(IR_PAGAR)

        );
    }

    public static Checkout checkout() {
        return new Checkout();
    }
}
