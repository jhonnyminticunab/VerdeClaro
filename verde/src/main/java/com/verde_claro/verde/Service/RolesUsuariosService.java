package com.verde_claro.verde.Service;

import com.verde_claro.verde.Collection.RolesUsuarios;
import com.verde_claro.verde.IRepository.IRolesUsuariosRepository;
import com.verde_claro.verde.IService.IRolesUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolesUsuariosService implements IRolesUsuariosService {

    @Autowired
    private IRolesUsuariosRepository repository;

    @Override
    public List<RolesUsuarios> all(){
        return repository.findAll();
    }

    @Override
    public Optional<RolesUsuarios> findById(String id){
        return repository.findById(id);
    }

    @Override
    public RolesUsuarios save(RolesUsuarios rolesUsuarios){
        return repository.save(rolesUsuarios);
    }

    @Override
    public void delete(String id){
        repository.deleteById(id);
    }
}
