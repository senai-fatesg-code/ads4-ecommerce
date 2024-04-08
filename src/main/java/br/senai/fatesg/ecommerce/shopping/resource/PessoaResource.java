package br.senai.fatesg.ecommerce.shopping.resource;


import br.senai.fatesg.ecommerce.shopping.interfaces.IResource;
import br.senai.fatesg.ecommerce.shopping.model.Pessoa;

import java.util.List;

public class PessoaResource implements IResource<Pessoa, Integer> {

    @Override
    public Pessoa create(Pessoa entity) {
        return null;
    }

    @Override
    public Pessoa read(Integer id) {
        return null;
    }

    @Override
    public List<Pessoa> readAll() {
        return null;
    }

    @Override
    public Pessoa updatePart(Integer id, Pessoa entity) {
        return null;
    }

    @Override
    public Pessoa updateAll(Integer id, Pessoa entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
