package br.senai.fatesg.ecommerce.shopping.repository;

import br.senai.fatesg.ecommerce.shopping.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
