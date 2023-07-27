package br.ce.mariana.test;

import br.ce.mariana.core.BaseTest;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ConsultarUserTest extends BaseTest {
    @Test
    public void realizandoConsultaComSucesso(){
        given()
        .when()
                .get("/users/2")
        .then()
                .statusCode(200)
        ;
    }
    @Test
    public void deveValidarID(){
        given()
        .when()
                .get("/users/2")
        .then()
                .statusCode(200)
                .body("data.id", is(2))
        ;
    }
    @Test
    public void deveValidarUsuarioInexistente(){
        given()
        .when()
                .get("/users/400")
        .then()
                .statusCode(404)
        ;
    }
}
