package br.com.rest.receiver.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rest.receiver.core.model.Modelo;


public interface ModeloRepository extends JpaRepository<Modelo, Integer>{

}