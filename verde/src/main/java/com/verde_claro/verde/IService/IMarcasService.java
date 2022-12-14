package com.verde_claro.verde.IService;

import com.verde_claro.verde.Collection.Marcas;

import java.util.List;
import java.util.Optional;

public interface IMarcasService {

    public List<Marcas> all();

    public Optional<Marcas> findById(String id);

    public Marcas save(Marcas cities);

    public void delete(String id);
}
