package br.com.confidencecambio.javabasico.domain.model;

import org.springframework.util.StringUtils;

import br.com.confidencecambio.javabasico.domain.exception.NegocioException;
import br.com.confidencecambio.javabasico.domain.interfaces.INome;
import br.com.confidencecambio.javabasico.domain.util.NomeUtil;

public class Pessoa implements INome {

    private String nome;

    public Pessoa(String nome) {
        if (!StringUtils.hasText(nome)) {
            throw new NegocioException("Parâmetro nome não pode ser nulo");
        }
        if (StringUtils.isEmpty(nome.trim())) {
            throw new NegocioException("Parâmetro nome não pode ser vazio");
        }
        this.setNome(nome);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome.trim();
	}

    @Override
    public String getPrimeiroNome() {
        return NomeUtil.extrairPrimeiroNome(this.getNome());
    }

    @Override
    public String getUltimosNomes() {
        return NomeUtil.extrairUltimosNomes(this.getNome());
    }

    @Override
    public String getNomeAbreviado() {
        return NomeUtil.abreviarNomesDoMeio(this.getNome());
    }

    @Override
    public String getNomeMaiusculo() {
        return this.getNome().toUpperCase();
    }

}
