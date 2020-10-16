package br.com.confidencecambio.javabasico.api.controller;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ImcControllerTest {

    @LocalServerPort
    private int port;

    @Before
	public void setUp() {
		RestAssured.port = port;
		RestAssured.basePath = "/imc";
    }
    
    @Test
	public void deve_retornar_status_200_quando_requisitar_calcular_com_parametros_corretos() {
        RestAssured.given()
            .pathParam("peso", 102.00)
            .pathParam("altura", 1.80)
            .accept(ContentType.JSON)
		.when()
			.get("/calcular/{peso}/{altura}")
		.then()
            .statusCode(HttpStatus.OK.value())
            .body("resultado", Is.is(31.48f));
	}
    
}
