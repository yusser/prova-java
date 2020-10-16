package br.com.confidencecambio.javabasico.api.dto;

import java.math.BigDecimal;

import lombok.Getter;

@Getter
public class ImcResponse {

	private BigDecimal resultado;
    
    public ImcResponse(BigDecimal resutlado) {
        this.resultado = resutlado;
	}

}
