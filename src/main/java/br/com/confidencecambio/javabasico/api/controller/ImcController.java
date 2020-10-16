package br.com.confidencecambio.javabasico.api.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.api.dto.ImcResponse;
import br.com.confidencecambio.javabasico.domain.service.ImcService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Calculadora IMC")
@RestController
@RequestMapping("/imc")
public class ImcController {

    @Autowired
    private ImcService imcService;

    @ApiOperation("Calcula o IMC com base na Peso e Altura")
    @GetMapping("/calcular/{peso}/{altura}")
    public ResponseEntity<ImcResponse> calcular(@PathVariable BigDecimal peso,
    @PathVariable BigDecimal altura) {
        var resultado = imcService.calcular(peso, altura);
        var imcResponse = new ImcResponse(resultado);

        return ResponseEntity.ok(imcResponse);
    }

}
