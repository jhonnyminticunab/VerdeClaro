package com.verde_claro.verde.Controller;

import com.verde_claro.verde.Collection.Categorias;
import com.verde_claro.verde.IService.ICategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/categorias")
public class CategoriasController {

    @Autowired
    private ICategoriasService service;

    @GetMapping
    public List<Categorias> all() {
        return service.all();
    }
    @GetMapping("{id}")
    public Optional<Categorias> show(@PathVariable String id) {
        return service.findById(id);
    }
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Categorias save(@RequestBody Categorias productos) {
        return service.save(productos);
    }
    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Categorias update(@PathVariable String id, @RequestBody Categorias categorias) {
        Optional<Categorias> op = service.findById(id);

        if (!op.isEmpty()) {
            Categorias categoriasUpdate = op.get();
            categoriasUpdate.setCodigo(categorias.getCodigo());
            categoriasUpdate.setNombre(categorias.getNombre());
            categoriasUpdate.setProductosId(categorias.getProductosId());
            categoriasUpdate.setEstado(categorias.getEstado());
            return service.save(categoriasUpdate);
        }
        return categorias;
    }
    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
 }

