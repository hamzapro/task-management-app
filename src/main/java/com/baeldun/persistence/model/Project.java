package com.baeldun.persistence.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private Long id;
    private String name;
    private LocalDate dateCreated;

    public Project(Project project) {
        this(project.id,project.name,project.dateCreated);
    }
}
