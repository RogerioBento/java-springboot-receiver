package br.com.rest.receiver.service;

import br.com.rest.receiver.core.dto.CarroDto;
import br.com.rest.receiver.core.model.Carro;

public interface CarroService {
    
    public Carro novoCarro(CarroDto Carro);

    public Carro buscarCarro(int id);

    public void deletarCarro(int id);
    
    public void atualizaCarro(int id, CarroDto carro);
    
}