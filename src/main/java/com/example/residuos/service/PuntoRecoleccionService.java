package com.example.residuos.service;

import com.example.residuos.dto.*;
import com.example.residuos.entity.PuntoRecoleccion;
import com.example.residuos.mapper.PuntoRecoleccionMapper;
import com.example.residuos.repository.PuntoRecoleccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PuntoRecoleccionService {

	@Autowired
	private PuntoRecoleccionRepository repository;

	public PuntoRecoleccionResponseDTO crear(PuntoRecoleccionCreateDTO dto) {
		PuntoRecoleccion entidad = PuntoRecoleccionMapper.toEntity(dto);
		PuntoRecoleccion guardado = repository.save(entidad);
		return PuntoRecoleccionMapper.toResponse(guardado);
	}

	public List<PuntoRecoleccionResponseDTO> obtenerTodos() {
		return repository.findAll()
				.stream()
				.map(PuntoRecoleccionMapper::toResponse)
				.collect(Collectors.toList());
	}

	public PuntoRecoleccionResponseDTO obtenerPorId(Long id) {
		return repository.findById(id)
				.map(PuntoRecoleccionMapper::toResponse)
				.orElseThrow(() -> new RuntimeException("Punto no encontrado"));
	}

	public PuntoRecoleccionResponseDTO actualizar(Long id, PuntoRecoleccionCreateDTO dto) {
		PuntoRecoleccion existente = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Punto no encontrado"));

		PuntoRecoleccionMapper.actualizarEntidad(existente, dto);
		return PuntoRecoleccionMapper.toResponse(repository.save(existente));
	}

	public void eliminar(Long id) {
		if (!repository.existsById(id)) {
			throw new RuntimeException("Punto no encontrado");
		}
		repository.deleteById(id);
	}

}