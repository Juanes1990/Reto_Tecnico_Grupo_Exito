package com.exito.stepdefinition.purchase;

import com.exito.models.Customer;
import com.exito.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import static com.exito.questions.ResponsePurchase.responsePurchase;
import static com.exito.tasks.OpenPageInit.openPageInit;
import static com.exito.tasks.purchase.AddCart.addCart;
import static com.exito.tasks.purchase.Checkout.checkout;
import static com.exito.tasks.purchase.LogIn.logIn;
import static com.exito.tasks.purchase.BrowseToProduct.browsetoProduct;
import static com.exito.tasks.purchase.OrderProduct.orderProduct;
import static com.exito.tasks.purchase.RepeatAdd.repeatAdd;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class StepDefinition extends Setup {
    private Customer customer;
    private static final String ACTOR_NAME = "Juanes";
    public static Logger LOGGER = Logger.getLogger(StepDefinition.class);


    @Given("el cliente se encuentra en la página de inicio")
    public void elClienteSeEncuentraEnLaPaginaDeInicio() {
        try {
            fillCustomer();
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().wasAbleTo(
                    openPageInit()
            );
            LOGGER.info("Cargó la página del exito");
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            Assertions.fail("");
        }

    }

    @When("el cliente ingresa a su cuenta con email y contrasenna")
    public void elClienteIngresaASuCuentaConEmailYContrasenna() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    logIn()
                            .withEmail(customer.getEmail())
                            .andPassword(customer.getPassword())
            );
            LOGGER.info("inicio de sesión exitoso");

        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            Assertions.fail("ERROR EN INICIO DE SESION");
        }

    }

    @When("el cliente selecciona sus productos y finaliza su compra")
    public void elClienteSeleccionaSusProductosYFinalizaSuCompra() {
        try {
            waitTime(2000);
            theActorInTheSpotlight().attemptsTo(
                    browsetoProduct()
                            .withProduct("lechuga")
                            .andCity("medellin")
            );
            LOGGER.info("Busqueda correcta del producto");
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            Assertions.fail("ERROR EN LA BUSQUEDA");
        }
        try {
            waitTime(6000);
            theActorInTheSpotlight().attemptsTo(
                    orderProduct()
            );
            LOGGER.info("Se ordenan los productos por precio");
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            Assertions.fail("ERROR AL ORDENAR EL PRODUCTO");
        }
        try {
            waitTime(6000);
            theActorInTheSpotlight().attemptsTo(
                    addCart()
            );

            LOGGER.info("Agregar al carro primera vez");
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            Assertions.fail("ERROR EN LA SELECCION DEL PRODUCTO");
        }
        try {
            waitTime(3000);
            theActorInTheSpotlight().attemptsTo(
                    repeatAdd()
            );
            LOGGER.info("Agregar al carro segunda vez");

        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            Assertions.fail("ERROR EN LA SELECCION DEL PRODUCTO");
        }
        try {
            waitTime(5000);
            theActorInTheSpotlight().attemptsTo(
                    checkout()
            );
            LOGGER.info("Finalizó la compra");
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            Assertions.fail("ERROR EN LA FINALIZACION DE LA COMPRA");
        }

    }

    @Then("la página debera mostrar el resumen de la compra")
    public void laPaginaDeberaMostrarElResumenDeLaCompra() {
        try {
            theActorInTheSpotlight().should(seeThat(
                            responsePurchase(), equalTo(true)
                    )

            );
            LOGGER.info("Validación Exitosa");
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            Assertions.fail("ERROR EN LA VALIDACION");
        }

    }

    public void fillCustomer() {
        customer = new Customer();
        customer.setEmail("juan.pineda@sofka.com.co");
        customer.setPassword("Acceso12");
    }

}
