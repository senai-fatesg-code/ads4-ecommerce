package br.senai.fatesg.ecommerce.shopping.resource;

import br.senai.fatesg.ecommerce.shopping.interfaces.IResource;
import br.senai.fatesg.ecommerce.shopping.model.Contato;

import java.util.List;

public class ContatoResource implements IResource<Contato, Integer> {
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
