package co.za.mzizi.jpa.repositories;

import co.za.mzizi.jpa.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, UUID> {
}
