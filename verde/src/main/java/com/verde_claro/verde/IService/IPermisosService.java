package com.verde_claro.verde.IService;

import com.verde_claro.verde.Collection.Permisos;
import java.util.List;
import java.util.Optional;

public interface IPermisosService {

    public List<Permisos> all();

    public Optional<Permisos> findById(String id);

    public Permisos save(Permisos permisos);

    public void delete(String id);
}
