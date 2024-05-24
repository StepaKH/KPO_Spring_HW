package ru.hse.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

    String character;
    String header;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Task(String character, String header){
        this.character = character;
        this.header = header;
    }


    public String getCharacter() {
        return character;
    }

    public String getHeader() {
        return header;
    }

}
