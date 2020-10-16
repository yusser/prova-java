package br.com.confidencecambio.javabasico.domain.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.confidencecambio.javabasico.domain.exception.NegocioException;

@Service
public class ImcService {

    public BigDecimal calcular(BigDecimal peso, BigDecimal altura) {
        peso = Optional.ofNullable(peso).orElseThrow(() -> new NegocioException("Parâmetro peso obrigatório"));
        altura = Optional.ofNullable(altura).orElseThrow(() -> new NegocioException("Parâmetro altura obrigatório"));

        if (altura.equals(new BigDecimal(0))) {
            throw new NegocioException("Altura não pode ser zero");
        }

        return peso.divide(altura.pow(2), 2, RoundingMode.HALF_UP);
    }

}
