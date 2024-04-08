package br.senai.fatesg.ecommerce.shopping.service;

import br.senai.fatesg.ecommerce.shopping.interfaces.IService;
import br.senai.fatesg.ecommerce.shopping.model.Pessoa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService implements IService<Pessoa, Integer> {

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
