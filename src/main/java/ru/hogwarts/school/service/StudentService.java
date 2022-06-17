package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.repositorys.RepositoryStudent;

import java.util.Collection;

@Service
public class StudentService {
    private final RepositoryStudent repositoryStudent;

    public StudentService(RepositoryStudent repositoryStudent) {
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

    public Collection<Student> getAllStudents(){
        return repositoryStudent.findAll();
    }

    public Collection<Student> findByName(String name){
       return repositoryStudent.findByName(name);
    }
//
//    public Collection<Student> fainByAgeBetween(int min, int max){
//        return repositoryStudent.fainByAgeBetween(min, max);
//    }
}
