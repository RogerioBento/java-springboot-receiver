package br.com.rest.receiver.core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "modelo")
public class Modelo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idmodelo;

  private String nome;
}

