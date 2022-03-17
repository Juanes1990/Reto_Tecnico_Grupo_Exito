package com.exito.tasks;

import com.exito.userinterfaces.PageInit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPageInit implements Task {

    private PageInit pageInit;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(pageInit)
        );
    }
    public static OpenPageInit openPageInit(){
        return new OpenPageInit();
    }
}
