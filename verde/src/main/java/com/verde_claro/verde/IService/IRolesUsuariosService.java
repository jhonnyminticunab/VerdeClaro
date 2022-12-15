package com.verde_claro.verde.IService;

import com.verde_claro.verde.Collection.RolesUsuarios;
import java.util.List;
import java.util.Optional;

public interface IRolesUsuariosService {

    public List<RolesUsuarios> all();

    public Optional<RolesUsuarios> findById(String id);

    public RolesUsuarios save(RolesUsuarios rolesUsuarios);

    public void delete(String id);
}
