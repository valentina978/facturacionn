package com.tuempresa.facturacioon.modelo;



import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Producto {

	@Id @Column(length=9)
	int numero;
	@Column(length=50) @Required
	String descripcion;
	
	@Money 
	BigDecimal precio;
	
	@Files 
	@Column(length=32) 
	String fotos;
	@TextArea 
	String observaciones;
}
