package br.senai.fatesg.ecommerce.shopping.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ENDERECO")
public class Endereco extends BaseModel {

    @Column(name = "LOGRADOURO", nullable = false)
    private String logradouro;

    @Column(name = "DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "DATA_FIM")
    private LocalDateTime dataFim;

    //TODO Fazer relacionamento
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Contato contato;

}
