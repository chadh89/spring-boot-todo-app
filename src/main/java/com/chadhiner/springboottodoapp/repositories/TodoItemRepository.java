package com.chadhiner.springboottodoapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.chadhiner.springboottodoapp.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
    
}
