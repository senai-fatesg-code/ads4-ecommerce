package br.senai.fatesg.ecommerce.shopping.resource;

import br.senai.fatesg.ecommerce.shopping.interfaces.IResource;
import br.senai.fatesg.ecommerce.shopping.model.Telefone;

import java.util.List;

public class TelefoneResource implements IResource<Telefone, Integer> {
    @Override
    public Telefone create(Telefone entity) {
        return null;
    }

    @Override
    public Telefone read(Integer id) {
        return null;
    }

    @Override
    public List<Telefone> readAll() {
        return null;
    }

    @Override
    public Telefone updatePart(Integer id, Telefone entity) {
        return null;
    }

    @Override
    public Telefone updateAll(Integer id, Telefone entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
