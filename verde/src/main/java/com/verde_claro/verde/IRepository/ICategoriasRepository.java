package com.verde_claro.verde.IRepository;

import com.verde_claro.verde.Collection.Categorias;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICategoriasRepository extends MongoRepository<Categorias, String> {
}
