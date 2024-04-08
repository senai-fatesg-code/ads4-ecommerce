package br.senai.fatesg.ecommerce.shopping.repository;

import br.senai.fatesg.ecommerce.shopping.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
