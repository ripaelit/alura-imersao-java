package br.com.alura.languagesapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Language, String> {
    
}
