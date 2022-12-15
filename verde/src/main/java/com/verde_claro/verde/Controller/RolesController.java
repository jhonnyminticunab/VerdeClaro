package com.verde_claro.verde.Controller;

import com.verde_claro.verde.Collection.Roles;
import com.verde_claro.verde.IService.IRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/roles")
public class RolesController {


    @Autowired
    private IRolesService service;

    @GetMapping
    public List<Roles> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Roles> show(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Roles save(@RequestBody Roles roles) {
        return service.save(roles);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Roles update(@PathVariable String id, @RequestBody Roles roles) {
        Optional<Roles> op = service.findById(id);

        if (!op.isEmpty()) {
            Roles RolesUpdate = op.get();
            RolesUpdate.setCodigo(roles.getCodigo());
            RolesUpdate.setNombre(roles.getNombre());
            RolesUpdate.setEstado(roles.getEstado());
            return service.save(RolesUpdate);
        }

        return roles;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
