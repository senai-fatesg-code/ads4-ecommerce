package br.senai.fatesg.ecommerce.shopping.repository;

import br.senai.fatesg.ecommerce.shopping.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
