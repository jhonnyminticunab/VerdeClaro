package com.verde_claro.verde.Controller;

import com.verde_claro.verde.Collection.Permisos;
import com.verde_claro.verde.IService.IPermisosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/permisos")
public class PermisosController {

    @Autowired
    private IPermisosService service;

    @GetMapping
    public List<Permisos> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Permisos> show(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Permisos save(@RequestBody Permisos permisos) {
        return service.save(permisos);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Permisos update(@PathVariable String id, @RequestBody Permisos permisos) {
        Optional<Permisos> op = service.findById(id);

        if (!op.isEmpty()) {
            Permisos PermisosUpdate = op.get();
            PermisosUpdate.setCodigo(permisos.getCodigo());
            PermisosUpdate.setNombre(permisos.getNombre());
            PermisosUpdate.setRuta(permisos.getRuta());
            PermisosUpdate.setEstado(permisos.getEstado());
            return service.save(PermisosUpdate);
        }

        return permisos;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
