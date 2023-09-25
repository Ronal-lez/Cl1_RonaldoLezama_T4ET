package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.interfaceService.IempleadoService;
import com.cibertec.interfaces.IEmpleado;
import com.cibertec.modelo.Empleado;

@Service
public class EmpleadoService implements IempleadoService{

	@Autowired
	private IEmpleado data;
	@Override
	public List<Empleado> listar() {
		
		return (List<Empleado>)data.findAll();
	}

	@Override
	public Optional<Empleado> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Empleado e) {
		int rest=0;
		Empleado empleado=data.save(e);
		if(!empleado.equals(null)) {
			rest=1;
		}
		return rest;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
