package br.com.confidencecambio.javabasico.domain.util;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.com.confidencecambio.javabasico.domain.exception.NegocioException;

public class NomeUtilTest {

    private static final String NOME_COMPLETO = "Gustavo do Sacramento Cardoso";

    @Test
    public void deve_retornar_primeiro_nome_ao_invocar_extrairPrimeiroNome_quando_informado_nome_completo() {
        // mock
        var nome = NOME_COMPLETO;

        // Test
        var primeiroNomeReturned = NomeUtil.extrairPrimeiroNome(nome);

        // check
        var primeiroNomeExpected = "Gustavo";
        Assertions.assertThat(primeiroNomeReturned).isEqualTo(primeiroNomeExpected);
    }

    @Test(expected = NegocioException.class)
    public void deve_retornar_NegocioException_ao_invocar_extrairPrimeiroNome_quando_nome_nulo() {
        // mock

        // Test
        NomeUtil.extrairPrimeiroNome(null);

        // check
    }

    @Test
    public void deve_retornar_ultimos_nomes_ao_invocar_extrairUltimosNomes_quando_informado_nome_completo() {
        // mock
        var nome = NOME_COMPLETO;

        // Test
        var primeiroNomeReturned = NomeUtil.extrairUltimosNomes(nome);

        // check
        var primeiroNomeExpected = "do Sacramento Cardoso";
        Assertions.assertThat(primeiroNomeReturned).isEqualTo(primeiroNomeExpected);
    }

    @Test(expected = NegocioException.class)
    public void deve_retornar_NegocioException_ao_invocar_extrairUltimosNomes_quando_nome_nulo() {
        // mock

        // Test
        NomeUtil.extrairUltimosNomes(null);

        // check
    }

    @Test
    public void deve_retornar_nome_aberviado_ao_invocar_abreviarNomesDoMeio_quando_informado_nome_completo() {
        // mock
        var nome = NOME_COMPLETO;

        // Test
        var primeiroNomeReturned = NomeUtil.abreviarNomesDoMeio(nome);

        // check
        var primeiroNomeExpected = "Gustavo S. Cardoso";
        Assertions.assertThat(primeiroNomeReturned).isEqualTo(primeiroNomeExpected);
    }

    @Test(expected = NegocioException.class)
    public void deve_retornar_NegocioException_ao_invocar_abreviarNomesDoMeio_quando_nome_nulo() {
        // mock

        // Test
        NomeUtil.abreviarNomesDoMeio(null);

        // check
    }
}
