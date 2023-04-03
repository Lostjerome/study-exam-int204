package exam.int204.examint204.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class StudentGrade {
    @Id
    private Integer gradeId;
    private Integer subjectID;
    private Integer studentID;

    private Double grade;
}
