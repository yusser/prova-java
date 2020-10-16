package br.com.confidencecambio.javabasico.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NegocioException extends RuntimeException {

    private static final long serialVersionUID = 193774527148880294L;

    public NegocioException(String message) {
        super(message);
    }

    public NegocioException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
    
}
