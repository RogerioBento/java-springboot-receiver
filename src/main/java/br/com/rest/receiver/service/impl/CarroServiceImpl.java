package br.com.rest.receiver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rest.receiver.core.dto.CarroDto;
import br.com.rest.receiver.core.model.Carro;
import br.com.rest.receiver.core.model.Modelo;
import br.com.rest.receiver.core.repository.CarroRepository;
import br.com.rest.receiver.core.repository.ModeloRepository;
import br.com.rest.receiver.service.CarroService;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor(onConstructor_={@Autowired})
public class CarroServiceImpl implements CarroService {

    private final ModeloRepository modeloRepository;
    private final CarroRepository carroRepository;

    @Override
    public void novoCarro(CarroDto carroDto) {
        carroRepository.save(dtoToModel(carroDto));
    }

    @Override
    public void buscarCarro(int id) {

    }

    @Override
    public void deletarCarro(int id) {

    }

    private Carro dtoToModel(CarroDto carroDto){
        return Carro.builder()
        .cor(carroDto.getCor())
        .modelo(modeloRepository.findById(carroDto.getIdmodelo()).get())
        .valor(carroDto.getValor())
        .placa(carroDto.getPlaca()).build();
    }
}