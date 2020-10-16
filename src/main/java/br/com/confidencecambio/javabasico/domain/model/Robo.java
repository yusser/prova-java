package br.com.confidencecambio.javabasico.domain.model;

import org.springframework.util.StringUtils;

import br.com.confidencecambio.javabasico.domain.exception.NegocioException;
import br.com.confidencecambio.javabasico.domain.interfaces.INome;
import br.com.confidencecambio.javabasico.domain.util.NomeUtil;

public class Robo implements INome {

    private String nome;
    
    public Robo(String nome) {
        if (!StringUtils.hasText(nome)) {
            throw new NegocioException("Parâmetro nome não pode ser nulo");
        }
        if (StringUtils.isEmpty(nome.trim())) {
            throw new NegocioException("Parâmetro nome não pode ser vazio");
        }
        this.setNome(nome);
    }

    public String getNome() {
        return this.nome.trim();
    }

    public void setNome(String nome) {
        this.nome = nome.trim();
	}

    public String getPrimeiroNome() {
        return NomeUtil.extrairPrimeiroNome(this.getNome());
    }

    public String getUltimosNomes() {
        return NomeUtil.extrairUltimosNomes(this.getNome());
    }

    public String getNomeAbreviado() {
        return NomeUtil.abreviarNomesDoMeio(this.getNome());
    }

    public String getNomeMaiusculo() {
        return this.getNome().toUpperCase();
    }
}
