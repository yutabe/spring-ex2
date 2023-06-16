package com.example.web.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class TodoRequest {

    @NotBlank
    @Size(min = 1, max = 255)
    private String description;

    @NotBlank
    @PastOrPresent
    private LocalDate deadline;

    private Boolean done;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

//    @AssertTrue
//    public boolean isJoinedDateGreaterThanBirthDay() {
//        if (joinedDate != null && birthDay != null) {
//            return joinedDate.isAfter(birthDay);
//        }
//        return true;
//    }
}
