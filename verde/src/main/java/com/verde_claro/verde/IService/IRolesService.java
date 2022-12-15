package com.verde_claro.verde.IService;

import com.verde_claro.verde.Collection.Roles;
import java.util.List;
import java.util.Optional;

public interface IRolesService {

    public List<Roles> all();

    public Optional<Roles> findById(String id);

    public Roles save(Roles roles);

    public void delete(String id);
}
