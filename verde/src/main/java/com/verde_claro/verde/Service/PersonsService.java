package com.verde_claro.verde.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verde_claro.verde.Collection.Persons;
import com.verde_claro.verde.IRepository.IPersonsRepository;
import com.verde_claro.verde.IService.IPersonsService;


@Service
public class PersonsService implements IPersonsService{
	
	@Autowired
	private IPersonsRepository repository; 
	
	@Override
	public List<Persons> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Persons> findById(String id) {		
		return repository.findById(id);
	}

	@Override
	public Persons save(Persons persons) {		
		return repository.save(persons);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);		
	}

}
