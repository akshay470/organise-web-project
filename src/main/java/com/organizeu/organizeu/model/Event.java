package com.organizeu.organizeu.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

// Marks this class as a JPA entity mapped to a database table
@Entity
@Table(name = "events")
public class Event {

    // Primary key with auto-increment strategy
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Event title is mandatory
    @Column(nullable = false)
    private String title;

    @Column
    private String description;

    // Start date and time of the event
    @Column(nullable = false)
    private LocalDateTime startAt;

    // End date and time of the event
    @Column(nullable = false)
    private LocalDateTime endAt;

    @Column
    private String location;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStartAt() {
        return startAt;
    }

    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }

    public LocalDateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
