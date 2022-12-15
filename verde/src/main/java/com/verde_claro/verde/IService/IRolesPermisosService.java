package com.verde_claro.verde.IService;

import com.verde_claro.verde.Collection.RolesPermisos;
import java.util.List;
import java.util.Optional;

public interface IRolesPermisosService {

    public List<RolesPermisos> all();

    public Optional<RolesPermisos> findById(String id);

    public RolesPermisos save(RolesPermisos rolesPermisos);

    public void delete(String id);
}
