package com.baeldun.persistence.repository.impl;


import com.baeldun.persistence.model.Project;
import com.baeldun.persistence.repository.IProjectRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectRepositoryImpl implements IProjectRepository {
    List<Project> projectList = new ArrayList<>();

    @Override
    public Optional<Project> findById(Long id) {
        return projectList.stream().filter(project -> project.getId() == id).findFirst();
    }

    @Override
    public Project save(Project project) {
        Project exestingProject = findById(project.getId()).orElse(null);
        if (exestingProject==null) {
            projectList.add(project);
        } else {
            projectList.remove(project);
            Project newProject = new Project(project);
            projectList.add(newProject);
        }
        return project;
    }
}
