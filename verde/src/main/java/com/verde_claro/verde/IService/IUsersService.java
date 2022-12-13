package com.verde_claro.verde.IService;

import java.util.List;
import java.util.Optional;

import com.verde_claro.verde.Collection.Users;

public interface IUsersService {
	
	public List<Users> all();
    
	public Optional<Users> findById(String id);
	    
	public Users save(Users users);
	    
	public void delete(String id);
}
