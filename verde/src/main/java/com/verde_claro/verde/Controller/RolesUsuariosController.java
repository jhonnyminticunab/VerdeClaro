package com.verde_claro.verde.Controller;

import com.verde_claro.verde.Collection.RolesUsuarios;
import com.verde_claro.verde.IService.IRolesUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/roles_usuarios")
public class RolesUsuariosController {

    @Autowired
    private IRolesUsuariosService service;

    @GetMapping
    public List<RolesUsuarios> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<RolesUsuarios> show(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public RolesUsuarios save(@RequestBody RolesUsuarios rolesUsuarios) {
        return service.save(rolesUsuarios);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public RolesUsuarios update(@PathVariable String id, @RequestBody RolesUsuarios rolesUsuarios) {
        Optional<RolesUsuarios> op = service.findById(id);

        if (!op.isEmpty()) {
            RolesUsuarios RolesUsuariosUpdate = op.get();
            RolesUsuariosUpdate.setUsuario_id(rolesUsuarios.getUsuario_id());
            RolesUsuariosUpdate.setRol_id(rolesUsuarios.getRol_id());
            return service.save(RolesUsuariosUpdate);
        }

        return rolesUsuarios;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
