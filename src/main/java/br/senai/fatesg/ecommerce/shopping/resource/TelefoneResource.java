package br.senai.fatesg.ecommerce.shopping.resource;

import br.senai.fatesg.ecommerce.shopping.interfaces.IResource;
import br.senai.fatesg.ecommerce.shopping.model.Telefone;
import br.senai.fatesg.ecommerce.shopping.service.TelefoneService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/telefone")
public class TelefoneResource implements IResource<Telefone, Integer> {

    @Autowired
    private TelefoneService telefoneService;

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Telefone create(@Valid @RequestBody Telefone entity) {
        return telefoneService.create(entity);
    }

    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Telefone read(@PathVariable Integer id) {
        return telefoneService.read(id);
    }

    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public List<Telefone> readAll() {
        return telefoneService.readAll();
    }

    @PatchMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Telefone updatePart(@PathVariable Integer id,
                               @Valid @RequestBody Telefone entity) {

        return telefoneService.updatePart(id, entity);
    }

    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Telefone updateAll(@PathVariable Integer id,
                              @Valid @RequestBody Telefone entity) {
        return telefoneService.updateAll(id, entity);
    }

    @DeleteMapping(
            value = "/{id}"
    )
    @Override
    public void delete(Integer id) {
        telefoneService.delete(id);
    }
}
