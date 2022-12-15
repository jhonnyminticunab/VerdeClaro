package com.verde_claro.verde.Service;

import com.verde_claro.verde.Collection.RolesPermisos;
import com.verde_claro.verde.IRepository.IRolesPermisosRepository;
import com.verde_claro.verde.IService.IRolesPermisosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolesPermisosService implements IRolesPermisosService {

    @Autowired
    private IRolesPermisosRepository repository;

    @Override
    public List<RolesPermisos> all(){
        return repository.findAll();
    }

    @Override
    public Optional<RolesPermisos> findById(String id){
        return repository.findById(id);
    }

    @Override
    public RolesPermisos save(RolesPermisos rolesPermisos){
        return repository.save(rolesPermisos);
    }

    @Override
    public void delete(String id){
        repository.deleteById(id);
    }

}
