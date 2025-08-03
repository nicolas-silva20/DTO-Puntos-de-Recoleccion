package com.example.residuos.controller;

import com.example.residuos.dto.*;
import com.example.residuos.service.PuntoRecoleccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/puntos")
public class PuntoRecoleccionController {

	@Autowired
	private PuntoRecoleccionService service;

	@PostMapping
	public PuntoRecoleccionResponseDTO crear(@RequestBody PuntoRecoleccionCreateDTO dto) {
		return service.crear(dto);
	}

	@GetMapping
	public List<PuntoRecoleccionResponseDTO> obtenerTodos() {
		return service.obtenerTodos();
	}

	@GetMapping("/{id}")
	public PuntoRecoleccionResponseDTO obtenerPorId(@PathVariable Long id) {

		return service.obtenerPorId(id);
	}

	@PutMapping("/{id}")
	public PuntoRecoleccionResponseDTO actualizar(@PathVariable Long id, @RequestBody PuntoRecoleccionCreateDTO dto) {
		return service.actualizar(id, dto);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id) {
		service.eliminar(id);
	}

}