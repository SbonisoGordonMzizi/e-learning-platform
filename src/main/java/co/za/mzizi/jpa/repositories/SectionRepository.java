package co.za.mzizi.jpa.repositories;

import co.za.mzizi.jpa.models.Section;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SectionRepository extends JpaRepository<Section, UUID> {
}
