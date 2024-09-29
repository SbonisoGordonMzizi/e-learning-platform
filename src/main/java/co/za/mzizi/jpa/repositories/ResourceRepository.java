package co.za.mzizi.jpa.repositories;

import co.za.mzizi.jpa.models.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ResourceRepository extends JpaRepository<Resource, UUID> {
}
