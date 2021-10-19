package com.baeldun.service.impl;

import com.baeldun.persistence.model.Project;
import com.baeldun.persistence.repository.IProjectRepository;
import com.baeldun.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProjectServiceImpl implements IProjectService {

    @Autowired
    IProjectRepository iProjectRepository;

    @Override
    public Optional<Project> findById(Long id) {
        return iProjectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return iProjectRepository.save(project);
    }
}
