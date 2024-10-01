package com.Trial.competition.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.Trial.competition.Model.Books;



public interface BooksRepository extends JpaRepository<Books,ID>{

}
