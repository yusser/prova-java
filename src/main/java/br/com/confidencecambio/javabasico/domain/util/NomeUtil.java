package br.com.confidencecambio.javabasico.domain.util;

import java.util.Optional;

import br.com.confidencecambio.javabasico.domain.exception.NegocioException;

public class NomeUtil {

    private static final String MSG_ERRO_PARAMETRO_OBRIGATORIO = "Parâmetro [texto] obrigatório";

    private NomeUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static String extrairPrimeiroNome(String texto) {
        texto = Optional.ofNullable(texto).orElseThrow(() -> new NegocioException(MSG_ERRO_PARAMETRO_OBRIGATORIO));

        if (texto.trim().contains(" ")) {
            String[] arr = texto.split(" ", 2);
            return arr[0];
        }

        return texto;
    }

    public static String extrairUltimosNomes(String texto) {
        texto = Optional.ofNullable(texto).orElseThrow(() -> new NegocioException(MSG_ERRO_PARAMETRO_OBRIGATORIO));

        if (texto.trim().contains(" ")) {
            String[] arr = texto.split(" ", 2);
            return arr[1];
        }

        return texto;
    }

    public static String abreviarNomesDoMeio(String texto) {
        texto = Optional.ofNullable(texto).orElseThrow(() -> new NegocioException(MSG_ERRO_PARAMETRO_OBRIGATORIO));

        if (texto.trim().contains(" ")) {
            StringBuilder nomeAbreviado = new StringBuilder();

            String[] arr = texto.split("\\s+");

            nomeAbreviado.append(arr[0]);
            nomeAbreviado.append(" ");

            for (int i = 1; i < arr.length-1; i++) {
                if (arr[i].length() <= 2) continue;
                
                nomeAbreviado.append(arr[i].charAt(0));
                nomeAbreviado.append(". ");
            }

            nomeAbreviado.append(arr[arr.length-1]);

            return nomeAbreviado.toString();
        }

        return texto;
    }

}
