package com.exito.userinterfaces.purchase;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Validation extends PageObject {

    public static final Target TITULO= Target.
            the("finalizar compra")
            .located(By.id("orderform-title"));
}
