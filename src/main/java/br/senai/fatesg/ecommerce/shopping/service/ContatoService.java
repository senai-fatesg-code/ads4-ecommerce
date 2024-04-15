package br.senai.fatesg.ecommerce.shopping.service;

import br.senai.fatesg.ecommerce.shopping.interfaces.IService;
import br.senai.fatesg.ecommerce.shopping.model.Contato;
import br.senai.fatesg.ecommerce.shopping.repository.ContatoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class ContatoService implements IService<Contato, Integer>{

    @Autowired
    private ContatoRepository contatoRepository;

    @Transactional(rollbackFor = Error.class)
    @Override
    public Contato create(Contato entity) {
        return contatoRepository.save(entity);
    }

    @Override
    public Contato read(Integer id) {
        return contatoRepository.getReferenceById(id);
    }

    @Override
    public List<Contato> readAll() {
        return contatoRepository.findAll();
    }

    @Override
    public Contato updatePart(Integer id, Contato entity) {

        Contato contatEncontrado = this.read(id);

        if(contatEncontrado!=null){
            entity.setId(contatEncontrado.getId());

            return contatoRepository.save(entity);
        }

        return new Contato();
    }

    @Override
    public Contato updateAll(
            Integer id, Contato entity) {

        Contato contatEncontrado = this.read(id);

        if(contatEncontrado!=null){
            entity.setId(contatEncontrado.getId());

            return contatoRepository.save(entity);
        }

        return new Contato();
    }

    @Override
    public void delete(Integer id) {
        contatoRepository.deleteById(id);

    }
}
