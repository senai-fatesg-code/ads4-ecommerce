package br.senai.fatesg.ecommerce.shopping.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "EMAIL")
public class Email extends BaseModel {

    @Column(name = "ENDERECO_EMAIL", nullable = false)
    private String enderecoEmail;

    @Column(name = "DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "DATA_FIM")
    private LocalDateTime dataFim;

    //TODO Fazer relacionamento
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Contato contato;

}
