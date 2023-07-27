package br.ce.mariana.core;

import org.junit.BeforeClass;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;

public class BaseTest implements Constantes {
    @BeforeClass
    public static void setup(){
       baseURI = APP_BASE_URL;
       enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
