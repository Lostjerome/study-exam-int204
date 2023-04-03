package exam.int204.examint204.services;

import exam.int204.examint204.models.Student;
import exam.int204.examint204.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public void save(Student student) {
        repository.save(student);
    }

    public void saveAll(List<Student> students) {
        repository.saveAllAndFlush(students);
    }

    public List<Student> getAll() {
        return repository.findAll();
    }
}
