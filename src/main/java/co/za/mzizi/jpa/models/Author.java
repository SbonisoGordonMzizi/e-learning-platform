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
@Table(name = "author_tbl")
public class Author extends BaseEntity {

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

    @Column(
            length = 100,
            nullable = false
    )
    private String firstName;

    @Column(
            length = 100,
            nullable = false
    )
    private String lastName;
    @Column(
            length = 100,
            nullable = false,
            unique = true
    )
    private String email;
    @Column(
            length = 3,
            nullable = false
    )
    private Integer age;

}
