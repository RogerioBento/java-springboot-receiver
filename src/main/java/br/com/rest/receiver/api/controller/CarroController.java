package br.com.rest.receiver.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import static br.com.rest.receiver.core.config.GsonConfig.gsonStart;
import br.com.rest.receiver.core.config.GsonConfig;
import br.com.rest.receiver.core.dto.CarroDto;
import br.com.rest.receiver.core.model.Carro;
import br.com.rest.receiver.service.CarroService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor_={@Autowired})
public class CarroController {

    private final CarroService carroService;

    @PostMapping(value = "/carros")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity novoCarro(@RequestBody CarroDto carro){
        carroService.novoCarro(carro);
        return ResponseEntity.status(HttpStatus.CREATED.value()).body("Carro criado");
    }

    @GetMapping(value = "/carros/{id}")
    public ResponseEntity buscarCarro(@PathVariable int id){
        Carro carroTeste = carroService.buscarCarro(id);
        return ResponseEntity.ok(gsonStart().toJson(carroTeste));
    }

    @DeleteMapping(value = "/carros/{id}")
    public void deletarCarro(@PathVariable int id){
        carroService.deletarCarro(id);
    }
}