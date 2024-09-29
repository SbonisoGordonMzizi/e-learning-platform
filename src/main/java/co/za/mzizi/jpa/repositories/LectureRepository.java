package co.za.mzizi.jpa.repositories;

import co.za.mzizi.jpa.models.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LectureRepository extends JpaRepository<Lecture, UUID> {
}
