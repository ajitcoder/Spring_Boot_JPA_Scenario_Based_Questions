package com.ajit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajit.entity.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Integer> {

}