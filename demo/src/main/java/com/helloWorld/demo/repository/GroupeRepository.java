package com.helloWorld.demo.repository;

import com.helloWorld.demo.model.Groupes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupeRepository extends JpaRepository<Groupes, Long> {
    List<Groupes> findByNameContaining(String Wanted);

}
