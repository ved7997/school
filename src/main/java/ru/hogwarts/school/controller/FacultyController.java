package ru.hogwarts.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.FacultyService;

@RestController
@RequestMapping("facultys")
public class FacultyController {

    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping("{id}")
    public Faculty getFacultyInfo(@PathVariable Long id){
        return facultyService.findFaculty(id);
    }

    @PostMapping
    public Faculty createFaculty(@RequestBody Faculty faculty){
        return facultyService.createFaculty(faculty);
    }

    @PutMapping
    public Faculty editFaculty(@RequestBody Faculty faculty){
        return facultyService.editFaculty(faculty);
    }

    @DeleteMapping
    public void deleteFaculty(@RequestParam Long id){
         facultyService.deleteFaculty(id);
    }


}
