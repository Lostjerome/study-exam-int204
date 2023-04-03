package exam.int204.examint204.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student {

    @Id
    private Integer studentId;
    private String name;

    @OneToMany(mappedBy = "studentID")
    private Set<StudentGrade> grade;
}
