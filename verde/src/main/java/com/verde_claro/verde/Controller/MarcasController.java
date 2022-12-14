package com.verde_claro.verde.Controller;

import com.verde_claro.verde.Collection.Marcas;
import com.verde_claro.verde.IService.IMarcasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/marcas")
public class MarcasController {

    @Autowired
    private IMarcasService service;

    @GetMapping
    public List<Marcas> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Marcas> show(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Marcas save(@RequestBody Marcas productos) {
        return service.save(productos);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Marcas update(@PathVariable String id, @RequestBody Marcas marcas) {
        Optional<Marcas> op = service.findById(id);

        if (!op.isEmpty()) {
            Marcas marcasUpdate = op.get();
            marcasUpdate.setCodigo(marcas.getCodigo());
            marcasUpdate.setNombre(marcas.getNombre());
            marcasUpdate.setProductosId(marcas.getProductosId());
            marcasUpdate.setEstado(marcas.getEstado());
            return service.save(marcasUpdate);
        }
        return marcas;
    }
    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}