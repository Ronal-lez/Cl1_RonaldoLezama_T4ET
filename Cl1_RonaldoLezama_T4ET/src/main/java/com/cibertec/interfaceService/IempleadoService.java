package com.cibertec.interfaceService;

import java.util.List;
import java.util.Optional;

import com.cibertec.modelo.Empleado;

public interface IempleadoService {
public List<Empleado>listar();
public Optional<Empleado>listarId(int id);
public int save(Empleado e);
public void delete(int id);
}
