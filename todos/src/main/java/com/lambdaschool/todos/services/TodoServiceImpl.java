package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todo;
import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "todosService")
public class TodoServiceImpl implements TodoService
{
    @Autowired
    private TodoRepository todosrepos;

    @Override
    public void markComplete(long todoid)
    {
        Todo todo = todosrepos.findById(todoid)
                .orElseThrow(() -> new EntityNotFoundException("Todo " + todoid + " Not Found"));

        todo.setCompleted(true);


    }
}
