package com.wemanity.todo_list.repositories;

import java.util.List;

import com.wemanity.todo_list.entities.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByIsDone(boolean isDone);
    List<Todo> findByTitleContaining(String title);
  }