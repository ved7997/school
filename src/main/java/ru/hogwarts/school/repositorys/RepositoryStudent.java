package ru.hogwarts.school.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hogwarts.school.model.Student;

import java.util.Collection;

@Repository
public interface RepositoryStudent extends JpaRepository<Student, Long> {

//    Student getById(Long id);
//
   Collection<Student> findByName(String name);
//
//    Collection<Student>fainByAgeBetween(int min, int max);

}
