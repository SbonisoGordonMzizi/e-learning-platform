package co.za.mzizi.jpa.models;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@Entity
@SuperBuilder
@Table(name = "course_tbl")
public class Course extends BaseEntity {

    @ManyToMany
    @JoinTable(
            name = "authors_courses",
            joinColumns = {
                    @JoinColumn(name = "course_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }
    )
    private List<Author> authors;

    @OneToMany(mappedBy = "course")
    private List<Section> sections;

    @Column(
            nullable = false,
            length = 100
    )
    private String title;

    @Column(
            nullable = false
    )
    private String description;

    @Column(
            nullable = false
    )
    private LocalDateTime publishedDate;

}
