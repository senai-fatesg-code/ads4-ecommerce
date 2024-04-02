package br.senai.fatesg.ecommerce.shopping.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @see <a href="https://docs.oracle.com/javaee/5/api/javax/persistence/MappedSuperclass.html">MappedSuperclass</a>
 */

@Getter
@Setter
@MappedSuperclass
public class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;
}
