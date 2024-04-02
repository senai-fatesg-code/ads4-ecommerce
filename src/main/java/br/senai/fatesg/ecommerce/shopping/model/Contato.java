package br.senai.fatesg.ecommerce.shopping.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "CONTATO")
public class Contato extends BaseModel {

    @Column(name = "DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "DATA_FIM")
    private LocalDateTime dataFim;

    //TODO Fazer relacionamento
    @ManyToOne(fetch = FetchType.LAZY)
    private Pessoa pessoa;

    //TODO Fazer relacionamento
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contato_id")
    private List<Email> emails = new ArrayList<>();

    //TODO Fazer relacionamento
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contato_id")
    private List<Endereco> enderecos = new ArrayList<>();;

    //TODO Fazer relacionamento
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contato_id")
    private List<Telefone> telefones = new ArrayList<>();;
}
