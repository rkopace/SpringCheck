package com.example.patient.reg.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.patient.reg.model.Patient;
import com.example.patient.reg.repository.PatientRegRepo;
import com.example.patient.reg.exception.ResourceNotFoundException;
import javax.validation.Valid;
import java.util.List;

@RestController    //@Controller @ResponseBody
@RequestMapping("/api")
public class PatientRegController {

    @Autowired
    PatientRegRepo patientRegRepo;

    // Get All Patients
    @GetMapping("/patients")    // @RequestMapping(value="/notes", method=RequestMethod.GET)
    public List<Patient> getAllPatients() {
        return patientRegRepo.findAll();
    }
    
    // Create a new Patient
    @PostMapping("/patients")
    public Patient createPatient(@Valid @RequestBody Patient patient) {
        return patientRegRepo.save(patient);
    }
    
    // Get a Single Patient
    @GetMapping("/patients/{id}")
    public Patient getPatientById(@PathVariable(value = "id") Long patientId) {
        return patientRegRepo.findById(patientId)
                .orElseThrow(() -> new ResourceNotFoundException("Patient", "id", patientId));
    }
    
    // Update a Patient
    @PutMapping("/patients/{id}")
    public Patient updatePatient(@PathVariable(value = "id") Long patientId,
                                            @Valid @RequestBody Patient patientDetails) {

        Patient patient = patientRegRepo.findById(patientId)
                .orElseThrow(() -> new ResourceNotFoundException("Patient", "id", patientId));
        
        patient.setName(patientDetails.getName());
        /*note.setTitle(noteDetails.getTitle());
        note.setContent(noteDetails.getContent());*/

        Patient updatedPatient = patientRegRepo.save(patient);
        return updatedPatient;
    }
    
    // Delete a Patient
    @DeleteMapping("/patients/{id}")
    public ResponseEntity<?> deletePatient(@PathVariable(value = "id") Long patientId) {
    	Patient patient = patientRegRepo.findById(patientId)
    			.orElseThrow(() -> new ResourceNotFoundException("Patient", "id", patientId));

    	patientRegRepo.delete(patient);

        return ResponseEntity.ok().build();
    }
    
    
    
}
