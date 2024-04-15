package br.senai.fatesg.ecommerce.shopping.resource;


import br.senai.fatesg.ecommerce.shopping.interfaces.IResource;
import br.senai.fatesg.ecommerce.shopping.model.Pessoa;
import br.senai.fatesg.ecommerce.shopping.service.PessoaService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/pessoa")
public class PessoaResource implements IResource<Pessoa, Integer> {


    @Autowired
    private PessoaService pessoaService;


    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Pessoa create(@Valid @RequestBody Pessoa entity) {
        return pessoaService.create(entity);
    }

    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Pessoa read(@PathVariable Integer id) {
        return pessoaService.read(id);
    }

    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public List<Pessoa> readAll() {
        return pessoaService.readAll();
    }

    @PatchMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Pessoa updatePart(@PathVariable Integer id,
                             @Valid @RequestBody Pessoa entity) {
        return pessoaService.updatePart(id, entity);
    }

    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Pessoa updateAll(@PathVariable Integer id,
                            @Valid @RequestBody Pessoa entity) {
        return pessoaService.updateAll(id, entity);
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        pessoaService.delete(id);
    }
}
