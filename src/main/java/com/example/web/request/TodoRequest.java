package com.example.web.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class TodoRequest {

    @NotBlank
    @Size(min = 1, max = 255)
    private String description;

    @NotBlank
    @PastOrPresent
    private LocalDateTime deadline;

    @NotBlank
    private Boolean done;

    @NotBlank
    @PastOrPresent
    private LocalDateTime createdAt;

    @NotBlank
    @PastOrPresent
    private LocalDateTime updatedAt;

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


//    @AssertTrue
//    public boolean isJoinedDateGreaterThanBirthDay() {
//        if (joinedDate != null && birthDay != null) {
//            return joinedDate.isAfter(birthDay);
//        }
//        return true;
//    }
}
