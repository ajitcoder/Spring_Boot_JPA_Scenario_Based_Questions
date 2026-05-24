package com.ajit.repository;

import org.springframework.data.repository.CrudRepository;

import com.ajit.entity.Course;

public interface ICourseRepository extends CrudRepository<Course, Integer> {

}
