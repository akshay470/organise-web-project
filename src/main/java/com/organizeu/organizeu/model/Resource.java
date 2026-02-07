package com.organizeu.organizeu.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

// Marks this class as a JPA entity mapped to the "resources" table
@Entity
@Table(name = "resources")
public class Resource {

    // Primary key with auto-generated value
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Resource title is mandatory
    @Column(nullable = false)
    private String title;

    @Column(length = 1000)
    private String description;

    // Category helps in organizing resources
    @Column(nullable = false)
    private String category;

    // Stores the file location or path
    @Column(nullable = false)
    private String filePath;

    // Many resources can belong to one user (owner)
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User owner;

    // Timestamp when the resource was created
    @Column(nullable = false)
    private LocalDateTime createdAt;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
