package com.stelluchchka.t1.models;
import jakarta.persistence.*;

@Entity
@Table(name = "statuses")
public class Status {
    @Id
    private Long statId;

    @Column(nullable = false)
    private String name;

    public Long getStatId() {
        return statId;
    }

    public String getName() {
        return name;
    }
}