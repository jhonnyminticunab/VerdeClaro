package com.verde_claro.verde.IService;

import java.util.List;
import java.util.Optional;

import com.verde_claro.verde.Collection.Departments;

public interface IDepartmentsService {
	
	public List<Departments> all();
    
	public Optional<Departments> findById(String id);
	    
	public Departments save(Departments departments);
	    
	public void delete(String id);
}
