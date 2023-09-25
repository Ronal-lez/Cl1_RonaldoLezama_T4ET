package com.cibertec.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int idempleado;
private String  apellidos;
private String nombres;
private int edad;
private String sexo;
private int salario;

public Empleado() {
	// TODO Auto-generated constructor stub
}

public Empleado(int idempleado, String apellidos, String nombres, int edad, String sexo, int salario) {
	super();
	this.idempleado = idempleado;
	this.apellidos = apellidos;
	this.nombres = nombres;
	this.edad = edad;
	this.sexo = sexo;
	this.salario = salario;
}

public int getIdempleado() {
	return idempleado;
}

public void setIdempleado(int idempleado) {
	this.idempleado = idempleado;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public String getNombres() {
	return nombres;
}

public void setNombres(String nombres) {
	this.nombres = nombres;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public int getSalario() {
	return salario;
}

public void setSalario(int salario) {
	this.salario = salario;
}

}
