package exam.int204.examint204.repositories;

import exam.int204.examint204.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
