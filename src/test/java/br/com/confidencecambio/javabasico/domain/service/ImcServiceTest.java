package br.com.confidencecambio.javabasico.domain.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import br.com.confidencecambio.javabasico.domain.exception.NegocioException;

public class ImcServiceTest {

    private ImcService service;

    @Before
    public void init(){
        this.service = new ImcService();
    }

    @Test
    public void deve_retornar_imc_quando_parametros_corretos() {
        // mock
        var peso = new BigDecimal(102.00);
        var altura = new BigDecimal(1.80);

        // Test
        var imcReturned = this.service.calcular(peso, altura);

        // check
        var imcExpected = new BigDecimal(31.48).setScale(2, RoundingMode.HALF_UP);
        Assertions.assertThat(imcReturned).isEqualTo(imcExpected);
    }

    @Test(expected = NegocioException.class)
    public void deve_retornar_NegocioException_quando_altura_igual_0() {
        // mock
        var peso = new BigDecimal(100);
        var altura = new BigDecimal(0);

        // Test
        this.service.calcular(peso, altura);

        // check
        // implementado na annotation @Test
    }

    @Test(expected = NegocioException.class)
    public void deve_retornar_NegocioException_quando_peso_e_altura_null() {
        // mock

        // Test
        this.service.calcular(null, null);

        // check
        // implementado na annotation @Test
    }
}
