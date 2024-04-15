package br.senai.fatesg.ecommerce.shopping.resource;

import br.senai.fatesg.ecommerce.shopping.interfaces.IResource;
import br.senai.fatesg.ecommerce.shopping.model.Contato;
import br.senai.fatesg.ecommerce.shopping.model.Email;
import br.senai.fatesg.ecommerce.shopping.service.EmailService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/email")
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmailResource implements IResource<Email, Integer> {

    @Autowired
    private EmailService emailService;

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Email create(@Valid @RequestBody Email entity) {
        return  emailService.create(entity);
    }

    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Email read(@PathVariable Integer id) {
        return emailService.read(id);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    @Override
    public List<Email> readAll() {
        return emailService.readAll();
    }

    @PatchMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Email updatePart(@PathVariable Integer id,
                            @Valid @RequestBody Email entity) {
        return emailService.updatePart(id, entity);
    }

    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Email updateAll(@PathVariable Integer id,
                           @Valid @RequestBody Email entity) {
        return emailService.updateAll(id, entity);
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        emailService.delete(id);

    }
}
