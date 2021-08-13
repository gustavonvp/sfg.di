package com.sfgdi.sfgdi.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{

    @Column(name="date")
    private LocalDate date;

    @Column(name="description")
    private String description;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    public LocalDate getDate() {
        return date;
    }

}
