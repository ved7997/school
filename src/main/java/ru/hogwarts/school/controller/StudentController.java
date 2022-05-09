package ru.hogwarts.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.StudentService;

@RestController
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("{id}")
    public Student getStudentInfo(@PathVariable Long id){
        return studentService.findStudent(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PutMapping
    public Student editStudent(@RequestBody Student student){
        return studentService.editStudent(student);
    }

    @DeleteMapping
    public Student deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }
}
