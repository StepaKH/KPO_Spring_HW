package ru.hse.demo.Server;


import org.springframework.beans.factory.annotation.Autowired;
import ru.hse.demo.Repository.Repository;
import ru.hse.demo.Task;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository repository;

    public List<Task> getAll(){
        return repository.findAll();
    }

    public Task add(String character, String header){
        Task task = new Task(character, header);
        return repository.save(task);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
