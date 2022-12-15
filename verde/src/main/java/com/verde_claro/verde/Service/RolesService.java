package com.verde_claro.verde.Service;


import com.verde_claro.verde.Collection.Roles;
import com.verde_claro.verde.IRepository.IRolesRepository;
import com.verde_claro.verde.IService.IRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolesService implements IRolesService {

    @Autowired
    private IRolesRepository repository;

    @Override
    public List<Roles> all(){
        return repository.findAll();
    }

    @Override
    public Optional<Roles> findById(String id){
        return repository.findById(id);
    }

    @Override
    public Roles save(Roles roles){
        return repository.save(roles);
    }

    @Override
    public void delete(String id){
        repository.deleteById(id);
    }
}
