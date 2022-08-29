package br.com.alura.languagesapi.controllers;

import java.util.List;

import br.com.alura.languagesapi.entities.Language;
import br.com.alura.languagesapi.repositories.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Repository repository;

    @GetMapping("/languages")
    public List<Language> getLanguages() {
        List<Language> languages = repository.findAll();
        return languages;
    }

    @PostMapping("/languages")
    public Language registerLanguage(@RequestBody Language language) {
        Language saveLanguage = repository.save(language);
        return saveLanguage;
    }

}
