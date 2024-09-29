package co.za.mzizi.jpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@Entity
@SuperBuilder
@Table(name = "lecture_tbl")
public class Lecture extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;

    @Column(
            nullable = false,
            length = 100
    )
    private String name;

    @Column(
            nullable = false
    )
    private Integer duration;
}
