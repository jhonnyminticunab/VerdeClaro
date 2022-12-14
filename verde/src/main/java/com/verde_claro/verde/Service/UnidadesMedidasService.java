package com.verde_claro.verde.Service;

import com.verde_claro.verde.Collection.UnidadesMedidas;
import com.verde_claro.verde.IRepository.IUnidadesMedidasRepository;
import com.verde_claro.verde.IService.IUnidadesMedidasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnidadesMedidasService implements IUnidadesMedidasService {

    @Autowired
    private IUnidadesMedidasRepository repository;

    @Override
    public List<UnidadesMedidas> all() {
        return repository.findAll();
    }

    @Override
    public Optional<UnidadesMedidas> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public UnidadesMedidas save(UnidadesMedidas unidadesMedidas) {
        return repository.save(unidadesMedidas);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}