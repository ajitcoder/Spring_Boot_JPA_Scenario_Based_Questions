package com.ajit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajit.entity.Project;

public interface IProjectRepository extends JpaRepository<Project, Integer> {

}