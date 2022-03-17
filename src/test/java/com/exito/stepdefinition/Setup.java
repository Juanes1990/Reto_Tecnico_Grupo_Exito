package com.exito.stepdefinition;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Setup {

    @Managed()
    protected WebDriver webDriver;

    public static Logger LOGGER = Logger.getLogger(Setup.class);

    private void setupUser(String name, WebDriver webDriver) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(name).can(BrowseTheWeb.with(webDriver));
    }

    protected void actorSetupTheBrowser(String name) {
        setupUser(name, webDriver);
    }

    protected void waitTime(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
            LOGGER.warn("Error durante el tiempo de espera");
        }
    }

}
