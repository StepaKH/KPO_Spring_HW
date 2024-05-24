package ru.hse.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.hse.demo.Server.Service;
import ru.hse.demo.Task;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @MutationMapping
    public Task addTask(@Argument String character, @Argument String header){
        return service.add(character, header);
    }

    @QueryMapping
    public List<Task> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/tasks/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}

