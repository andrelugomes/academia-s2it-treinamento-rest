package br.com.s2it.service;

import java.util.List;

import br.com.s2it.dto.TodoDTO;

public interface TodoService {
  
  TodoDTO create(TodoDTO todo);
  
  TodoDTO delete(String id);

  List<TodoDTO> findAll();

  TodoDTO findById(String id);

  TodoDTO update(TodoDTO todo);
}
