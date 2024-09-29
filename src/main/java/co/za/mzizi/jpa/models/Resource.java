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
@Table(name = "Resource_tbl")
public class Resource  extends BaseEntity{


    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

    @Column(
            length = 100,
            nullable = false
    )
    private String name;

    @Column(
            nullable = false
    )
    private Integer size;
    @Column(
            nullable = false
    )
    private Integer url;

}
