package com.exito.tasks.purchase;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.exito.userinterfaces.purchase.ListOption.*;

public class RepeatAdd implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_AGREGAR_ALTERNATIVO)
        );
    }

    public static RepeatAdd repeatAdd(){
        return new RepeatAdd();
    }
}
