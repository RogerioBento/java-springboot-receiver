package br.com.rest.receiver.service.impl;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rest.receiver.core.dto.CarroDto;
import br.com.rest.receiver.core.exception.ResourceNotFoundException;
import br.com.rest.receiver.core.model.Carro;
import br.com.rest.receiver.core.model.Modelo;
import br.com.rest.receiver.core.repository.CarroRepository;
import br.com.rest.receiver.core.repository.ModeloRepository;
import br.com.rest.receiver.service.CarroService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class CarroServiceImpl implements CarroService {

    private final ModeloRepository modeloRepository;
    private final CarroRepository carroRepository;

    @Override
    public Carro novoCarro(CarroDto carroDto) {
        return carroRepository.save(dtoToModel(carroDto));
    }

    @Override
    public Carro buscarCarro(int id) {
        Optional<Carro> carro = carroRepository.findById(id);
        return carro.isPresent() ? carro.get() : null;
    }

    @Override
    public void deletarCarro(int id) {
        carroRepository.deleteById(id);
    }

    @Override
    public void atualizaCarro(int id, CarroDto carroDto) {
        Optional<Carro> carro = carroRepository.findById(id);
        Optional<Modelo> modelo = modeloRepository.findById(carroDto.getIdmodelo());

        if (carro.isPresent() && modelo.isPresent()) {
            carro.ifPresent(temp -> {
                temp.setCor(carroDto.getCor());
                temp.setIdmodelo(modelo.get());
                temp.setPlaca(carroDto.getPlaca());
                temp.setValor(carroDto.getValor());
            });
            carroRepository.save(carro.get());
        } else {
            StringBuilder sBuilder = new StringBuilder();
            sBuilder.append(!carro.isPresent() ? "Idcarro - " + id : " ");
            sBuilder.append(!modelo.isPresent() ? "idmodelo - " + carroDto.getIdmodelo() : " ");
            throw new ResourceNotFoundException(sBuilder.toString());
        }
    }

    private Carro dtoToModel(CarroDto carroDto) {
        return Carro.builder().cor(carroDto.getCor()).idmodelo(modeloRepository.findById(carroDto.getIdmodelo()).get())
                .valor(carroDto.getValor()).placa(carroDto.getPlaca()).build();
    }
}