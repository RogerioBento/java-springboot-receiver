package br.com.rest.receiver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Service;

import br.com.rest.receiver.core.dto.ModeloDto;
import br.com.rest.receiver.core.model.Modelo;
import br.com.rest.receiver.core.repository.ModeloRepository;
import br.com.rest.receiver.service.ModeloService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class ModeloServiceImpl implements ModeloService {

    private final ModeloRepository modeloRepository;

    @Override
    public void novoModelo(ModeloDto modelo) {
        modeloRepository.save(dtoToModel(modelo));
    }

    private Modelo dtoToModel(ModeloDto modeloDto){
        return Modelo.builder().nome(modeloDto.getNome()).build();
    }
    

}