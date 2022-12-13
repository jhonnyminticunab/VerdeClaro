package com.verde_claro.verde.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verde_claro.verde.Collection.Departments;
import com.verde_claro.verde.IRepository.IDepartmentsRepository;
import com.verde_claro.verde.IService.IDepartmentsService;


@Service
public class DepartmentsService implements IDepartmentsService{
	
	@Autowired
	private IDepartmentsRepository repository; 
	
	@Override
	public List<Departments> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Departments> findById(String id) {		
		return repository.findById(id);
	}

	@Override
	public Departments save(Departments departments) {		
		return repository.save(departments);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);		
	}

}
