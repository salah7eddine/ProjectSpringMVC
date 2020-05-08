package org.shm.springmvc.web;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.shm.springmvc.dao.PatientRepository;
import org.shm.springmvc.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientRestController {
	@Autowired
	private PatientRepository patientRepository;
	
	@GetMapping("listPatients")
	public List<Patient> list() {
		return patientRepository.findAll();
	}
	
	@GetMapping("patients/{id}")
	public Patient getOne(@PathVariable Long id) {
		return patientRepository.findById(id).get();
	}
}
