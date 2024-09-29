package co.za.mzizi.jpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@Data
@SuperBuilder
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(
            nullable = false,
            updatable = false
    )
    private LocalDateTime createdAt;

    @Column(
            nullable = false,
            updatable = false
    )
    private LocalDateTime updatedAt;

    @Column(
            nullable = false,
            length = 100
    )
    private String createdBy;

    @Column(
            nullable = false,
            length = 100
    )
    private String updatedBy;
}
