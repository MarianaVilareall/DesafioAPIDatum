package br.ce.mariana.test;

import br.ce.mariana.core.BaseTest;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class UpdateUserTest extends BaseTest {
    @Test
    public void alterarUsuario(){
        given()
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"qa\"\n" +
                        "}")
        .when()
                .patch("/users/2")
        .then()
                .statusCode(200)
                .body("updatedAt", is(notNullValue()))
        ;
    }
}
