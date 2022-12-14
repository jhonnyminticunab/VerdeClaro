package com.verde_claro.verde.IRepository;

import com.verde_claro.verde.Collection.UnidadesMedidas;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUnidadesMedidasRepository extends MongoRepository<UnidadesMedidas, String> {
}
