package com.chadhiner.springboottodoapp.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "todo_item")
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @NotBlank(message = "Please enter a description")
    private String description;

    @Getter
    @Setter
    private boolean complete;

    @Getter
    @Setter
    private String createdDate;

    @Getter
    @Setter
    private String modifiedDate;

    public TodoItem() {}

    public TodoItem(String description) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss a");

        this.description = description;
        this.complete = false;
        this.createdDate = now.format(formatter);
        this.modifiedDate = now.format(formatter);
    }

    @Override
    public String toString() {
        return String.format("TodoItem{id='%d', description='%s', complete='%s', createdDate='%s', modifiedDate='%s'}",
        id, description, complete, createdDate, modifiedDate);
    }
}
