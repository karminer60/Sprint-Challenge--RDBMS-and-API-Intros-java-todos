package com.lambdaschool.todos.models;

import javax.persistence.*;

@Entity
@Table(name = "todos" )
public class Todos
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoid;
    private String description;
    private boolean completed;

}
