package br.ce.mariana.test;

import br.ce.mariana.core.BaseTest;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ConsultarListaUserTest extends BaseTest {
    @Test
    public void realizandoConsultaDeListaComSucesso(){
        given()
                .queryParam("page", "2")
        .when()
                .get("/users")
        .then()
                .statusCode(200)
        ;
    }
    @Test
    public void deveValidarTanhoDaLista(){
        given()
                .queryParam("page", "2")
        .when()
                .get("/users")
        .then()
                .statusCode(200)
                .body("data", hasSize(6))
        ;
    }
    @Test
    public void deveValidarOPrimeiroConteudoDaLista(){
        given()
                .queryParam("page", "2")
        .when()
                .get("/users")
        .then()
                .statusCode(200)
                .body("data[0].id", is(7))
                .body("data[0].email", is("michael.lawson@reqres.in"))
        ;
    }
}
