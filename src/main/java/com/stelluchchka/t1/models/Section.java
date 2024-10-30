package com.stelluchchka.t1.models;
import jakarta.persistence.*;

@Entity
@Table(name = "sections")
public class Section {
    @Id
    private Long secId;

    @Column(nullable = false)
    private String name;

    public Long getSecId() {
        return secId;
    }

    public String getName() {
        return name;
    }
}