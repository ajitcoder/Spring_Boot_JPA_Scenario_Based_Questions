package com.ajit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ajit.entity.Student;

public interface IStudentRepository extends CrudRepository<Student, Integer>, PagingAndSortingRepository<Student, Integer> {

}