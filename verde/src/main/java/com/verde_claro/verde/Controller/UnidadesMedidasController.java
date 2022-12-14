package com.verde_claro.verde.Controller;

import com.verde_claro.verde.Collection.UnidadesMedidas;
import com.verde_claro.verde.IService.IUnidadesMedidasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/UnidadesMedidas")
public class UnidadesMedidasController {

    @Autowired
    private IUnidadesMedidasService service;

    @GetMapping
    public List<UnidadesMedidas> all() {
        return service.all();
    }
    @GetMapping("{id}")
    public Optional<UnidadesMedidas> show(@PathVariable String id) {
        return service.findById(id);
    }
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public UnidadesMedidas save(@RequestBody UnidadesMedidas  productos) {
        return service.save(productos);
    }
    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public UnidadesMedidas update(@PathVariable String id, @RequestBody UnidadesMedidas unidadesMedidas) {
        Optional<UnidadesMedidas> op = service.findById(id);

        if (!op.isEmpty()) {
            UnidadesMedidas unidadesMedidasUpdate = op.get();
            unidadesMedidasUpdate.setCodigo(unidadesMedidas.getCodigo());
            unidadesMedidasUpdate.setNombre(unidadesMedidas.getNombre());
            unidadesMedidasUpdate.setDescripcion(unidadesMedidas.getDescripcion());
            unidadesMedidasUpdate.setProductosId(unidadesMedidas.getProductosId());
            unidadesMedidasUpdate.setEstado(unidadesMedidas.getEstado());
            return service.save(unidadesMedidasUpdate);
        }
        return unidadesMedidas;
    }
        @DeleteMapping("{id}")
        @ResponseStatus(code = HttpStatus.NO_CONTENT)
        public void delete (@PathVariable String id){
            service.delete(id);
    }
}
