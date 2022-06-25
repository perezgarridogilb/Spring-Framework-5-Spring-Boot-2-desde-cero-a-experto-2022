package com.bolsadeideas.springboot.form.app.models.domain;


import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
//import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.bolsadeideas.springboot.form.app.validation.IdentificadorRegex;
import com.bolsadeideas.springboot.form.app.validation.Requerido;


public class Usuario {
	
	//@Pattern(regexp = "[0-9]{2}[.][\\d]{3}[.][\\d]{3}[-][A-Z]{1}")
	@IdentificadorRegex()
	private String identificador;
	
	//@NotEmpty(message="El nombre no puede ser vacío")
	private String nombre;
	
	//@NotEmpty
	@Requerido
	private String apellido;

	@NotBlank
	@Size(min = 3, max = 8)
	private String username;
	
	@NotEmpty
	private String password;
	
	@Requerido
	@Email(message = "Correo con formato incorrecto")
	private String email;
	
	/**
	 * Notnull/NotBlank es para objetos, mientras no empty, es para el tipo String (para texto)
	 * int: primitivo
	 */
	@NotNull
	@Min(5)
	@Max(5000)
	private Integer cuenta;
	
	@NotNull
	@Past
	//@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaNacimiento;
	
	@NotEmpty
	private String pais;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Integer getCuenta() {
		return cuenta;
	}

	public void setCuenta(Integer cuenta) {
		this.cuenta = cuenta;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
