package br.senai.fatesg.ecommerce.shopping.repository;

import br.senai.fatesg.ecommerce.shopping.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
