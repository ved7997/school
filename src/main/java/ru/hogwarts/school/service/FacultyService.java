package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.repositorys.repositoryFaculty;

import java.util.HashMap;
@Service
public class FacultyService {
    private repositoryFaculty repositoryFaculty;

    public FacultyService(repositoryFaculty repositoryFaculty) {
        this.repositoryFaculty = repositoryFaculty;
    }

    public Faculty createFaculty (Faculty faculty){
         return repositoryFaculty.save(faculty);
    }

    public Faculty findFaculty (long id){
        return repositoryFaculty.findById(id).get();
    }

    public Faculty editFaculty (Faculty faculty){
        return repositoryFaculty.save(faculty);
    }

    public void deleteFaculty (long id){
         repositoryFaculty.deleteById(id);
    }
}
