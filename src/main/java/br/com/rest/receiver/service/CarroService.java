package br.com.rest.receiver.service;

import br.com.rest.receiver.core.model.Carro;

public interface CarroService {
    
    public void novoCarro(Carro Carro);

    public void buscarCarro(int id);

    public void deletarCarro(int id);
    
}