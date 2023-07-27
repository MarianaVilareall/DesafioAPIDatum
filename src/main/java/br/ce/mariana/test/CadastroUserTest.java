package br.ce.mariana.test;

import br.ce.mariana.core.BaseTest;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class CadastroUserTest extends BaseTest {

    @Test
    public void cadastrarUsuario(){
        given()
                .body("{\n" +
                        "    \"name\": \"mariana\",\n" +
                        "    \"job\": \"qa\"\n" +
                        "}")
        .when()
                .post("/users")
        .then()
                .statusCode(201)
        ;
    }
    @Test
    public void deveValidarSeOResponseEstaNoFormatoJSON(){
        given()
                .body("{\n" +
                        "    \"name\": \"mariana\",\n" +
                        "    \"job\": \"qa\"\n" +
                        "}")
        .when()
                .post("/users")
        .then()
                .statusCode(201)
                .contentType("application/json")
        ;
    }

    @Test
    public void idNaoPodeSerNull(){
        given()
                .body("{\n" +
                        "    \"name\": \"mariana\",\n" +
                        "    \"job\": \"qa\"\n" +
                        "}")
        .when()
                .post("/users")
        .then()
                .statusCode(201)
                .body("id", is(notNullValue()))
        ;
    }
}
