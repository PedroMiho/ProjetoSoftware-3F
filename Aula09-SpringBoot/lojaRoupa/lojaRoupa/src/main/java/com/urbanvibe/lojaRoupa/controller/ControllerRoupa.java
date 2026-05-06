package com.urbanvibe.lojaRoupa.controller;

import com.urbanvibe.lojaRoupa.dto.DadosCadastroRoupa;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roupa")
public class ControllerRoupa {

    @PostMapping
    public void cadastrarRoupa(@RequestBody DadosCadastroRoupa dados) {
        System.out.println(dados);
    }

}
