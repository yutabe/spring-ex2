package com.example.persistence.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Todo {

    private Integer id;

    private String description;

    private LocalDateTime deadline;

    private Boolean done;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public Todo() {

    }

    public Todo(Integer id, String description, LocalDateTime deadline, Boolean done, LocalDateTime createdAt, LocalDateTime updatedAt) {
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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
    	this.description = description;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
    	this.deadline = deadline;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
    	this.done = done;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
    	this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
    	this.updatedAt = updatedAt;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", deadline='" + deadline + '\'' +
                ", done='" + done + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(id, todo.id) && Objects.equals(description, todo.description) && Objects.equals(deadline, todo.deadline) && Objects.equals(done, todo.done) && Objects.equals(createdAt, todo.createdAt) && Objects.equals(updatedAt, todo.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, deadline, done, createdAt, updatedAt);
    }
}
