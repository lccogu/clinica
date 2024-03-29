package pe.edu.upn.clinica.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.clinica.model.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String>{
	
	List<Doctor> findByNombre(String nombre);

}
