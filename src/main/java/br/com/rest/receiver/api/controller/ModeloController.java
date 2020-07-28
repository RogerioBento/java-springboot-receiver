package br.com.rest.receiver.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.rest.receiver.core.dto.ModeloDto;
import br.com.rest.receiver.service.ModeloService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor_ ={@Autowired})
public class ModeloController {

    private final ModeloService modeloService;

    @PostMapping(value = "/modelo")
    public void novoModelo(@RequestBody ModeloDto modelo){
        modeloService.novoModelo(modelo);
    }
    
}