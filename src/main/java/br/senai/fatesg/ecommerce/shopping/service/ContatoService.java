package br.senai.fatesg.ecommerce.shopping.service;

import br.senai.fatesg.ecommerce.shopping.interfaces.IService;
import br.senai.fatesg.ecommerce.shopping.model.Contato;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService implements IService<Contato, Integer>{
    @Override
    public Contato create(Contato entity) {
        return null;
    }

    @Override
    public Contato read(Integer id) {
        return null;
    }

    @Override
    public List<Contato> readAll() {
        return null;
    }

    @Override
    public Contato updatePart(Integer id, Contato entity) {
        return null;
    }

    @Override
    public Contato updateAll(Integer id, Contato entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
