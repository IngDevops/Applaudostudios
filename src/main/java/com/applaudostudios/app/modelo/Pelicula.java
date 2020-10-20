package com.applaudostudios.app.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Pelicula implements Serializable {

	private static final long serialVersionUID = 6133296160232512558L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long idPelicula;

	@Column
	private String titulo;

	@Column
	private String direccion;

	@Column
	private String produccion;

	@Column
	private long ano;

	@Column
	private String genero;

	@Column
	private String duracion;

	@Column
	private String sinopsis;

	@Column
	private long cantidad;

// Getters, Setters, HashCode, Equals & ToString Functions
	public Long getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Long idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getProduccion() {
		return produccion;
	}

	public void setProduccion(String produccion) {
		this.produccion = produccion;
	}

	public long getAno() {
		return ano;
	}

	public void setAno(long ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + idPelicula + ", titulo=" + titulo + ", direccion=" + direccion + ", produccion=" + produccion
				+ ", ano=" + ano + ", genero=" + genero + ", sinopsis" + sinopsis + ", cantidad=" + cantidad + "]";
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

}
