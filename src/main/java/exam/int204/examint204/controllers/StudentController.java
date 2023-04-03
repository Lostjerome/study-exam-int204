package exam.int204.examint204.controllers;

import exam.int204.examint204.models.Student;
import exam.int204.examint204.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/init")
    public List<Student> init() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1001, "Jerome", null));
        studentList.add(new Student(1002, "Alice", null));
        studentList.add(new Student(1003, "Bob", null));
        studentList.add(new Student(1004, "Catherine", null));
        studentList.add(new Student(1005, "David", null));
        studentList.add(new Student(1006, "Emily", null));
        studentList.add(new Student(1007, "Frank", null));
        studentList.add(new Student(1008, "Grace", null));
        studentList.add(new Student(1009, "Henry", null));
        studentList.add(new Student(1010, "Isabel", null));
        service.saveAll(studentList);
        return service.getAll();
    }
}
