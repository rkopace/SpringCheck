package com.example.patient.reg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.patient.reg.model.Patient;

@Repository
public interface PatientRegRepo extends JpaRepository<Patient, Long> {
//https://docs.spring.io/autorepo/docs/spring-data-jpa/current/api/org
//	/springframework/data/jpa/repository/support/SimpleJpaRepository.html
}
