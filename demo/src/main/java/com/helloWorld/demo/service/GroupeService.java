package com.helloWorld.demo.service;

import com.helloWorld.demo.model.Groupes;
import com.helloWorld.demo.repository.GroupeRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.domain.Sort.Direction.DESC;

public class GroupeService {
    public List<Groupes> getType(int page, int page_size) {
        Pageable pageable = PageRequest.of(page, page_size, Sort.by(DESC, "price"));
        return GroupeRepository.findAll(pageable).toList();
    }

    public Optional<Groupes> getTypeById(Long id) {
        return GroupeRepository.findById(id);
    }

    public String addGroupes(List<Groupes> Groupe) {
        GroupeRepository.saveAll(Groupe);
        return "Type successfully added";
    }
    public Groupes updateType(Groupes toUpdate) {
        return GroupeRepository.save(toUpdate);
    }

}


