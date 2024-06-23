package com.prestamo.service;

import java.math.BigDecimal;
import java.util.List;

import com.prestamo.entity.Ejemplo;

public interface EjemploService {


	//Para Validaciones
	public abstract List<Ejemplo> listaEjemploPorDescripcionIgual(String descripcion);
	public abstract List<Ejemplo> listaEjemploPorDescripcionIgualActualiza(String descripcion, int idEjemplo);
	
	//Para el crud
	public abstract Ejemplo insertaActualizaEjemplo(Ejemplo obj);
	public abstract List<Ejemplo> listaEjemploPorDescripcionLike(String nombre);
	public abstract void eliminaEjemplo(int idRevista);
	public abstract List<Ejemplo> listaEjemplo();
	
	//Para la consulta
	public abstract List<Ejemplo> listaConsultaCompleja(String descripcion, int idPais, int estado, BigDecimal longitud, int idDias);
	
}
