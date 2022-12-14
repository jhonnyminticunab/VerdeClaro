package com.verde_claro.verde.Service;

import com.verde_claro.verde.Collection.Marcas;
import com.verde_claro.verde.IRepository.IMarcasRepository;
import com.verde_claro.verde.IService.IMarcasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcasService implements IMarcasService {

    @Autowired
    private IMarcasRepository repository;

    @Override
    public List<Marcas> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Marcas> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Marcas save(Marcas marcas) {
        return repository.save(marcas);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
