package com.verde_claro.verde.Service;

import com.verde_claro.verde.Collection.Permisos;
import com.verde_claro.verde.IRepository.IPermisosRepository;
import com.verde_claro.verde.IService.IPermisosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermisosService implements IPermisosService {

    @Autowired
    private IPermisosRepository repository;

    @Override
    public List<Permisos> all(){
        return repository.findAll();
    }

    @Override
    public Optional<Permisos> findById(String id){
        return repository.findById(id);
    }

    @Override
    public Permisos save(Permisos permisos){
        return repository.save(permisos);
    }

    @Override
    public void delete(String id){
        repository.deleteById(id);
    }
}
