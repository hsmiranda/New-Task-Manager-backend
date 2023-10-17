package com.tmb.application.core.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


public class Task {

    private Long id;

    private String name;

    private String description;

    private Date dateDue;

    private Boolean isPast;

    public Task() {
    }

    public Task(Long id, String name, String description, Date dateDue, Boolean isPast) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateDue = dateDue;
        this.isPast = isPast;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }

    public Boolean getPast() {
        return isPast;
    }

    public void setPast(Boolean past) {
        isPast = past;
    }
}
