package com.verde_claro.verde.IService;

import com.verde_claro.verde.Collection.UnidadesMedidas;

import java.util.List;
import java.util.Optional;

public interface IUnidadesMedidasService {

    public List<UnidadesMedidas> all();

    public Optional<UnidadesMedidas> findById(String id);

    public UnidadesMedidas save(UnidadesMedidas cities);

    public void delete(String id);
}
