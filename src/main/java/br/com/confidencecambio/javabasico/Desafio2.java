package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.domain.model.Cliente;
import br.com.confidencecambio.javabasico.domain.model.Gerente;
import br.com.confidencecambio.javabasico.domain.model.Robo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Desafio2 {

    private static final String NOME_COMPLETO = "João Soares Silva";
	private static final String MSG_LOG_CLIENTE = "Cliente - %s";
	private static final String MSG_LOG_GERENTE = "Gerente - %s";
	private static final String MSG_LOG_ROBO = "Robô - %s";

	public static void main(String[] args) {
		var cliente = new Cliente(NOME_COMPLETO);

		log.info(String.format(MSG_LOG_CLIENTE, cliente.getNome()));
		log.info(String.format(MSG_LOG_CLIENTE, cliente.getPrimeiroNome()));
		log.info(String.format(MSG_LOG_CLIENTE, cliente.getUltimosNomes()));
		log.info(String.format(MSG_LOG_CLIENTE, cliente.getNomeAbreviado()));
		log.info(String.format(MSG_LOG_CLIENTE, cliente.getNomeMaiusculo()));

		log.info("----");

		var gerente = new Gerente(NOME_COMPLETO);

		log.info(String.format(MSG_LOG_GERENTE, gerente.getNome()));
		log.info(String.format(MSG_LOG_GERENTE, gerente.getPrimeiroNome()));
		log.info(String.format(MSG_LOG_GERENTE, gerente.getUltimosNomes()));
		log.info(String.format(MSG_LOG_GERENTE, gerente.getNomeAbreviado()));
		log.info(String.format(MSG_LOG_GERENTE, gerente.getNomeMaiusculo()));

		log.info("----");

		var robo = new Robo(NOME_COMPLETO);

		log.info(String.format(MSG_LOG_ROBO, robo.getNome()));
		log.info(String.format(MSG_LOG_ROBO, robo.getPrimeiroNome()));
		log.info(String.format(MSG_LOG_ROBO, robo.getUltimosNomes()));
		log.info(String.format(MSG_LOG_ROBO, robo.getNomeAbreviado()));
        log.info(String.format(MSG_LOG_ROBO, robo.getNomeMaiusculo()));

	}

}