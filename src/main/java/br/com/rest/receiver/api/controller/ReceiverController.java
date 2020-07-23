package br.com.rest.receiver.api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import br.com.rest.receiver.core.model.Carro;

public class ReceiverController {
    
    @PostMapping(value = "/carros")
    public void novoCarro(@RequestBody Carro carro){

    }

    @GetMapping(value = "/carros/{id}")
    public void buscarCarro(@PathVariable int id){

    }

    @DeleteMapping(value = "/carros/{id}")
    public void deletarCarro(@PathVariable int id){

    }
}