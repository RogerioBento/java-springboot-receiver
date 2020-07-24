package br.com.rest.receiver.core.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "carro")
public class Carro {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idcarro;

  private String cor;

  @ManyToOne(cascade = CascadeType.ALL)
  private Modelo modelo;

  private String placa;

  private Double valor;

}

