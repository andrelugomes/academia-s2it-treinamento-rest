package br.com.s2it.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import br.com.s2it.entity.Todo;

public interface TodoRepository extends Repository<Todo, String> {
  
  void delete(Todo deleted);

  List<Todo> findAll();

  Optional<Todo> findOne(String id);

  Todo save(Todo saved);
  
}
