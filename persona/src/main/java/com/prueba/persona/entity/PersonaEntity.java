package com.prueba.persona.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table(name = "persona", schema = "public")
@Data
public class PersonaEntity {
	
	@Id
	@SequenceGenerator(name = "PERSONA_GENERATOR", sequenceName = "public.persona_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSONA_GENERATOR")
    @Column(name = "id")
    private Long id;
	
	
	@Column(name = "numero_documento")
	private String numeroDocumento;
	
	@Column(name = "edad")
    private Long edad;
	
	
	@Column(name = "nombre")
	private String nombre;
	
}
