package com.verde_claro.verde.IService;

import java.util.List;
import java.util.Optional;

import com.verde_claro.verde.Collection.Cities;

public interface ICitiesService {
	
	public List<Cities> all();
    
	public Optional<Cities> findById(String id);
	    
	public Cities save(Cities cities);
	    
	public void delete(String id);
}
