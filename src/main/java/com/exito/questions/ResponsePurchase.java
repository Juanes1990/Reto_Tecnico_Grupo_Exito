package com.exito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.exito.userinterfaces.purchase.Validation.TITULO;

public class ResponsePurchase implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return (TITULO.resolveFor(actor).containsOnlyText("Finalizar la compra"));
    }

    public static ResponsePurchase responsePurchase(){
        return new ResponsePurchase();
    }
}
