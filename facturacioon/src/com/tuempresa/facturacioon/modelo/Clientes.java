package com.tuempresa.facturacioon.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter

public class Clientes {
	@Id @Column(length=9)
	int numero;
	@Column(length=50) @Required
	String descripcion;
	
	
	
	
	
	
	
	
	
	
	
	
}
