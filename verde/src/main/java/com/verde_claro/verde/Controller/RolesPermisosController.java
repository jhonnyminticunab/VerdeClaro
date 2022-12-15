package com.verde_claro.verde.Controller;

import com.verde_claro.verde.Collection.RolesPermisos;
import com.verde_claro.verde.IService.IRolesPermisosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/roles_permisos")
public class RolesPermisosController {

    @Autowired
    private IRolesPermisosService service;

    @GetMapping
    public List<RolesPermisos> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<RolesPermisos> show(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public RolesPermisos save(@RequestBody RolesPermisos rolesPermisos) {
        return service.save(rolesPermisos);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public RolesPermisos update(@PathVariable String id, @RequestBody RolesPermisos rolesPermisos) {
        Optional<RolesPermisos> op = service.findById(id);

        if (!op.isEmpty()) {
            RolesPermisos RolesPermisosUpdate = op.get();
            RolesPermisosUpdate.setRol_id(rolesPermisos.getRol_id());
            RolesPermisosUpdate.setPermiso_id(rolesPermisos.getPermiso_id());
            return service.save(RolesPermisosUpdate);
        }

        return rolesPermisos;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
