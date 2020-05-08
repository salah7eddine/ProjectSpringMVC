package org.shm.springmvc;

import java.util.Date;

import org.shm.springmvc.dao.PatientRepository;
import org.shm.springmvc.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmvcApplication implements CommandLineRunner {

	
	@Autowired
	private PatientRepository patientRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		patientRepository.save(new Patient(null, "Mizo Mizo", new Date(), false, 6));
		patientRepository.save(new Patient(null, "Mery Mery", new Date(), false, 7));
		patientRepository.save(new Patient(null, "Mum Mom MM", new Date(), false, 9));
		patientRepository.save(new Patient(null, "dad Father", new Date(), false, 8));
	
		
		patientRepository.findAll().forEach(p -> {
			System.out.println(p.getName());
		});
	
	}

}
