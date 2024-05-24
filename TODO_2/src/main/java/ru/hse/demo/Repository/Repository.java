package ru.hse.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hse.demo.Task;

public interface Repository extends JpaRepository<Task, Long> {
}
