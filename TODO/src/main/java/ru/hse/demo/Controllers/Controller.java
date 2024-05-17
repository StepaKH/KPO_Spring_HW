package ru.hse.demo.Controllers;

import ru.hse.demo.Task;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    public List<Task> arr = new ArrayList<>();

    @MutationMapping
    public Task createTask(@Argument String character, @Argument String header){
        Task task = new Task(character, header);
        arr.add(task);
        return task;
    }

    @QueryMapping
    public List<Task> findAll(){
        return arr;
    }
}

