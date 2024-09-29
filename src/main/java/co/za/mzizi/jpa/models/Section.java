package co.za.mzizi.jpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@Entity
@SuperBuilder
@Table(name = "section_tbl")
public class Section extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;
    @Column(
            nullable = false,
            length = 100
    )
    private String name;

    @Column(
            nullable = false
    )
    private Integer orders;
}
