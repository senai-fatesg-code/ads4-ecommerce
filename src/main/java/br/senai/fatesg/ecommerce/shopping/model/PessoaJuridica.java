package br.senai.fatesg.ecommerce.shopping.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PESSOA_JURIDICA")
public class PessoaJuridica extends BaseModel {

    @Column(name = "CNPJ", length = 14, nullable = false)
    private String cnpj;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id", referencedColumnName = "id")
    private Pessoa pessoa;
}
