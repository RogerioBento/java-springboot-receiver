package br.com.rest.receiver.service;

import br.com.rest.receiver.core.dto.CarroDto;

public interface CarroService {
    
    public void novoCarro(CarroDto Carro);

    public void buscarCarro(int id);

    public void deletarCarro(int id);
    
}