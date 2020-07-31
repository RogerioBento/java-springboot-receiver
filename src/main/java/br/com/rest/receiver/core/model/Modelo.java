package br.com.rest.receiver.core.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.boot.context.properties.bind.DefaultValue;

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

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmodelo",fetch = FetchType.LAZY)
  @JsonIgnore
  private List<Carro> carroList;

  private String nome;
}
