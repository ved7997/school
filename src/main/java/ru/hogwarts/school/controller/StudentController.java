package ru.hogwarts.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.StudentService;

import java.util.Collection;

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
//
//   @GetMapping
////    public Collection<Student> findStudent(){
////
////    }
   @GetMapping
    public Collection<Student> faindByName(@RequestParam String name){
        return studentService.findByName(name);
    }

//    @GetMapping
//    public Collection<Student> findStudent(@RequestParam int min, @RequestParam int max){
//        return studentService.fainByAgeBetween(min, max);
//    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PutMapping
    public Student editStudent(@RequestBody Student student){
        return studentService.editStudent(student);
    }

    @DeleteMapping("{id}")
    public  void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
