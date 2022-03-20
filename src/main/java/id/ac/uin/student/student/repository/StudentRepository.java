package id.ac.uin.student.student.repository;

import id.ac.uin.student.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // Query method
    Optional<Student> findByEmail(String email);

    List<Student> findAll();

    Optional<Student> findById(Long id);
}
