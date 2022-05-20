package ru.hogwarts.school.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hogwarts.school.model.Student;
@Repository
public interface repositoryStudent extends JpaRepository<Student, Long> {

}
