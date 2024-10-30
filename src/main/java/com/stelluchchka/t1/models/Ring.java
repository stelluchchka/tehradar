package com.stelluchchka.t1.models;
import jakarta.persistence.*;

@Entity
@Table(name = "rings")
public class Ring {
    @Id
    private Long ringId;

    @Column(nullable = false)
    private String name;

    public Ring() {}

    public Ring(String adopt) {
        this.name = adopt;
    }

    public Long getRingId() {
        return ringId;
    }

    public void setRingId(Long catId) {
        this.ringId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}