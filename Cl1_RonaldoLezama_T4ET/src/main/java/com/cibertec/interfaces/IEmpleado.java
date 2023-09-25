package com.cibertec.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.modelo.Empleado;

@Repository
public interface IEmpleado extends CrudRepository<Empleado, Integer> {

}
