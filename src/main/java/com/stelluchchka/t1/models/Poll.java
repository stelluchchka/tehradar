package com.stelluchchka.t1.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import com.stelluchchka.t1.models.*;


@Entity
@Table(name = "polls")
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pollId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonManagedReference
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tech_id")
    @JsonManagedReference
    private Technology technology;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ring_id")
    @JsonManagedReference
    private Ring ring;

    @Column(nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private LocalDateTime time;


    @JsonManagedReference
    public Long getPollId() {
        return pollId;
    }

    @JsonManagedReference
    public User getUser() {
        return user;
    }

    @JsonManagedReference
    public Technology getTechnology() {
        return technology;
    }

    @JsonManagedReference
    public Ring getRing() {
        return ring;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    public LocalDateTime getTime() {
        return time;
    }

    public void setPollId(Long pollId) {
        this.pollId = pollId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public void setRing(Ring ring) {
        this.ring = ring;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}