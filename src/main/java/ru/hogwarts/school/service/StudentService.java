package ru.hogwarts.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.repositorys.repositoryStudent;

import java.util.HashMap;

@Service
public class StudentService {
    private final repositoryStudent repositoryStudent;

    public StudentService(repositoryStudent repositoryStudent) {
        this.repositoryStudent = repositoryStudent;
    }

    public Student createStudent (Student student){
        return repositoryStudent.save(student);
    }

    public Student findStudent (Long id){
        return repositoryStudent.findById(id).get();
    }

    public Student editStudent (Student student){
        return repositoryStudent.save(student);
    }

    public void deleteStudent (Long id){
       repositoryStudent.deleteById(id);
    }
}
