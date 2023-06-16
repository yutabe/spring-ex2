package com.example.web.response;

import java.time.LocalDateTime;

public class TodoResponse {

    private Integer id;

    private String description;

    private LocalDateTime deadline;

    private Boolean done;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public TodoResponse(Integer id, String description, LocalDateTime deadline, Boolean done, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.description = description;
        this.deadline = deadline;
        this.done = done;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public Boolean getDone() {
        return done;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
