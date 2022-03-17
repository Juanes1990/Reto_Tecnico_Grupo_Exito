package com.exito.tasks.purchase;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.exito.userinterfaces.purchase.MyAccount.*;

public class LogIn implements Task {
    private String correo;
    private String contrasenna;

    public LogIn withEmail(String correo) {
        this.correo = correo;
        return this;
    }

    public LogIn andPassword(String contrasenna) {
        this.contrasenna = contrasenna;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CUENTA),
                Click.on(EMAIL_CONTRASENNA),
                Click.on(CAMPO_EMAIL),
                Enter.theValue(correo).into(CAMPO_EMAIL),
                Click.on(CAMPO_CONTRASENNA),
                Enter.theValue(contrasenna).into(CAMPO_CONTRASENNA),
                Scroll.to(BOTON_ENTRAR),
                Click.on(BOTON_ENTRAR)

        );
    }

    public static LogIn logIn() {
        return new LogIn();
    }
}
