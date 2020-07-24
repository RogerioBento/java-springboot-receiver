package br.com.rest.receiver.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.rest.receiver.core.dto.CarroDto;
import br.com.rest.receiver.core.dto.ModeloDto;
import br.com.rest.receiver.service.CarroService;
import br.com.rest.receiver.service.ModeloService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor_={@Autowired})
public class ReceiverController {

    private final CarroService carroService;
    private final ModeloService modeloService;

    @PostMapping(value = "/carros")
    public void novoCarro(@RequestBody CarroDto carro){
        carroService.novoCarro(carro);
    }

    @GetMapping(value = "/carros/{id}")
    public void buscarCarro(@PathVariable int id){

    }

    @DeleteMapping(value = "/carros/{id}")
    public void deletarCarro(@PathVariable int id){

    }

    @PostMapping(value = "/modelo")
    public void novoModelo(@RequestBody ModeloDto modelo){
        modeloService.novoModelo(modelo);
    }
}