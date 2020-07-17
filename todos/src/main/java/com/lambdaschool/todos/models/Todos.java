package com.lambdaschool.todos.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "todos" )
public class Todos
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoid;
    private String description;


    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    private User user;

    public Todos( User user, String description) {

        this.description = description;

        this.user = user;
    }

    public Todos()
    {
        //default constructor
    }

    public long getTodoid() {
        return todoid;
    }

    public void setTodoid(long todoid) {
        this.todoid = todoid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
