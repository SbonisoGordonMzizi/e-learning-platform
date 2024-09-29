package co.za.mzizi.jpa.repositories;

import co.za.mzizi.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<Author, UUID> {
}
