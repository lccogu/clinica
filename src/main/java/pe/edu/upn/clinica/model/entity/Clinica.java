package pe.edu.upn.clinica.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clinica")
public class Clinica {
	
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private String id;
			
			@Column(name = "nombre")
			private String nombre;
			
			@Column(name = "dir_paciente", length = 50, nullable = true)
			private String direccion;
			
			@Column(name = "Telefono")
			private Integer telefono;
			
			@OneToMany(mappedBy = "horario")
			private List<HorarioAtencion> horarioatencion;

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public String getDireccion() {
				return direccion;
			}

			public void setDireccion(String direccion) {
				this.direccion = direccion;
			}

			public Integer getTelefono() {
				return telefono;
			}

			public void setTelefono(Integer telefono) {
				this.telefono = telefono;
			}

			public List<HorarioAtencion> getHorarioatencion() {
				return horarioatencion;
			}

			public void setHorarioatencion(List<HorarioAtencion> horarioatencion) {
				this.horarioatencion = horarioatencion;
			}
			
			

			


			
			

}
