package br.senai.fatesg.ecommerce.shopping.service;

import br.senai.fatesg.ecommerce.shopping.interfaces.IService;
import br.senai.fatesg.ecommerce.shopping.model.Endereco;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService implements IService<Endereco, Integer> {
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
