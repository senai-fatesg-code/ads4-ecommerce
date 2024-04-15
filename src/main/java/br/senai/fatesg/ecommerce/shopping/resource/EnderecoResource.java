package br.senai.fatesg.ecommerce.shopping.resource;

import br.senai.fatesg.ecommerce.shopping.interfaces.IResource;
import br.senai.fatesg.ecommerce.shopping.model.Email;
import br.senai.fatesg.ecommerce.shopping.model.Endereco;
import br.senai.fatesg.ecommerce.shopping.service.EmailService;
import br.senai.fatesg.ecommerce.shopping.service.EnderecoService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.xml.stream.events.EndElement;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/endereco")
public class EnderecoResource implements IResource<Endereco, Integer> {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Endereco create(@Valid @RequestBody Endereco entity) {
        return enderecoService.create(entity);
    }

    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Endereco read(@PathVariable Integer id) {
        return enderecoService.read(id);
    }

    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public List<Endereco> readAll() {
        return enderecoService.readAll();
    }

    @PatchMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Endereco updatePart(@PathVariable Integer id,
                               @Valid @RequestBody Endereco entity) {
        return enderecoService.updatePart(id, entity);
    }

    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Endereco updateAll(@PathVariable Integer id,
                              @Valid @RequestBody Endereco entity) {
        return enderecoService.updateAll(id, entity);
    }

    @DeleteMapping(
            value = "/{id}"
    )
    @Override
    public void delete(@PathVariable Integer id) {
        enderecoService.delete(id);
    }
}
