package br.com.rest.receiver.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarroDto {
  private String cor;

  private ModeloDto modelo;

  private String placa;

  private Double valor;

}

