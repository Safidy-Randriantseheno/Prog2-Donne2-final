package com.helloWorld.demo.controller;

import com.helloWorld.demo.model.Groupes;
import com.helloWorld.demo.repository.GroupeRepository;
import com.helloWorld.demo.service.GroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class GroupeController {
    @Autowired
    private GroupeRepository repository;

    @GetMapping("/Groupes")
    public List<Groupes> getAllGroupes(){

        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Groupes> getGroupesById(
            @PathVariable Long id
    ) {
        return GroupeService.getGroupesById(id);
    }
    @GetMapping("/{id}")
    public Optional<Groupes> getGroupeById(
            @PathVariable Long id
    ) {
        return GroupeService.getGroupeById(id);
    }
}
