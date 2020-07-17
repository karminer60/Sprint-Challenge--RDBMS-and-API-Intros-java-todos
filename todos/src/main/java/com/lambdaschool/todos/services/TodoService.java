package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todo;

public interface TodoService
{
    void markComplete(long todoid);

    Todo save(Todo todo);
}
