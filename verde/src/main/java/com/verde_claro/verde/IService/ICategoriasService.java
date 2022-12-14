package com.verde_claro.verde.IService;

import com.verde_claro.verde.Collection.Categorias;

import java.util.List;
import java.util.Optional;

public interface ICategoriasService {

    public List<Categorias> all();

    public Optional<Categorias> findById(String id);

    public Categorias save(Categorias categorias);

    public void delete(String id);
}
