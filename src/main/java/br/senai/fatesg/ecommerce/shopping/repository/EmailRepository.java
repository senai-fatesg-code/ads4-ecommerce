package br.senai.fatesg.ecommerce.shopping.repository;

import br.senai.fatesg.ecommerce.shopping.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Integer> {
}