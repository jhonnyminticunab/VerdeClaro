package com.verde_claro.verde.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verde_claro.verde.Collection.Users;
import com.verde_claro.verde.IRepository.IUsersRepository;
import com.verde_claro.verde.IService.IUsersService;


@Service
public class UsersService implements IUsersService{
	
	@Autowired
	private IUsersRepository repository; 
	
	@Override
	public List<Users> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Users> findById(String id) {		
		return repository.findById(id);
	}

	@Override
	public Users save(Users users) {		
		return repository.save(users);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);		
	}

}
