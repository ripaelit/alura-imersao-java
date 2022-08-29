package br.com.alura.languagesapi.repositories;

import br.com.alura.languagesapi.entities.Language;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Language, String> {
    
}
