package com.ajit.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajit.entity.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Integer> {

	List<Patient> findByDisease(String disease);
	List<Patient> findByDoctorName(String doctor);
	List<Patient> findByAgeGreaterThan(int age);
	
	List<Patient> findByAdmissionDateGreaterThan(LocalDate date);
	List<Patient> findByDischargedFalse(boolean active);
	
}