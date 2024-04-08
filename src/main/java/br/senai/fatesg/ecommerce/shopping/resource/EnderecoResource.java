package br.senai.fatesg.ecommerce.shopping.resource;

import br.senai.fatesg.ecommerce.shopping.interfaces.IResource;
import br.senai.fatesg.ecommerce.shopping.model.Endereco;

import java.util.List;

public class EnderecoResource implements IResource<Endereco, Integer> {
    
    @Override
    public Endereco create(Endereco entity) {
        return null;
    }

    @Override
    public Endereco read(Integer id) {
        return null;
    }

    @Override
    public List<Endereco> readAll() {
        return null;
    }

    @Override
    public Endereco updatePart(Integer id, Endereco entity) {
        return null;
    }

    @Override
    public Endereco updateAll(Integer id, Endereco entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
