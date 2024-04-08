package br.senai.fatesg.ecommerce.shopping.resource;

import br.senai.fatesg.ecommerce.shopping.interfaces.IResource;
import br.senai.fatesg.ecommerce.shopping.model.Contato;
import br.senai.fatesg.ecommerce.shopping.model.Email;

import java.util.List;

public class EmailResource implements IResource<Email, Integer> {
    @Override
    public Email create(Email entity) {
        return null;
    }

    @Override
    public Email read(Integer id) {
        return null;
    }

    @Override
    public List<Email> readAll() {
        return null;
    }

    @Override
    public Email updatePart(Integer id, Email entity) {
        return null;
    }

    @Override
    public Email updateAll(Integer id, Email entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
