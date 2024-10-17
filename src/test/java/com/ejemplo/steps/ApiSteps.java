package com.ejemplo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class ApiSteps {

    private Response response;

    @Given("el endpoint está disponible")
    public void elEndpointEstaDisponible() {
        RestAssured.baseURI = "https://www.mercadolibre.com.ar/menu/departments";
    }

    @When("hago una petición GET")
    public void hagoUnaPeticionGET() {
        response = given().when().get();
    }

    @Then("el código de respuesta debe ser {int}")
    public void elCodigoDeRespuestaDebeSer(int statusCode) {
        response.then().statusCode(statusCode);
    }
}
