package ru.hse.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import ru.hse.demo.Repository.Repository;
import ru.hse.demo.Server.Service;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ServiceTests {

    @Mock
    private Repository repository;

    @InjectMocks
    private Service service;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getAllTests() {
        Task task1 = new Task("Character", "Header");
        Task task2 = new Task("Character1", "Header1");

        when(repository.findAll()).thenReturn(Arrays.asList(task1, task2));

        List<Task> arr = service.getAll();
        assertEquals(2, arr.size());
        assertEquals("Character", arr.get(0).getCharacter());
        assertEquals("Header", arr.get(0).getHeader());
    }

    @Test
    public void addTests() {
        Task task = new Task("Character", "Header");

        when(repository.save(any(Task.class))).thenReturn(task);

        Task arr = service.add("Character", "Header");
        assertNotNull(arr);
        assertEquals("Character", arr.getCharacter());
        assertEquals("Header", arr.getHeader());
    }

    @Test
    public void deleteTests() {
        Long id = 1L;

        doNothing().when(repository).deleteById(id);

        service.delete(id);

        verify(repository, times(1)).deleteById(id);
    }

}
