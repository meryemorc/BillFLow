package com.billflow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ping {

    @Id
    private Long id;
    private String message;

    // Getter ve Setter (Lombok varsa @Data da olur)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
